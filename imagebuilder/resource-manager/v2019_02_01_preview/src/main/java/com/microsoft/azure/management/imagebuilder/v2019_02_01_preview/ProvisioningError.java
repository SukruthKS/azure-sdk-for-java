/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ProvisioningError model.
 */
public class ProvisioningError {
    /**
     * Error code of the provisioning failure. Possible values include:
     * 'BadSourceType', 'BadPIRSource', 'BadISOSource',
     * 'BadManagedImageSource', 'BadCustomizerType',
     * 'UnsupportedCustomizerType', 'NoCustomizerScript', 'BadDistributeType',
     * 'BadSharedImageDistribute', 'ServerError', 'Other'.
     */
    @JsonProperty(value = "provisioningErrorCode")
    private String provisioningErrorCode;

    /**
     * Verbose error message about the provisioning failure.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get error code of the provisioning failure. Possible values include: 'BadSourceType', 'BadPIRSource', 'BadISOSource', 'BadManagedImageSource', 'BadCustomizerType', 'UnsupportedCustomizerType', 'NoCustomizerScript', 'BadDistributeType', 'BadSharedImageDistribute', 'ServerError', 'Other'.
     *
     * @return the provisioningErrorCode value
     */
    public String provisioningErrorCode() {
        return this.provisioningErrorCode;
    }

    /**
     * Set error code of the provisioning failure. Possible values include: 'BadSourceType', 'BadPIRSource', 'BadISOSource', 'BadManagedImageSource', 'BadCustomizerType', 'UnsupportedCustomizerType', 'NoCustomizerScript', 'BadDistributeType', 'BadSharedImageDistribute', 'ServerError', 'Other'.
     *
     * @param provisioningErrorCode the provisioningErrorCode value to set
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withProvisioningErrorCode(String provisioningErrorCode) {
        this.provisioningErrorCode = provisioningErrorCode;
        return this;
    }

    /**
     * Get verbose error message about the provisioning failure.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set verbose error message about the provisioning failure.
     *
     * @param message the message value to set
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withMessage(String message) {
        this.message = message;
        return this;
    }

}