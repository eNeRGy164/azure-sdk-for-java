// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.selfhelp.models.Step;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Troubleshooter response. */
@Fluent
public final class TroubleshooterResourceInner extends ProxyResource {
    /*
     * Troubleshooter Instance properties.
     */
    @JsonProperty(value = "properties")
    private TroubleshooterInstanceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TroubleshooterResourceInner class. */
    public TroubleshooterResourceInner() {
    }

    /**
     * Get the innerProperties property: Troubleshooter Instance properties.
     *
     * @return the innerProperties value.
     */
    private TroubleshooterInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the solutionId property: Solution Id to identify single troubleshooter.
     *
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.innerProperties() == null ? null : this.innerProperties().solutionId();
    }

    /**
     * Set the solutionId property: Solution Id to identify single troubleshooter.
     *
     * @param solutionId the solutionId value to set.
     * @return the TroubleshooterResourceInner object itself.
     */
    public TroubleshooterResourceInner withSolutionId(String solutionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshooterInstanceProperties();
        }
        this.innerProperties().withSolutionId(solutionId);
        return this;
    }

    /**
     * Get the parameters property: Client input parameters to run Troubleshooter Resource.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Client input parameters to run Troubleshooter Resource.
     *
     * @param parameters the parameters value to set.
     * @return the TroubleshooterResourceInner object itself.
     */
    public TroubleshooterResourceInner withParameters(Map<String, String> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshooterInstanceProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the provisioningState property: Status of troubleshooter provisioning.
     *
     * @return the provisioningState value.
     */
    public TroubleshooterProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the steps property: List of step object.
     *
     * @return the steps value.
     */
    public List<Step> steps() {
        return this.innerProperties() == null ? null : this.innerProperties().steps();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
