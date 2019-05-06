/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2018_08_01.implementation.AvailableDelegationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailableDelegations.
 */
public interface AvailableDelegations extends HasInner<AvailableDelegationsInner> {
    /**
     * Gets all of the available subnet delegations for this subscription in this region.
     *
     * @param location The location of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationAvailableDelegation> listAsync(final String location);

}