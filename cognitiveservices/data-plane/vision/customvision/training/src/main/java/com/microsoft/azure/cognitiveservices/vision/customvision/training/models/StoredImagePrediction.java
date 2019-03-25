/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * result of an image classification request.
 */
public class StoredImagePrediction {
    /**
     * The URI to the (resized) prediction image.
     */
    @JsonProperty(value = "resizedImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resizedImageUri;

    /**
     * The URI to the thumbnail of the original prediction image.
     */
    @JsonProperty(value = "thumbnailUri", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUri;

    /**
     * The URI to the original prediction image.
     */
    @JsonProperty(value = "originalImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String originalImageUri;

    /**
     * Domain used for the prediction.
     */
    @JsonProperty(value = "domain", access = JsonProperty.Access.WRITE_ONLY)
    private UUID domain;

    /**
     * Prediction Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Project Id.
     */
    @JsonProperty(value = "project", access = JsonProperty.Access.WRITE_ONLY)
    private UUID project;

    /**
     * Iteration Id.
     */
    @JsonProperty(value = "iteration", access = JsonProperty.Access.WRITE_ONLY)
    private UUID iteration;

    /**
     * Date this prediction was created.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * List of predictions.
     */
    @JsonProperty(value = "predictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Prediction> predictions;

    /**
     * Get the URI to the (resized) prediction image.
     *
     * @return the resizedImageUri value
     */
    public String resizedImageUri() {
        return this.resizedImageUri;
    }

    /**
     * Get the URI to the thumbnail of the original prediction image.
     *
     * @return the thumbnailUri value
     */
    public String thumbnailUri() {
        return this.thumbnailUri;
    }

    /**
     * Get the URI to the original prediction image.
     *
     * @return the originalImageUri value
     */
    public String originalImageUri() {
        return this.originalImageUri;
    }

    /**
     * Get domain used for the prediction.
     *
     * @return the domain value
     */
    public UUID domain() {
        return this.domain;
    }

    /**
     * Get prediction Id.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get project Id.
     *
     * @return the project value
     */
    public UUID project() {
        return this.project;
    }

    /**
     * Get iteration Id.
     *
     * @return the iteration value
     */
    public UUID iteration() {
        return this.iteration;
    }

    /**
     * Get date this prediction was created.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get list of predictions.
     *
     * @return the predictions value
     */
    public List<Prediction> predictions() {
        return this.predictions;
    }

}
