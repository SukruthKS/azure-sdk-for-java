/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * A setting difference between two deployment slots of an app.
 */
@JsonFlatten
public class SlotDifferenceInner extends ProxyOnlyResource {
    /**
     * Level of the difference: Information, Warning or Error.
     */
    @JsonProperty(value = "properties.level", access = JsonProperty.Access.WRITE_ONLY)
    private String level;

    /**
     * The type of the setting: General, AppSetting or ConnectionString.
     */
    @JsonProperty(value = "properties.settingType", access = JsonProperty.Access.WRITE_ONLY)
    private String settingType;

    /**
     * Rule that describes how to process the setting difference during a slot
     * swap.
     */
    @JsonProperty(value = "properties.diffRule", access = JsonProperty.Access.WRITE_ONLY)
    private String diffRule;

    /**
     * Name of the setting.
     */
    @JsonProperty(value = "properties.settingName", access = JsonProperty.Access.WRITE_ONLY)
    private String settingName;

    /**
     * Value of the setting in the current slot.
     */
    @JsonProperty(value = "properties.valueInCurrentSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String valueInCurrentSlot;

    /**
     * Value of the setting in the target slot.
     */
    @JsonProperty(value = "properties.valueInTargetSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String valueInTargetSlot;

    /**
     * Description of the setting difference.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public String level() {
        return this.level;
    }

    /**
     * Get the settingType value.
     *
     * @return the settingType value
     */
    public String settingType() {
        return this.settingType;
    }

    /**
     * Get the diffRule value.
     *
     * @return the diffRule value
     */
    public String diffRule() {
        return this.diffRule;
    }

    /**
     * Get the settingName value.
     *
     * @return the settingName value
     */
    public String settingName() {
        return this.settingName;
    }

    /**
     * Get the valueInCurrentSlot value.
     *
     * @return the valueInCurrentSlot value
     */
    public String valueInCurrentSlot() {
        return this.valueInCurrentSlot;
    }

    /**
     * Get the valueInTargetSlot value.
     *
     * @return the valueInTargetSlot value
     */
    public String valueInTargetSlot() {
        return this.valueInTargetSlot;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}