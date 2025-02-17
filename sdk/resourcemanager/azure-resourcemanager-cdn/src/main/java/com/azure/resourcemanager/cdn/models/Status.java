// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The validation status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Valid for Status. */
    public static final Status VALID = fromString("Valid");

    /** Static value Invalid for Status. */
    public static final Status INVALID = fromString("Invalid");

    /** Static value AccessDenied for Status. */
    public static final Status ACCESS_DENIED = fromString("AccessDenied");

    /** Static value CertificateExpired for Status. */
    public static final Status CERTIFICATE_EXPIRED = fromString("CertificateExpired");

    /**
     * Creates a new instance of Status value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Status() {
    }

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     *
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
