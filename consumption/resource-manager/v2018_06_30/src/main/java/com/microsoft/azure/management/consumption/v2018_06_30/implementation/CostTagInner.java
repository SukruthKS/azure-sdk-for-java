/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import java.util.List;
import com.microsoft.azure.management.consumption.v2018_06_30.CostTagProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A cost tag resource.
 */
@JsonFlatten
public class CostTagInner extends ProxyResource {
    /**
     * Cost tags.
     */
    @JsonProperty(value = "properties.costTags")
    private List<CostTagProperties> costTags;

    /**
     * eTag of the resource. To handle concurrent update scenario, this field
     * will be used to determine whether the user is updating the latest
     * version or not.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get cost tags.
     *
     * @return the costTags value
     */
    public List<CostTagProperties> costTags() {
        return this.costTags;
    }

    /**
     * Set cost tags.
     *
     * @param costTags the costTags value to set
     * @return the CostTagInner object itself.
     */
    public CostTagInner withCostTags(List<CostTagProperties> costTags) {
        this.costTags = costTags;
        return this;
    }

    /**
     * Get eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @param eTag the eTag value to set
     * @return the CostTagInner object itself.
     */
    public CostTagInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}