package com.apitable.automation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Update robot request.
 */
@Data
@Schema(description = "Update robot request")
public class UpdateRobotRO {
    @Schema(description = "robot name", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "test")
    private String name;

    @Schema(description = "robot description", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "test")
    private String description;

    @Schema(description = "robot property", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "{}")
    private AutomationPropertyRO props;


    @Schema(description = "Whether to modify the node name synchronously", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "false")
    private Boolean modifyNodeName = false;

    /**
     * Automation property ro.
     */
    @Data
    public static class AutomationPropertyRO {
        @Schema(description = "Run failure to send notification", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "false")
        private Boolean failureNotifyEnable;
    }
}
