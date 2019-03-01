/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service based exception details.
 */
public class ARMExceptionDetails {
    /**
     * Gets service error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Gets error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Gets possible cause for error.
     */
    @JsonProperty(value = "possibleCauses")
    private String possibleCauses;

    /**
     * Gets recommended action for the error.
     */
    @JsonProperty(value = "recommendedAction")
    private String recommendedAction;

    /**
     * Gets the client request Id for the session.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /**
     * Gets the activity Id for the session.
     */
    @JsonProperty(value = "activityId")
    private String activityId;

    /**
     * Gets exception target.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get gets service error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set gets service error code.
     *
     * @param code the code value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get gets error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set gets error message.
     *
     * @param message the message value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get gets possible cause for error.
     *
     * @return the possibleCauses value
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Set gets possible cause for error.
     *
     * @param possibleCauses the possibleCauses value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withPossibleCauses(String possibleCauses) {
        this.possibleCauses = possibleCauses;
        return this;
    }

    /**
     * Get gets recommended action for the error.
     *
     * @return the recommendedAction value
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set gets recommended action for the error.
     *
     * @param recommendedAction the recommendedAction value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Get gets the client request Id for the session.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set gets the client request Id for the session.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get gets the activity Id for the session.
     *
     * @return the activityId value
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Set gets the activity Id for the session.
     *
     * @param activityId the activityId value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * Get gets exception target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set gets exception target.
     *
     * @param target the target value to set
     * @return the ARMExceptionDetails object itself.
     */
    public ARMExceptionDetails withTarget(String target) {
        this.target = target;
        return this;
    }

}
