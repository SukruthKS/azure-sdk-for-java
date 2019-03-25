/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU that defines the tier and kind of the peering.
 */
public class PeeringSku {
    /**
     * The name of the peering SKU. Possible values include:
     * 'Basic_Exchange_Free', 'Basic_Direct_Free', 'Premium_Direct_Free',
     * 'Premium_Exchange_Metered'.
     */
    @JsonProperty(value = "name")
    private Name name;

    /**
     * The tier of the peering SKU. Possible values include: 'Basic',
     * 'Premium'.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /**
     * The family of the peering SKU. Possible values include: 'Direct',
     * 'Exchange'.
     */
    @JsonProperty(value = "family")
    private Family family;

    /**
     * The size of the peering SKU. Possible values include: 'Free', 'Metered',
     * 'Unlimited'.
     */
    @JsonProperty(value = "size")
    private Size size;

    /**
     * Get the name of the peering SKU. Possible values include: 'Basic_Exchange_Free', 'Basic_Direct_Free', 'Premium_Direct_Free', 'Premium_Exchange_Metered'.
     *
     * @return the name value
     */
    public Name name() {
        return this.name;
    }

    /**
     * Set the name of the peering SKU. Possible values include: 'Basic_Exchange_Free', 'Basic_Direct_Free', 'Premium_Direct_Free', 'Premium_Exchange_Metered'.
     *
     * @param name the name value to set
     * @return the PeeringSku object itself.
     */
    public PeeringSku withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier of the peering SKU. Possible values include: 'Basic', 'Premium'.
     *
     * @return the tier value
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier of the peering SKU. Possible values include: 'Basic', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the PeeringSku object itself.
     */
    public PeeringSku withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the family of the peering SKU. Possible values include: 'Direct', 'Exchange'.
     *
     * @return the family value
     */
    public Family family() {
        return this.family;
    }

    /**
     * Set the family of the peering SKU. Possible values include: 'Direct', 'Exchange'.
     *
     * @param family the family value to set
     * @return the PeeringSku object itself.
     */
    public PeeringSku withFamily(Family family) {
        this.family = family;
        return this;
    }

    /**
     * Get the size of the peering SKU. Possible values include: 'Free', 'Metered', 'Unlimited'.
     *
     * @return the size value
     */
    public Size size() {
        return this.size;
    }

    /**
     * Set the size of the peering SKU. Possible values include: 'Free', 'Metered', 'Unlimited'.
     *
     * @param size the size value to set
     * @return the PeeringSku object itself.
     */
    public PeeringSku withSize(Size size) {
        this.size = size;
        return this;
    }

}
