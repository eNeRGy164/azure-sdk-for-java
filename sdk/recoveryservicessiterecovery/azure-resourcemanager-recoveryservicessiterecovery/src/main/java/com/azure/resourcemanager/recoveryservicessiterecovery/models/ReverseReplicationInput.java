// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reverse replication input. */
@Fluent
public final class ReverseReplicationInput {
    /*
     * Reverse replication properties.
     */
    @JsonProperty(value = "properties")
    private ReverseReplicationInputProperties properties;

    /** Creates an instance of ReverseReplicationInput class. */
    public ReverseReplicationInput() {
    }

    /**
     * Get the properties property: Reverse replication properties.
     *
     * @return the properties value.
     */
    public ReverseReplicationInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Reverse replication properties.
     *
     * @param properties the properties value to set.
     * @return the ReverseReplicationInput object itself.
     */
    public ReverseReplicationInput withProperties(ReverseReplicationInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
