/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Distribute via Shared Image Gallery.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SharedImage")
public class ImageTemplateSharedImageDistributor extends ImageTemplateDistributor {
    /**
     * Resource Id of the Shared Image Gallery image.
     */
    @JsonProperty(value = "galleryImageId", required = true)
    private String galleryImageId;

    /**
     * The replicationRegions property.
     */
    @JsonProperty(value = "replicationRegions", required = true)
    private List<String> replicationRegions;

    /**
     * Get resource Id of the Shared Image Gallery image.
     *
     * @return the galleryImageId value
     */
    public String galleryImageId() {
        return this.galleryImageId;
    }

    /**
     * Set resource Id of the Shared Image Gallery image.
     *
     * @param galleryImageId the galleryImageId value to set
     * @return the ImageTemplateSharedImageDistributor object itself.
     */
    public ImageTemplateSharedImageDistributor withGalleryImageId(String galleryImageId) {
        this.galleryImageId = galleryImageId;
        return this;
    }

    /**
     * Get the replicationRegions value.
     *
     * @return the replicationRegions value
     */
    public List<String> replicationRegions() {
        return this.replicationRegions;
    }

    /**
     * Set the replicationRegions value.
     *
     * @param replicationRegions the replicationRegions value to set
     * @return the ImageTemplateSharedImageDistributor object itself.
     */
    public ImageTemplateSharedImageDistributor withReplicationRegions(List<String> replicationRegions) {
        this.replicationRegions = replicationRegions;
        return this;
    }

}