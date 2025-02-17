// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.NetworkSiblingSetInner;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSetProvisioningState;
import com.azure.resourcemanager.netapp.models.NicInfo;
import java.util.Collections;
import java.util.List;

public final class NetworkSiblingSetImpl implements NetworkSiblingSet {
    private NetworkSiblingSetInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    NetworkSiblingSetImpl(
        NetworkSiblingSetInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String networkSiblingSetId() {
        return this.innerModel().networkSiblingSetId();
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public String networkSiblingSetStateId() {
        return this.innerModel().networkSiblingSetStateId();
    }

    public NetworkFeatures networkFeatures() {
        return this.innerModel().networkFeatures();
    }

    public NetworkSiblingSetProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<NicInfo> nicInfoList() {
        List<NicInfo> inner = this.innerModel().nicInfoList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSiblingSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
