/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StorageTypeState.
 */
public final class StorageTypeState extends ExpandableStringEnum<StorageTypeState> {
    /** Static value Invalid for StorageTypeState. */
    public static final StorageTypeState INVALID = fromString("Invalid");

    /** Static value Locked for StorageTypeState. */
    public static final StorageTypeState LOCKED = fromString("Locked");

    /** Static value Unlocked for StorageTypeState. */
    public static final StorageTypeState UNLOCKED = fromString("Unlocked");

    /**
     * Creates or finds a StorageTypeState from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageTypeState
     */
    @JsonCreator
    public static StorageTypeState fromString(String name) {
        return fromString(name, StorageTypeState.class);
    }

    /**
     * @return known StorageTypeState values
     */
    public static Collection<StorageTypeState> values() {
        return values(StorageTypeState.class);
    }
}
