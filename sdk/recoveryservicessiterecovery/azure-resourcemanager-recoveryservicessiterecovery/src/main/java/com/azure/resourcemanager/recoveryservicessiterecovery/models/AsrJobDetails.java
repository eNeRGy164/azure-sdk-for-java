// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** This class represents job details based on specific job type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("AsrJobDetails")
@Fluent
public final class AsrJobDetails extends JobDetails {
    /** Creates an instance of AsrJobDetails class. */
    public AsrJobDetails() {
    }

    /** {@inheritDoc} */
    @Override
    public AsrJobDetails withAffectedObjectDetails(Map<String, String> affectedObjectDetails) {
        super.withAffectedObjectDetails(affectedObjectDetails);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
