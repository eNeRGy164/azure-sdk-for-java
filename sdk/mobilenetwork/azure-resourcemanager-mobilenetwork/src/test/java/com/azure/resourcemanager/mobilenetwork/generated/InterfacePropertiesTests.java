// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import org.junit.jupiter.api.Assertions;

public final class InterfacePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InterfaceProperties model =
            BinaryData
                .fromString(
                    "{\"name\":\"vyq\",\"ipv4Address\":\"wby\",\"ipv4Subnet\":\"k\",\"ipv4Gateway\":\"dumjgrtfwvuk\"}")
                .toObject(InterfaceProperties.class);
        Assertions.assertEquals("vyq", model.name());
        Assertions.assertEquals("wby", model.ipv4Address());
        Assertions.assertEquals("k", model.ipv4Subnet());
        Assertions.assertEquals("dumjgrtfwvuk", model.ipv4Gateway());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InterfaceProperties model =
            new InterfaceProperties()
                .withName("vyq")
                .withIpv4Address("wby")
                .withIpv4Subnet("k")
                .withIpv4Gateway("dumjgrtfwvuk");
        model = BinaryData.fromObject(model).toObject(InterfaceProperties.class);
        Assertions.assertEquals("vyq", model.name());
        Assertions.assertEquals("wby", model.ipv4Address());
        Assertions.assertEquals("k", model.ipv4Subnet());
        Assertions.assertEquals("dumjgrtfwvuk", model.ipv4Gateway());
    }
}
