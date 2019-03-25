/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DatasetInner;

/**
 * The path of the SAP Cloud for Customer OData entity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomerResource")
@JsonFlatten
public class SapCloudForCustomerResourceDataset extends DatasetInner {
    /**
     * The path of the SAP Cloud for Customer OData entity. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path", required = true)
    private Object path;

    /**
     * Get the path of the SAP Cloud for Customer OData entity. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path of the SAP Cloud for Customer OData entity. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the SapCloudForCustomerResourceDataset object itself.
     */
    public SapCloudForCustomerResourceDataset withPath(Object path) {
        this.path = path;
        return this;
    }

}
