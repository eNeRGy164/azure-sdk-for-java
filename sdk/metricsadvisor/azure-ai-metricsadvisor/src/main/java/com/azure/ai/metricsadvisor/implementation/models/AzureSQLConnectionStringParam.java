// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureSQLConnectionStringParam model. */
@Fluent
public final class AzureSQLConnectionStringParam {
    /*
     * The connection string to access the Azure SQL.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /** Creates an instance of AzureSQLConnectionStringParam class. */
    public AzureSQLConnectionStringParam() {}

    /**
     * Get the connectionString property: The connection string to access the Azure SQL.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string to access the Azure SQL.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureSQLConnectionStringParam object itself.
     */
    public AzureSQLConnectionStringParam setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
}
