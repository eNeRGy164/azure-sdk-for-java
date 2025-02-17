// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Defines the function used to interpolate score boosting across a range of documents. */
public enum ScoringFunctionInterpolation {
    /** Boosts scores by a linearly decreasing amount. This is the default interpolation for scoring functions. */
    LINEAR("linear"),

    /** Boosts scores by a constant factor. */
    CONSTANT("constant"),

    /**
     * Boosts scores by an amount that decreases quadratically. Boosts decrease slowly for higher scores, and more
     * quickly as the scores decrease. This interpolation option is not allowed in tag scoring functions.
     */
    QUADRATIC("quadratic"),

    /**
     * Boosts scores by an amount that decreases logarithmically. Boosts decrease quickly for higher scores, and more
     * slowly as the scores decrease. This interpolation option is not allowed in tag scoring functions.
     */
    LOGARITHMIC("logarithmic");

    /** The actual serialized value for a ScoringFunctionInterpolation instance. */
    private final String value;

    ScoringFunctionInterpolation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ScoringFunctionInterpolation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ScoringFunctionInterpolation object, or null if unable to parse.
     */
    public static ScoringFunctionInterpolation fromString(String value) {
        if (value == null) {
            return null;
        }
        ScoringFunctionInterpolation[] items = ScoringFunctionInterpolation.values();
        for (ScoringFunctionInterpolation item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
