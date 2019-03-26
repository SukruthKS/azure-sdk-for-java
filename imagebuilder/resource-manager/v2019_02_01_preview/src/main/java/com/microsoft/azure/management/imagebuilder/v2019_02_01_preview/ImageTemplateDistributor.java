/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Generic distribution object.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ImageTemplateDistributor")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ManagedImage", value = ImageTemplateManagedImageDistributor.class),
    @JsonSubTypes.Type(name = "SharedImage", value = ImageTemplateSharedImageDistributor.class),
    @JsonSubTypes.Type(name = "VHD", value = ImageTemplateVhdDistributor.class)
})
public class ImageTemplateDistributor {
    /**
     * The name to be used for the associated RunOutput.
     */
    @JsonProperty(value = "runOutputName", required = true)
    private String runOutputName;

    /**
     * Tags that will be applied to the artifact once it has been
     * created/updated by the distributor.
     */
    @JsonProperty(value = "artifactTags")
    private Map<String, String> artifactTags;

    /**
     * Get the name to be used for the associated RunOutput.
     *
     * @return the runOutputName value
     */
    public String runOutputName() {
        return this.runOutputName;
    }

    /**
     * Set the name to be used for the associated RunOutput.
     *
     * @param runOutputName the runOutputName value to set
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withRunOutputName(String runOutputName) {
        this.runOutputName = runOutputName;
        return this;
    }

    /**
     * Get tags that will be applied to the artifact once it has been created/updated by the distributor.
     *
     * @return the artifactTags value
     */
    public Map<String, String> artifactTags() {
        return this.artifactTags;
    }

    /**
     * Set tags that will be applied to the artifact once it has been created/updated by the distributor.
     *
     * @param artifactTags the artifactTags value to set
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withArtifactTags(Map<String, String> artifactTags) {
        this.artifactTags = artifactTags;
        return this;
    }

}