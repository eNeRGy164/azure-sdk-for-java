// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for holding participant from the call. */
@Fluent
public final class UnholdParticipantRequestInternal {
    /*
     * Participants to be hold from the call.
     * Only ACS Users are supported.
     */
    @JsonProperty(value = "participantToUnhold", required = true)
    private CommunicationIdentifierModel participantToUnhold;

    /*
     * Used by customers when calling mid-call actions to correlate the request
     * to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the participantToUnhold property: Participants to be hold from the call. Only ACS Users are supported.
     *
     * @return the participantToUnhold value.
     */
    public CommunicationIdentifierModel getParticipantToUnhold() {
        return this.participantToUnhold;
    }

    /**
     * Set the participantToUnhold property: Participants to be hold from the call. Only ACS Users are supported.
     *
     * @param participantToUnhold the participantToUnhold value to set.
     * @return the UnholdParticipantRequestInternal object itself.
     */
    public UnholdParticipantRequestInternal setParticipantToUnhold(CommunicationIdentifierModel participantToUnhold) {
        this.participantToUnhold = participantToUnhold;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @param operationContext the operationContext value to set.
     * @return the UnholdParticipantRequestInternal object itself.
     */
    public UnholdParticipantRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
