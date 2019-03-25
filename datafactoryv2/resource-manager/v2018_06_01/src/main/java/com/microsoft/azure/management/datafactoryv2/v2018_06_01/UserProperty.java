/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User property.
 */
public class UserProperty {
    /**
     * User property name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * User property value. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get user property name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set user property name.
     *
     * @param name the name value to set
     * @return the UserProperty object itself.
     */
    public UserProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get user property value. Type: string (or Expression with resultType string).
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set user property value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set
     * @return the UserProperty object itself.
     */
    public UserProperty withValue(Object value) {
        this.value = value;
        return this;
    }

}
