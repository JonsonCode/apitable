import dayjs from 'dayjs';
import { useAtom } from 'jotai';
import Image from 'next/image';
import React, { useEffect, useMemo } from 'react';
import useInfiniteScroll from 'react-infinite-scroll-hook';
import { useSelector } from 'react-redux';
import { Box, IconButton, LinkButton, Loading, Typography, useTheme, useThemeColors } from '@apitable/components';
import { Strings, t, ThemeName } from '@apitable/core';
import { DownloadOutlined, LoadingOutlined, RefreshOutlined } from '@apitable/icons';
import {
  RobotRunHistoryItemDetail,
  useRunTaskDetail
} from 'pc/components/robot/robot_detail/robot_run_history/robot_run_history_item_detail';
import EmptyStateDarkImg from 'static/icon/datasheet/empty_state_dark.png';
import EmptyStateLightImg from 'static/icon/datasheet/empty_state_light.png';
import { useGetTaskHistory } from '../../../robot/robot_detail/robot_run_history';
import { automationHistoryAtom } from '../../controller';
import { CONST_DATETIME_FORMAT } from '../list';
import { TaskList } from '../list/task';
import { handleDownload } from '../list/util';
import { getAutomationRunHistoryDetail } from "../../../robot/api";

const CONST_STATUS_SUCCESS = 1;
const CONST_STATUS_FAIL = 2;
export const RunHistoryDetail = () => {
  const [currentHistoryState] = useAtom(automationHistoryAtom);

  const { reset, isLoadingData } =useGetTaskHistory();
  const { data } = useRunTaskDetail(currentHistoryState?.taskId ?? '');

  const dataItem = data?.data;
  const colors = useThemeColors();

  const nodes = dataItem?.executedNodeIds?.filter(r => !r.startsWith('atr'));

  const getTime = useMemo(() => {
    if(!dataItem) {
      return {
        start: undefined,
        end: undefined
      };
    }
    if(dataItem?.executedNodeIds?.length === 0 ){
      return {
        start: undefined,
        end: undefined
      };
    }
    const start = dataItem.nodeByIds[nodes[0]].startAt;
    const end = dataItem.nodeByIds[nodes[nodes.length - 1]].endAt;

    return {
      start: dayjs(start),
      end: dayjs(end)
    };
  }, [dataItem, nodes]);

  const resultText = useMemo(() => {
    if(data?.status === CONST_STATUS_SUCCESS) {
      return t(Strings.success);
    }
    if(data?.status === CONST_STATUS_FAIL) {
      return t(Strings.automation_run_fail);
    }
    return '';
  }, [data]);

  if(!currentHistoryState) return null;

  return (
    <Box flex={'0 0 54px'} display={'flex'} alignItems={'flex-start'} flexDirection={'row'} justifyContent={'space-between'}>
      <Box display={'flex'} flexDirection={'column'} alignItems={'start'}>
        <Typography variant="h5" color={colors.textCommonPrimary}>
          {t(Strings.robot_run_history_title)}
        </Typography>

        <Typography variant="body3" color={colors.textCommonTertiary}>
          {
            t(
              Strings.automation_run_history_item_description, {
                RESULT: resultText,
                NUM: getTime.start?.diff(getTime.end, 'second'),
                START_TIME: getTime.start?.format(CONST_DATETIME_FORMAT) ?? '',
                END_TIME: getTime.end?.format(CONST_DATETIME_FORMAT) ?? '',
              }
            )
          }
        </Typography>

      </Box>

      <Box display={'inline-flex'} >
        <LinkButton
          component="button" underline={false} prefixIcon={
            isLoadingData ? (
              <LoadingOutlined
                color={colors.textCommonTertiary}
                size={12} />
            ): (
              <RefreshOutlined
                color={colors.textCommonTertiary}
                size={12} />)}
          onClick={() => {
            reset();
          }}
        >
          <Typography variant="body3" color={colors.textCommonPrimary}>
            {
              t(Strings.automation_refresh)
            }
          </Typography>
        </LinkButton>

        <LinkButton component="button" underline={false} prefixIcon={<DownloadOutlined
          color={colors.textCommonTertiary}
          size={12} />}
        onClick={async () => {
          if(!currentHistoryState?.taskId) return;

          const result = await getAutomationRunHistoryDetail(currentHistoryState.taskId);
          handleDownload(result ?? {}, `automation_${currentHistoryState.taskId}.json`);
        }}
        >{
            <Typography variant="body3" color={colors.textCommonPrimary}>
              {

                t(Strings.download_log)
              }
            </Typography>
          }</LinkButton>
      </Box>
    </Box>
  );
};

export const HistoryModalContent = () => {
  const {
    items,
    isLoadingInitialData,
    setSize,
    isEmpty,
    size,
    isReachingEnd,
    error,
    canLoadMore,
    isLoadingMore,
  } = useGetTaskHistory();

  const [sentryRef, { rootRef }] = useInfiniteScroll({
    loading: isLoadingInitialData,
    hasNextPage: !isReachingEnd,
    onLoadMore: () => canLoadMore && setSize(size + 1),
    disabled: !!error,
    rootMargin: '0px 0px 32px 0px',
  });

  const themeName = useSelector(state => state.theme);
  const EmptyResultImage = themeName === ThemeName.Light ? EmptyStateLightImg : EmptyStateDarkImg;

  const [currentHistoryState, setCurrentHistoryState] = useAtom(automationHistoryAtom);
  const colors = useThemeColors();
  const theme = useTheme();

  useEffect(() => {
    if(!items.length) {
      return;
    }
    if(!currentHistoryState.taskId) {
      setCurrentHistoryState(d => {
        return {
          ...d,
          taskId: items[0].taskId
        };
      });
    }
  }, [setCurrentHistoryState, currentHistoryState, items]);

  return (
    <Box height={'500px'} display={'flex'} flexDirection={'row'}
      ref={rootRef}
    >
      <Box overflowY={'auto'}
        padding={'8px'}
        width={'256px'} flex={'0 0 256px'} backgroundColor={colors.bgCommonDefault}>
        <TaskList list={items} isSummary />

        {isEmpty && (
          <Image src={EmptyResultImage} alt="" />
        )}
        {
          isEmpty ? <Box
            display="flex"
            justifyContent="center"
          >
            <Typography variant="body2" color={theme.color.fc2}>{t(Strings.robot_run_history_no_data)}</Typography>
          </Box> : <Box
            ref={sentryRef}
            display="flex"
            alignItems="center"
            justifyContent="center"
            marginTop="16px"
          >
            {(isLoadingMore) &&
                      <Box display="flex">
                        <Loading />
                        <Typography
                          component="span"
                          variant="body4"
                          color={theme.color.fc2}
                        >
                          {
                            t(Strings.loading)
                          }
                        </Typography>
                      </Box>
            }
            {
              isReachingEnd &&
                      <Typography
                        component="span"
                        variant="body4"
                        color={theme.color.fc2}
                      >
                        {t(Strings.robot_run_history_bottom_tip)}
                      </Typography>
            }
          </Box>
        }

      </Box>

      <Box display={'flex'} flex={'1'} flexDirection={'column'}
        backgroundColor={colors.bgCommonLower}
        overflowY={'hidden'} padding={'16px'}>
        {
          currentHistoryState.taskId && (
            <>
              <RunHistoryDetail />
              <RobotRunHistoryItemDetail taskId={currentHistoryState.taskId} />
            </>
          )
        }
      </Box>
    </Box>
  );
};
