/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.microsoft.azure.management.postgresql.v2017_12_01.Sku;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerVersion;
import com.microsoft.azure.management.postgresql.v2017_12_01.SslEnforcementEnum;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.postgresql.v2017_12_01.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents a server.
 */
@JsonFlatten
public class ServerInner extends Resource {
    /**
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /**
     * Server version. Possible values include: '9.5', '9.6'.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /**
     * Enable ssl enforcement or not when connect to server. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /**
     * A state of a server that is visible to user. Possible values include:
     * 'Ready', 'Dropping', 'Disabled'.
     */
    @JsonProperty(value = "properties.userVisibleState")
    private ServerState userVisibleState;

    /**
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName")
    private String fullyQualifiedDomainName;

    /**
     * Earliest restore point creation time (ISO8601 format).
     */
    @JsonProperty(value = "properties.earliestRestoreDate")
    private DateTime earliestRestoreDate;

    /**
     * Storage profile of a server.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the administratorLogin value.
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin value.
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sslEnforcement value.
     *
     * @return the sslEnforcement value
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set the sslEnforcement value.
     *
     * @param sslEnforcement the sslEnforcement value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get the userVisibleState value.
     *
     * @return the userVisibleState value
     */
    public ServerState userVisibleState() {
        return this.userVisibleState;
    }

    /**
     * Set the userVisibleState value.
     *
     * @param userVisibleState the userVisibleState value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withUserVisibleState(ServerState userVisibleState) {
        this.userVisibleState = userVisibleState;
        return this;
    }

    /**
     * Get the fullyQualifiedDomainName value.
     *
     * @return the fullyQualifiedDomainName value
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Set the fullyQualifiedDomainName value.
     *
     * @param fullyQualifiedDomainName the fullyQualifiedDomainName value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * Get the earliestRestoreDate value.
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Set the earliestRestoreDate value.
     *
     * @param earliestRestoreDate the earliestRestoreDate value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withEarliestRestoreDate(DateTime earliestRestoreDate) {
        this.earliestRestoreDate = earliestRestoreDate;
        return this;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

}