// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The settings that will be leveraged for Sql source partitioning. */
@Fluent
public final class SqlPartitionSettings {
    /*
     * The name of the column in integer or datetime type that will be used for proceeding partitioning. If not
     * specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /*
     * The maximum value of the partition column for partition range splitting. This value is used to decide the
     * partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned
     * and copied. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionUpperBound")
    private Object partitionUpperBound;

    /*
     * The minimum value of the partition column for partition range splitting. This value is used to decide the
     * partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned
     * and copied. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionLowerBound")
    private Object partitionLowerBound;

    /** Creates an instance of SqlPartitionSettings class. */
    public SqlPartitionSettings() {}

    /**
     * Get the partitionColumnName property: The name of the column in integer or datetime type that will be used for
     * proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the
     * partition column. Type: string (or Expression with resultType string).
     *
     * @return the partitionColumnName value.
     */
    public Object getPartitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column in integer or datetime type that will be used for
     * proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the
     * partition column. Type: string (or Expression with resultType string).
     *
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the SqlPartitionSettings object itself.
     */
    public SqlPartitionSettings setPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the partitionUpperBound property: The maximum value of the partition column for partition range splitting.
     * This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or
     * query result will be partitioned and copied. Type: string (or Expression with resultType string).
     *
     * @return the partitionUpperBound value.
     */
    public Object getPartitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the partitionUpperBound property: The maximum value of the partition column for partition range splitting.
     * This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or
     * query result will be partitioned and copied. Type: string (or Expression with resultType string).
     *
     * @param partitionUpperBound the partitionUpperBound value to set.
     * @return the SqlPartitionSettings object itself.
     */
    public SqlPartitionSettings setPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the partitionLowerBound property: The minimum value of the partition column for partition range splitting.
     * This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or
     * query result will be partitioned and copied. Type: string (or Expression with resultType string).
     *
     * @return the partitionLowerBound value.
     */
    public Object getPartitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the partitionLowerBound property: The minimum value of the partition column for partition range splitting.
     * This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or
     * query result will be partitioned and copied. Type: string (or Expression with resultType string).
     *
     * @param partitionLowerBound the partitionLowerBound value to set.
     * @return the SqlPartitionSettings object itself.
     */
    public SqlPartitionSettings setPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }
}
