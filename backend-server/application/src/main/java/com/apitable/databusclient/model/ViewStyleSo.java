/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.apitable.databusclient.model.AnyBaseField;
import com.apitable.databusclient.model.GanttColorOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * ViewStyleSo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewStyleSo {
  public static final String SERIALIZED_NAME_AUTO_TASK_LAYOUT = "autoTaskLayout";
  @SerializedName(SERIALIZED_NAME_AUTO_TASK_LAYOUT)
  private Boolean autoTaskLayout;

  public static final String SERIALIZED_NAME_CARD_COUNT = "cardCount";
  @SerializedName(SERIALIZED_NAME_CARD_COUNT)
  private Integer cardCount;

  public static final String SERIALIZED_NAME_COLOR_OPTION = "colorOption";
  @SerializedName(SERIALIZED_NAME_COLOR_OPTION)
  private GanttColorOption colorOption;

  public static final String SERIALIZED_NAME_COVER_FIELD_ID = "coverFieldId";
  @SerializedName(SERIALIZED_NAME_COVER_FIELD_ID)
  private String coverFieldId;

  public static final String SERIALIZED_NAME_END_FIELD_ID = "endFieldId";
  @SerializedName(SERIALIZED_NAME_END_FIELD_ID)
  private String endFieldId;

  public static final String SERIALIZED_NAME_HIDDEN_GROUP_MAP = "hiddenGroupMap";
  @SerializedName(SERIALIZED_NAME_HIDDEN_GROUP_MAP)
  private Map<String, Boolean> hiddenGroupMap;

  public static final String SERIALIZED_NAME_HORIZONTAL = "horizontal";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL)
  private Boolean horizontal;

  public static final String SERIALIZED_NAME_IS_AUTO_LAYOUT = "isAutoLayout";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_LAYOUT)
  private Boolean isAutoLayout;

  public static final String SERIALIZED_NAME_IS_COL_NAME_VISIBLE = "isColNameVisible";
  @SerializedName(SERIALIZED_NAME_IS_COL_NAME_VISIBLE)
  private Boolean isColNameVisible;

  public static final String SERIALIZED_NAME_IS_COVER_FIT = "isCoverFit";
  @SerializedName(SERIALIZED_NAME_IS_COVER_FIT)
  private Boolean isCoverFit;

  public static final String SERIALIZED_NAME_KANBAN_FIELD_ID = "kanbanFieldId";
  @SerializedName(SERIALIZED_NAME_KANBAN_FIELD_ID)
  private String kanbanFieldId;

  public static final String SERIALIZED_NAME_LAYOUT_TYPE = "layoutType";
  @SerializedName(SERIALIZED_NAME_LAYOUT_TYPE)
  private AnyBaseField layoutType;

  public static final String SERIALIZED_NAME_LINK_FIELD_ID = "linkFieldId";
  @SerializedName(SERIALIZED_NAME_LINK_FIELD_ID)
  private String linkFieldId;

  public static final String SERIALIZED_NAME_ONLY_CALC_WORK_DAY = "onlyCalcWorkDay";
  @SerializedName(SERIALIZED_NAME_ONLY_CALC_WORK_DAY)
  private Boolean onlyCalcWorkDay;

  public static final String SERIALIZED_NAME_START_FIELD_ID = "startFieldId";
  @SerializedName(SERIALIZED_NAME_START_FIELD_ID)
  private String startFieldId;

  public static final String SERIALIZED_NAME_WORK_DAYS = "workDays";
  @SerializedName(SERIALIZED_NAME_WORK_DAYS)
  private List<Integer> workDays;

  public ViewStyleSo() {
  }

  public ViewStyleSo autoTaskLayout(Boolean autoTaskLayout) {
    
    this.autoTaskLayout = autoTaskLayout;
    return this;
  }

   /**
   * Get autoTaskLayout
   * @return autoTaskLayout
  **/
  @javax.annotation.Nullable
  public Boolean getAutoTaskLayout() {
    return autoTaskLayout;
  }


  public void setAutoTaskLayout(Boolean autoTaskLayout) {
    this.autoTaskLayout = autoTaskLayout;
  }


  public ViewStyleSo cardCount(Integer cardCount) {
    
    this.cardCount = cardCount;
    return this;
  }

   /**
   * Get cardCount
   * @return cardCount
  **/
  @javax.annotation.Nullable
  public Integer getCardCount() {
    return cardCount;
  }


  public void setCardCount(Integer cardCount) {
    this.cardCount = cardCount;
  }


  public ViewStyleSo colorOption(GanttColorOption colorOption) {
    
    this.colorOption = colorOption;
    return this;
  }

   /**
   * Get colorOption
   * @return colorOption
  **/
  @javax.annotation.Nullable
  public GanttColorOption getColorOption() {
    return colorOption;
  }


  public void setColorOption(GanttColorOption colorOption) {
    this.colorOption = colorOption;
  }


  public ViewStyleSo coverFieldId(String coverFieldId) {
    
    this.coverFieldId = coverFieldId;
    return this;
  }

   /**
   * Get coverFieldId
   * @return coverFieldId
  **/
  @javax.annotation.Nullable
  public String getCoverFieldId() {
    return coverFieldId;
  }


  public void setCoverFieldId(String coverFieldId) {
    this.coverFieldId = coverFieldId;
  }


  public ViewStyleSo endFieldId(String endFieldId) {
    
    this.endFieldId = endFieldId;
    return this;
  }

   /**
   * Get endFieldId
   * @return endFieldId
  **/
  @javax.annotation.Nullable
  public String getEndFieldId() {
    return endFieldId;
  }


  public void setEndFieldId(String endFieldId) {
    this.endFieldId = endFieldId;
  }


  public ViewStyleSo hiddenGroupMap(Map<String, Boolean> hiddenGroupMap) {
    
    this.hiddenGroupMap = hiddenGroupMap;
    return this;
  }

  public ViewStyleSo putHiddenGroupMapItem(String key, Boolean hiddenGroupMapItem) {
    if (this.hiddenGroupMap == null) {
      this.hiddenGroupMap = new HashMap<>();
    }
    this.hiddenGroupMap.put(key, hiddenGroupMapItem);
    return this;
  }

   /**
   * Get hiddenGroupMap
   * @return hiddenGroupMap
  **/
  @javax.annotation.Nullable
  public Map<String, Boolean> getHiddenGroupMap() {
    return hiddenGroupMap;
  }


  public void setHiddenGroupMap(Map<String, Boolean> hiddenGroupMap) {
    this.hiddenGroupMap = hiddenGroupMap;
  }


  public ViewStyleSo horizontal(Boolean horizontal) {
    
    this.horizontal = horizontal;
    return this;
  }

   /**
   * Get horizontal
   * @return horizontal
  **/
  @javax.annotation.Nullable
  public Boolean getHorizontal() {
    return horizontal;
  }


  public void setHorizontal(Boolean horizontal) {
    this.horizontal = horizontal;
  }


  public ViewStyleSo isAutoLayout(Boolean isAutoLayout) {
    
    this.isAutoLayout = isAutoLayout;
    return this;
  }

   /**
   * Get isAutoLayout
   * @return isAutoLayout
  **/
  @javax.annotation.Nullable
  public Boolean getIsAutoLayout() {
    return isAutoLayout;
  }


  public void setIsAutoLayout(Boolean isAutoLayout) {
    this.isAutoLayout = isAutoLayout;
  }


  public ViewStyleSo isColNameVisible(Boolean isColNameVisible) {
    
    this.isColNameVisible = isColNameVisible;
    return this;
  }

   /**
   * Get isColNameVisible
   * @return isColNameVisible
  **/
  @javax.annotation.Nullable
  public Boolean getIsColNameVisible() {
    return isColNameVisible;
  }


  public void setIsColNameVisible(Boolean isColNameVisible) {
    this.isColNameVisible = isColNameVisible;
  }


  public ViewStyleSo isCoverFit(Boolean isCoverFit) {
    
    this.isCoverFit = isCoverFit;
    return this;
  }

   /**
   * Get isCoverFit
   * @return isCoverFit
  **/
  @javax.annotation.Nullable
  public Boolean getIsCoverFit() {
    return isCoverFit;
  }


  public void setIsCoverFit(Boolean isCoverFit) {
    this.isCoverFit = isCoverFit;
  }


  public ViewStyleSo kanbanFieldId(String kanbanFieldId) {
    
    this.kanbanFieldId = kanbanFieldId;
    return this;
  }

   /**
   * Get kanbanFieldId
   * @return kanbanFieldId
  **/
  @javax.annotation.Nullable
  public String getKanbanFieldId() {
    return kanbanFieldId;
  }


  public void setKanbanFieldId(String kanbanFieldId) {
    this.kanbanFieldId = kanbanFieldId;
  }


  public ViewStyleSo layoutType(AnyBaseField layoutType) {
    
    this.layoutType = layoutType;
    return this;
  }

   /**
   * Get layoutType
   * @return layoutType
  **/
  @javax.annotation.Nullable
  public AnyBaseField getLayoutType() {
    return layoutType;
  }


  public void setLayoutType(AnyBaseField layoutType) {
    this.layoutType = layoutType;
  }


  public ViewStyleSo linkFieldId(String linkFieldId) {
    
    this.linkFieldId = linkFieldId;
    return this;
  }

   /**
   * Get linkFieldId
   * @return linkFieldId
  **/
  @javax.annotation.Nullable
  public String getLinkFieldId() {
    return linkFieldId;
  }


  public void setLinkFieldId(String linkFieldId) {
    this.linkFieldId = linkFieldId;
  }


  public ViewStyleSo onlyCalcWorkDay(Boolean onlyCalcWorkDay) {
    
    this.onlyCalcWorkDay = onlyCalcWorkDay;
    return this;
  }

   /**
   * Get onlyCalcWorkDay
   * @return onlyCalcWorkDay
  **/
  @javax.annotation.Nullable
  public Boolean getOnlyCalcWorkDay() {
    return onlyCalcWorkDay;
  }


  public void setOnlyCalcWorkDay(Boolean onlyCalcWorkDay) {
    this.onlyCalcWorkDay = onlyCalcWorkDay;
  }


  public ViewStyleSo startFieldId(String startFieldId) {
    
    this.startFieldId = startFieldId;
    return this;
  }

   /**
   * Get startFieldId
   * @return startFieldId
  **/
  @javax.annotation.Nullable
  public String getStartFieldId() {
    return startFieldId;
  }


  public void setStartFieldId(String startFieldId) {
    this.startFieldId = startFieldId;
  }


  public ViewStyleSo workDays(List<Integer> workDays) {
    
    this.workDays = workDays;
    return this;
  }

  public ViewStyleSo addWorkDaysItem(Integer workDaysItem) {
    if (this.workDays == null) {
      this.workDays = new ArrayList<>();
    }
    this.workDays.add(workDaysItem);
    return this;
  }

   /**
   * Get workDays
   * @return workDays
  **/
  @javax.annotation.Nullable
  public List<Integer> getWorkDays() {
    return workDays;
  }


  public void setWorkDays(List<Integer> workDays) {
    this.workDays = workDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewStyleSo viewStyleSo = (ViewStyleSo) o;
    return Objects.equals(this.autoTaskLayout, viewStyleSo.autoTaskLayout) &&
        Objects.equals(this.cardCount, viewStyleSo.cardCount) &&
        Objects.equals(this.colorOption, viewStyleSo.colorOption) &&
        Objects.equals(this.coverFieldId, viewStyleSo.coverFieldId) &&
        Objects.equals(this.endFieldId, viewStyleSo.endFieldId) &&
        Objects.equals(this.hiddenGroupMap, viewStyleSo.hiddenGroupMap) &&
        Objects.equals(this.horizontal, viewStyleSo.horizontal) &&
        Objects.equals(this.isAutoLayout, viewStyleSo.isAutoLayout) &&
        Objects.equals(this.isColNameVisible, viewStyleSo.isColNameVisible) &&
        Objects.equals(this.isCoverFit, viewStyleSo.isCoverFit) &&
        Objects.equals(this.kanbanFieldId, viewStyleSo.kanbanFieldId) &&
        Objects.equals(this.layoutType, viewStyleSo.layoutType) &&
        Objects.equals(this.linkFieldId, viewStyleSo.linkFieldId) &&
        Objects.equals(this.onlyCalcWorkDay, viewStyleSo.onlyCalcWorkDay) &&
        Objects.equals(this.startFieldId, viewStyleSo.startFieldId) &&
        Objects.equals(this.workDays, viewStyleSo.workDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTaskLayout, cardCount, colorOption, coverFieldId, endFieldId, hiddenGroupMap, horizontal, isAutoLayout, isColNameVisible, isCoverFit, kanbanFieldId, layoutType, linkFieldId, onlyCalcWorkDay, startFieldId, workDays);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewStyleSo {\n");
    sb.append("    autoTaskLayout: ").append(toIndentedString(autoTaskLayout)).append("\n");
    sb.append("    cardCount: ").append(toIndentedString(cardCount)).append("\n");
    sb.append("    colorOption: ").append(toIndentedString(colorOption)).append("\n");
    sb.append("    coverFieldId: ").append(toIndentedString(coverFieldId)).append("\n");
    sb.append("    endFieldId: ").append(toIndentedString(endFieldId)).append("\n");
    sb.append("    hiddenGroupMap: ").append(toIndentedString(hiddenGroupMap)).append("\n");
    sb.append("    horizontal: ").append(toIndentedString(horizontal)).append("\n");
    sb.append("    isAutoLayout: ").append(toIndentedString(isAutoLayout)).append("\n");
    sb.append("    isColNameVisible: ").append(toIndentedString(isColNameVisible)).append("\n");
    sb.append("    isCoverFit: ").append(toIndentedString(isCoverFit)).append("\n");
    sb.append("    kanbanFieldId: ").append(toIndentedString(kanbanFieldId)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    linkFieldId: ").append(toIndentedString(linkFieldId)).append("\n");
    sb.append("    onlyCalcWorkDay: ").append(toIndentedString(onlyCalcWorkDay)).append("\n");
    sb.append("    startFieldId: ").append(toIndentedString(startFieldId)).append("\n");
    sb.append("    workDays: ").append(toIndentedString(workDays)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("autoTaskLayout");
    openapiFields.add("cardCount");
    openapiFields.add("colorOption");
    openapiFields.add("coverFieldId");
    openapiFields.add("endFieldId");
    openapiFields.add("hiddenGroupMap");
    openapiFields.add("horizontal");
    openapiFields.add("isAutoLayout");
    openapiFields.add("isColNameVisible");
    openapiFields.add("isCoverFit");
    openapiFields.add("kanbanFieldId");
    openapiFields.add("layoutType");
    openapiFields.add("linkFieldId");
    openapiFields.add("onlyCalcWorkDay");
    openapiFields.add("startFieldId");
    openapiFields.add("workDays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ViewStyleSo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ViewStyleSo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewStyleSo is not found in the empty JSON string", ViewStyleSo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewStyleSo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewStyleSo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `colorOption`
      if (jsonObj.get("colorOption") != null && !jsonObj.get("colorOption").isJsonNull()) {
        GanttColorOption.validateJsonElement(jsonObj.get("colorOption"));
      }
      if ((jsonObj.get("coverFieldId") != null && !jsonObj.get("coverFieldId").isJsonNull()) && !jsonObj.get("coverFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverFieldId").toString()));
      }
      if ((jsonObj.get("endFieldId") != null && !jsonObj.get("endFieldId").isJsonNull()) && !jsonObj.get("endFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endFieldId").toString()));
      }
      if ((jsonObj.get("kanbanFieldId") != null && !jsonObj.get("kanbanFieldId").isJsonNull()) && !jsonObj.get("kanbanFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kanbanFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kanbanFieldId").toString()));
      }
      // validate the optional field `layoutType`
      if (jsonObj.get("layoutType") != null && !jsonObj.get("layoutType").isJsonNull()) {
        AnyBaseField.validateJsonElement(jsonObj.get("layoutType"));
      }
      if ((jsonObj.get("linkFieldId") != null && !jsonObj.get("linkFieldId").isJsonNull()) && !jsonObj.get("linkFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkFieldId").toString()));
      }
      if ((jsonObj.get("startFieldId") != null && !jsonObj.get("startFieldId").isJsonNull()) && !jsonObj.get("startFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startFieldId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workDays") != null && !jsonObj.get("workDays").isJsonNull() && !jsonObj.get("workDays").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workDays` to be an array in the JSON string but got `%s`", jsonObj.get("workDays").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewStyleSo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewStyleSo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewStyleSo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewStyleSo.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewStyleSo>() {
           @Override
           public void write(JsonWriter out, ViewStyleSo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewStyleSo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewStyleSo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewStyleSo
  * @throws IOException if the JSON string is invalid with respect to ViewStyleSo
  */
  public static ViewStyleSo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewStyleSo.class);
  }

 /**
  * Convert an instance of ViewStyleSo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

