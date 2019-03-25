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
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Linked service for SAP ERP Central Component(SAP ECC).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapEcc")
@JsonFlatten
public class SapEccLinkedService extends LinkedServiceInner {
    /**
     * The URL of SAP ECC OData API. For example,
     * '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private String url;

    /**
     * The username for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private String username;

    /**
     * The password for Basic authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either
     * encryptedCredential or username/password must be provided. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Get the URL of SAP ECC OData API. For example, '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the URL of SAP ECC OData API. For example, '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password for Basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password for Basic authentication.
     *
     * @param password the password value to set
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
