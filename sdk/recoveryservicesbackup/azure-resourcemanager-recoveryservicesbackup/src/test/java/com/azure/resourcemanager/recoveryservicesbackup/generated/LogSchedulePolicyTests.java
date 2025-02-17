// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.LogSchedulePolicy;
import org.junit.jupiter.api.Assertions;

public final class LogSchedulePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSchedulePolicy model =
            BinaryData
                .fromString("{\"schedulePolicyType\":\"LogSchedulePolicy\",\"scheduleFrequencyInMins\":249548038}")
                .toObject(LogSchedulePolicy.class);
        Assertions.assertEquals(249548038, model.scheduleFrequencyInMins());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSchedulePolicy model = new LogSchedulePolicy().withScheduleFrequencyInMins(249548038);
        model = BinaryData.fromObject(model).toObject(LogSchedulePolicy.class);
        Assertions.assertEquals(249548038, model.scheduleFrequencyInMins());
    }
}
