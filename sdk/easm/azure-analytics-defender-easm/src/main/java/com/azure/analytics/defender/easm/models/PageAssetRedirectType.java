// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PageAssetRedirectType. */
public final class PageAssetRedirectType extends ExpandableStringEnum<PageAssetRedirectType> {

    /** Static value httpHeader for PageAssetRedirectType. */
    @Generated public static final PageAssetRedirectType HTTP_HEADER = fromString("httpHeader");

    /** Static value metaRefresh for PageAssetRedirectType. */
    @Generated public static final PageAssetRedirectType META_REFRESH = fromString("metaRefresh");

    /** Static value javascript for PageAssetRedirectType. */
    @Generated public static final PageAssetRedirectType JAVASCRIPT = fromString("javascript");

    /** Static value final for PageAssetRedirectType. */
    @Generated public static final PageAssetRedirectType FINAL = fromString("final");

    /**
     * Creates a new instance of PageAssetRedirectType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public PageAssetRedirectType() {}

    /**
     * Creates or finds a PageAssetRedirectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PageAssetRedirectType.
     */
    @Generated
    @JsonCreator
    public static PageAssetRedirectType fromString(String name) {
        return fromString(name, PageAssetRedirectType.class);
    }

    /**
     * Gets known PageAssetRedirectType values.
     *
     * @return known PageAssetRedirectType values.
     */
    @Generated
    public static Collection<PageAssetRedirectType> values() {
        return values(PageAssetRedirectType.class);
    }
}
