/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker;

import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.AlterationsDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.WordAlterationsDTO;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Alterations.
 */
public interface Alterations {
    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WordAlterationsDTO object if successful.
     */
    WordAlterationsDTO get();

    /**
     * Download alterations from runtime.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WordAlterationsDTO> getAsync(final ServiceCallback<WordAlterationsDTO> serviceCallback);

    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    Observable<WordAlterationsDTO> getAsync();

    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    Observable<ServiceResponse<WordAlterationsDTO>> getWithServiceResponseAsync();

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void replace(List<AlterationsDTO> wordAlterations);

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> replaceAsync(List<AlterationsDTO> wordAlterations, final ServiceCallback<Void> serviceCallback);

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> replaceAsync(List<AlterationsDTO> wordAlterations);

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> replaceWithServiceResponseAsync(List<AlterationsDTO> wordAlterations);

}
