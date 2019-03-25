/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Active Directory Key Credential information.
 */
public class KeyCredentialInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Start date.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * End date.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * Key value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Key ID.
     */
    @JsonProperty(value = "keyId")
    private String keyId;

    /**
     * Usage. Acceptable values are 'Verify' and 'Sign'.
     */
    @JsonProperty(value = "usage")
    private String usage;

    /**
     * Type. Acceptable values are 'AsymmetricX509Cert' and 'Symmetric'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Custom Key Identifier.
     */
    @JsonProperty(value = "customKeyIdentifier")
    private String customKeyIdentifier;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get start date.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set start date.
     *
     * @param startDate the startDate value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get end date.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set end date.
     *
     * @param endDate the endDate value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get key value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set key value.
     *
     * @param value the value value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get key ID.
     *
     * @return the keyId value
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set key ID.
     *
     * @param keyId the keyId value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get usage. Acceptable values are 'Verify' and 'Sign'.
     *
     * @return the usage value
     */
    public String usage() {
        return this.usage;
    }

    /**
     * Set usage. Acceptable values are 'Verify' and 'Sign'.
     *
     * @param usage the usage value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get type. Acceptable values are 'AsymmetricX509Cert' and 'Symmetric'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type. Acceptable values are 'AsymmetricX509Cert' and 'Symmetric'.
     *
     * @param type the type value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get custom Key Identifier.
     *
     * @return the customKeyIdentifier value
     */
    public String customKeyIdentifier() {
        return this.customKeyIdentifier;
    }

    /**
     * Set custom Key Identifier.
     *
     * @param customKeyIdentifier the customKeyIdentifier value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withCustomKeyIdentifier(String customKeyIdentifier) {
        this.customKeyIdentifier = customKeyIdentifier;
        return this;
    }

}
