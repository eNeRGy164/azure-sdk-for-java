// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The integration runtime authentication keys. */
@Fluent
public final class IntegrationRuntimeAuthKeysInner {
    /*
     * The primary integration runtime authentication key.
     */
    @JsonProperty(value = "authKey1")
    private String authKey1;

    /*
     * The secondary integration runtime authentication key.
     */
    @JsonProperty(value = "authKey2")
    private String authKey2;

    /** Creates an instance of IntegrationRuntimeAuthKeysInner class. */
    public IntegrationRuntimeAuthKeysInner() {
    }

    /**
     * Get the authKey1 property: The primary integration runtime authentication key.
     *
     * @return the authKey1 value.
     */
    public String authKey1() {
        return this.authKey1;
    }

    /**
     * Set the authKey1 property: The primary integration runtime authentication key.
     *
     * @param authKey1 the authKey1 value to set.
     * @return the IntegrationRuntimeAuthKeysInner object itself.
     */
    public IntegrationRuntimeAuthKeysInner withAuthKey1(String authKey1) {
        this.authKey1 = authKey1;
        return this;
    }

    /**
     * Get the authKey2 property: The secondary integration runtime authentication key.
     *
     * @return the authKey2 value.
     */
    public String authKey2() {
        return this.authKey2;
    }

    /**
     * Set the authKey2 property: The secondary integration runtime authentication key.
     *
     * @param authKey2 the authKey2 value to set.
     * @return the IntegrationRuntimeAuthKeysInner object itself.
     */
    public IntegrationRuntimeAuthKeysInner withAuthKey2(String authKey2) {
        this.authKey2 = authKey2;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
