/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageIdCreateEntry model.
 */
public class ImageIdCreateEntry {
    /**
     * Id of the image.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * The tagIds property.
     */
    @JsonProperty(value = "tagIds")
    private List<UUID> tagIds;

    /**
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<Region> regions;

    /**
     * Get id of the image.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set id of the image.
     *
     * @param id the id value to set
     * @return the ImageIdCreateEntry object itself.
     */
    public ImageIdCreateEntry withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<UUID> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the ImageIdCreateEntry object itself.
     */
    public ImageIdCreateEntry withTagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<Region> regions() {
        return this.regions;
    }

    /**
     * Set the regions value.
     *
     * @param regions the regions value to set
     * @return the ImageIdCreateEntry object itself.
     */
    public ImageIdCreateEntry withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

}
