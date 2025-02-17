// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ClusterServerInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of servers in a cluster. */
@Fluent
public final class ClusterServerListResult {
    /*
     * The list of servers in a cluster.
     */
    @JsonProperty(value = "value")
    private List<ClusterServerInner> value;

    /** Creates an instance of ClusterServerListResult class. */
    public ClusterServerListResult() {
    }

    /**
     * Get the value property: The list of servers in a cluster.
     *
     * @return the value value.
     */
    public List<ClusterServerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of servers in a cluster.
     *
     * @param value the value value to set.
     * @return the ClusterServerListResult object itself.
     */
    public ClusterServerListResult withValue(List<ClusterServerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
