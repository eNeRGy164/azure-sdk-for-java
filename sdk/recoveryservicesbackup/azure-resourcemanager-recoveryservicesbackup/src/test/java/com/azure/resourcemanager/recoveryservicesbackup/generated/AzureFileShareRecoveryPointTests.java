// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureFileShareRecoveryPoint\",\"recoveryPointType\":\"ycnunvjsrtk\",\"recoveryPointTime\":\"2021-11-28T07:38:04Z\",\"fileShareSnapshotUri\":\"opqgikyzirtxdyux\",\"recoveryPointSizeInGB\":1444158285,\"recoveryPointProperties\":{\"expiryTime\":\"psew\",\"ruleName\":\"oi\",\"isSoftDeleted\":false}}")
                .toObject(AzureFileShareRecoveryPoint.class);
        Assertions.assertEquals("ycnunvjsrtk", model.recoveryPointType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T07:38:04Z"), model.recoveryPointTime());
        Assertions.assertEquals("opqgikyzirtxdyux", model.fileShareSnapshotUri());
        Assertions.assertEquals(1444158285, model.recoveryPointSizeInGB());
        Assertions.assertEquals("psew", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("oi", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(false, model.recoveryPointProperties().isSoftDeleted());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareRecoveryPoint model =
            new AzureFileShareRecoveryPoint()
                .withRecoveryPointType("ycnunvjsrtk")
                .withRecoveryPointTime(OffsetDateTime.parse("2021-11-28T07:38:04Z"))
                .withFileShareSnapshotUri("opqgikyzirtxdyux")
                .withRecoveryPointSizeInGB(1444158285)
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("psew").withRuleName("oi").withIsSoftDeleted(false));
        model = BinaryData.fromObject(model).toObject(AzureFileShareRecoveryPoint.class);
        Assertions.assertEquals("ycnunvjsrtk", model.recoveryPointType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-28T07:38:04Z"), model.recoveryPointTime());
        Assertions.assertEquals("opqgikyzirtxdyux", model.fileShareSnapshotUri());
        Assertions.assertEquals(1444158285, model.recoveryPointSizeInGB());
        Assertions.assertEquals("psew", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("oi", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(false, model.recoveryPointProperties().isSoftDeleted());
    }
}
