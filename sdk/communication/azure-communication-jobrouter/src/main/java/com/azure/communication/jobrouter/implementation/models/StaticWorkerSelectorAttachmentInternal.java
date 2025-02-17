// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a worker selector that will be attached to the job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Immutable
public final class StaticWorkerSelectorAttachmentInternal extends WorkerSelectorAttachmentInternal {

    /*
     * The worker selector to attach.
     */
    @Generated
    @JsonProperty(value = "workerSelector")
    private RouterWorkerSelectorInternal workerSelector;

    /**
     * Creates an instance of StaticWorkerSelectorAttachmentInternal class.
     *
     * @param workerSelector the workerSelector value to set.
     */
    @Generated
    @JsonCreator
    public StaticWorkerSelectorAttachmentInternal(
            @JsonProperty(value = "workerSelector") RouterWorkerSelectorInternal workerSelector) {
        this.workerSelector = workerSelector;
    }

    /**
     * Get the workerSelector property: The worker selector to attach.
     *
     * @return the workerSelector value.
     */
    @Generated
    public RouterWorkerSelectorInternal getWorkerSelector() {
        return this.workerSelector;
    }
}
