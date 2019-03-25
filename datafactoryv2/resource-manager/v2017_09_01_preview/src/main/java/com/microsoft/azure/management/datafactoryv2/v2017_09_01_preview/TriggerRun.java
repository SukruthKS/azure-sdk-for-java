/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.TriggerRunInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DataFactoryManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing TriggerRun.
 */
public interface TriggerRun extends HasInner<TriggerRunInner>, HasManager<DataFactoryManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * @return the status value.
     */
    TriggerRunStatus status();

    /**
     * @return the triggeredPipelines value.
     */
    Map<String, String> triggeredPipelines();

    /**
     * @return the triggerName value.
     */
    String triggerName();

    /**
     * @return the triggerRunId value.
     */
    String triggerRunId();

    /**
     * @return the triggerRunTimestamp value.
     */
    DateTime triggerRunTimestamp();

    /**
     * @return the triggerType value.
     */
    String triggerType();

}
