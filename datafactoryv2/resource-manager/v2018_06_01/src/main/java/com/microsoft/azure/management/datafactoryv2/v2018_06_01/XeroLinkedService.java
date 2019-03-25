/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Xero Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Xero")
@JsonFlatten
public class XeroLinkedService extends LinkedServiceInner {
    /**
     * The endpoint of the Xero server. (i.e. api.xero.com).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The consumer key associated with the Xero application.
     */
    @JsonProperty(value = "typeProperties.consumerKey")
    private SecretBase consumerKey;

    /**
     * The private key from the .pem file that was generated for your Xero
     * private application. You must include all the text from the .pem file,
     * including the Unix line endings(
     * ).
     */
    @JsonProperty(value = "typeProperties.privateKey")
    private SecretBase privateKey;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint of the Xero server. (i.e. api.xero.com).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the endpoint of the Xero server. (i.e. api.xero.com).
     *
     * @param host the host value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the consumer key associated with the Xero application.
     *
     * @return the consumerKey value
     */
    public SecretBase consumerKey() {
        return this.consumerKey;
    }

    /**
     * Set the consumer key associated with the Xero application.
     *
     * @param consumerKey the consumerKey value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withConsumerKey(SecretBase consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * Get the private key from the .pem file that was generated for your Xero private application. You must include all the text from the .pem file, including the Unix line endings(
     ).
     *
     * @return the privateKey value
     */
    public SecretBase privateKey() {
        return this.privateKey;
    }

    /**
     * Set the private key from the .pem file that was generated for your Xero private application. You must include all the text from the .pem file, including the Unix line endings(
     ).
     *
     * @param privateKey the privateKey value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withPrivateKey(SecretBase privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
