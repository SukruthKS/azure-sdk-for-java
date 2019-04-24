/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PATCH Body schema for Update Qna List.
 */
public class UpdateQnaDTO {
    /**
     * Unique id for the Q-A.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Answer text.
     */
    @JsonProperty(value = "answer")
    private String answer;

    /**
     * Source from which Q-A was indexed. eg.
     * https://docs.microsoft.com/en-us/azure/cognitive-services/QnAMaker/FAQs.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * List of questions associated with the answer.
     */
    @JsonProperty(value = "questions")
    private UpdateQnaDTOQuestions questions;

    /**
     * List of metadata associated with the answer to be updated.
     */
    @JsonProperty(value = "metadata")
    private UpdateQnaDTOMetadata metadata;

    /**
     * Context associated with Qna to be updated.
     */
    @JsonProperty(value = "context")
    private UpdateQnaDTOContext context;

    /**
     * Get unique id for the Q-A.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set unique id for the Q-A.
     *
     * @param id the id value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get answer text.
     *
     * @return the answer value
     */
    public String answer() {
        return this.answer;
    }

    /**
     * Set answer text.
     *
     * @param answer the answer value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Get source from which Q-A was indexed. eg. https://docs.microsoft.com/en-us/azure/cognitive-services/QnAMaker/FAQs.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set source from which Q-A was indexed. eg. https://docs.microsoft.com/en-us/azure/cognitive-services/QnAMaker/FAQs.
     *
     * @param source the source value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get list of questions associated with the answer.
     *
     * @return the questions value
     */
    public UpdateQnaDTOQuestions questions() {
        return this.questions;
    }

    /**
     * Set list of questions associated with the answer.
     *
     * @param questions the questions value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withQuestions(UpdateQnaDTOQuestions questions) {
        this.questions = questions;
        return this;
    }

    /**
     * Get list of metadata associated with the answer to be updated.
     *
     * @return the metadata value
     */
    public UpdateQnaDTOMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set list of metadata associated with the answer to be updated.
     *
     * @param metadata the metadata value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withMetadata(UpdateQnaDTOMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get context associated with Qna to be updated.
     *
     * @return the context value
     */
    public UpdateQnaDTOContext context() {
        return this.context;
    }

    /**
     * Set context associated with Qna to be updated.
     *
     * @param context the context value to set
     * @return the UpdateQnaDTO object itself.
     */
    public UpdateQnaDTO withContext(UpdateQnaDTOContext context) {
        this.context = context;
        return this;
    }

}
