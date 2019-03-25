/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentKeyPolicyRestrictionTokenType.
 */
public final class ContentKeyPolicyRestrictionTokenType extends ExpandableStringEnum<ContentKeyPolicyRestrictionTokenType> {
    /** Static value Unknown for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType UNKNOWN = fromString("Unknown");

    /** Static value Swt for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType SWT = fromString("Swt");

    /** Static value Jwt for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType JWT = fromString("Jwt");

    /**
     * Creates or finds a ContentKeyPolicyRestrictionTokenType from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentKeyPolicyRestrictionTokenType
     */
    @JsonCreator
    public static ContentKeyPolicyRestrictionTokenType fromString(String name) {
        return fromString(name, ContentKeyPolicyRestrictionTokenType.class);
    }

    /**
     * @return known ContentKeyPolicyRestrictionTokenType values
     */
    public static Collection<ContentKeyPolicyRestrictionTokenType> values() {
        return values(ContentKeyPolicyRestrictionTokenType.class);
    }
}
