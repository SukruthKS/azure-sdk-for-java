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
 * The request payload of get SSIS object metadata.
 */
public class GetSsisObjectMetadataRequest {
    /**
     * Metadata path.
     */
    @JsonProperty(value = "metadataPath")
    private String metadataPath;

    /**
     * Get metadata path.
     *
     * @return the metadataPath value
     */
    public String metadataPath() {
        return this.metadataPath;
    }

    /**
     * Set metadata path.
     *
     * @param metadataPath the metadataPath value to set
     * @return the GetSsisObjectMetadataRequest object itself.
     */
    public GetSsisObjectMetadataRequest withMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
        return this;
    }

}
