// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OperationLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class OperationLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationLogSpecification model =
            BinaryData
                .fromString(
                    "{\"name\":\"ifiyipjxsqwpgrj\",\"displayName\":\"norcjxvsnbyxqab\",\"blobDuration\":\"ocpcy\"}")
                .toObject(OperationLogSpecification.class);
        Assertions.assertEquals("ifiyipjxsqwpgrj", model.name());
        Assertions.assertEquals("norcjxvsnbyxqab", model.displayName());
        Assertions.assertEquals("ocpcy", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationLogSpecification model =
            new OperationLogSpecification()
                .withName("ifiyipjxsqwpgrj")
                .withDisplayName("norcjxvsnbyxqab")
                .withBlobDuration("ocpcy");
        model = BinaryData.fromObject(model).toObject(OperationLogSpecification.class);
        Assertions.assertEquals("ifiyipjxsqwpgrj", model.name());
        Assertions.assertEquals("norcjxvsnbyxqab", model.displayName());
        Assertions.assertEquals("ocpcy", model.blobDuration());
    }
}
