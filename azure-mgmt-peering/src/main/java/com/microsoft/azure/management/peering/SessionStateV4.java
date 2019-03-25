/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SessionStateV4.
 */
public final class SessionStateV4 extends ExpandableStringEnum<SessionStateV4> {
    /** Static value None for SessionStateV4. */
    public static final SessionStateV4 NONE = fromString("None");

    /** Static value Idle for SessionStateV4. */
    public static final SessionStateV4 IDLE = fromString("Idle");

    /** Static value Connect for SessionStateV4. */
    public static final SessionStateV4 CONNECT = fromString("Connect");

    /** Static value Active for SessionStateV4. */
    public static final SessionStateV4 ACTIVE = fromString("Active");

    /** Static value OpenSent for SessionStateV4. */
    public static final SessionStateV4 OPEN_SENT = fromString("OpenSent");

    /** Static value OpenConfirm for SessionStateV4. */
    public static final SessionStateV4 OPEN_CONFIRM = fromString("OpenConfirm");

    /** Static value Established for SessionStateV4. */
    public static final SessionStateV4 ESTABLISHED = fromString("Established");

    /** Static value PendingAdd for SessionStateV4. */
    public static final SessionStateV4 PENDING_ADD = fromString("PendingAdd");

    /** Static value PendingUpdate for SessionStateV4. */
    public static final SessionStateV4 PENDING_UPDATE = fromString("PendingUpdate");

    /** Static value PendingRemove for SessionStateV4. */
    public static final SessionStateV4 PENDING_REMOVE = fromString("PendingRemove");

    /**
     * Creates or finds a SessionStateV4 from its string representation.
     * @param name a name to look for
     * @return the corresponding SessionStateV4
     */
    @JsonCreator
    public static SessionStateV4 fromString(String name) {
        return fromString(name, SessionStateV4.class);
    }

    /**
     * @return known SessionStateV4 values
     */
    public static Collection<SessionStateV4> values() {
        return values(SessionStateV4.class);
    }
}
