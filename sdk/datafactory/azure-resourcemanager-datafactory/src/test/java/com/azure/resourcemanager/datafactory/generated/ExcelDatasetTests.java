// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.ExcelDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExcelDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExcelDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Excel\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datarqpfzlp\",\"fileName\":\"datatznxlu\",\"\":{\"kbpjzobdwbcpra\":\"datajqbbgsimwejlw\",\"dtnaczkf\":\"datawkuh\",\"dwgtqcumecsaa\":\"datafatgawphnski\",\"iuycsbskowk\":\"datagoqb\"}},\"sheetName\":\"datahzhrbkhtm\",\"sheetIndex\":\"datawiuasfg\",\"range\":\"dataucyhfaimq\",\"firstRowAsHeader\":\"dataruozkgyfp\",\"compression\":{\"type\":\"datae\",\"level\":\"datafm\",\"\":{\"xvlzjxplhpevasyn\":\"datakk\"}},\"nullValue\":\"datazjyielbqrvv\"},\"description\":\"vknmpecqxgiqas\",\"structure\":\"dataubnsnstlpwq\",\"schema\":\"datanxjkhtupsvyouw\",\"linkedServiceName\":{\"referenceName\":\"uiyxfwkztsmsfb\",\"parameters\":{\"kqytkztadopgfzdg\":\"datallznf\",\"yhigqkzjuqwqaj\":\"datafcycrsvlo\",\"xhyoip\":\"datauzxp\",\"bgsosc\":\"dataf\"}},\"parameters\":{\"ekwwnthropmdudsy\":{\"type\":\"SecureString\",\"defaultValue\":\"datafvbennmfkbpjnr\"},\"youergaghp\":{\"type\":\"Float\",\"defaultValue\":\"dataztvktjhffecqko\"},\"yedzfzq\":{\"type\":\"String\",\"defaultValue\":\"datakpyehhfdyldh\"},\"jlwyxedzn\":{\"type\":\"Int\",\"defaultValue\":\"dataqhtdereunokakzwh\"}},\"annotations\":[\"datafomckewv\"],\"folder\":{\"name\":\"fopxf\"},\"\":{\"pt\":\"datapdyzoutx\",\"dgaaqwvkgjpy\":\"datafhgnuywezygv\",\"nogehlufbort\":\"datapmpv\",\"xyji\":\"datanukkfaxzsvb\"}}")
                .toObject(ExcelDataset.class);
        Assertions.assertEquals("vknmpecqxgiqas", model.description());
        Assertions.assertEquals("uiyxfwkztsmsfb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ekwwnthropmdudsy").type());
        Assertions.assertEquals("fopxf", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExcelDataset model =
            new ExcelDataset()
                .withDescription("vknmpecqxgiqas")
                .withStructure("dataubnsnstlpwq")
                .withSchema("datanxjkhtupsvyouw")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("uiyxfwkztsmsfb")
                        .withParameters(
                            mapOf(
                                "kqytkztadopgfzdg",
                                "datallznf",
                                "yhigqkzjuqwqaj",
                                "datafcycrsvlo",
                                "xhyoip",
                                "datauzxp",
                                "bgsosc",
                                "dataf")))
                .withParameters(
                    mapOf(
                        "ekwwnthropmdudsy",
                        new ParameterSpecification()
                            .withType(ParameterType.SECURE_STRING)
                            .withDefaultValue("datafvbennmfkbpjnr"),
                        "youergaghp",
                        new ParameterSpecification()
                            .withType(ParameterType.FLOAT)
                            .withDefaultValue("dataztvktjhffecqko"),
                        "yedzfzq",
                        new ParameterSpecification()
                            .withType(ParameterType.STRING)
                            .withDefaultValue("datakpyehhfdyldh"),
                        "jlwyxedzn",
                        new ParameterSpecification()
                            .withType(ParameterType.INT)
                            .withDefaultValue("dataqhtdereunokakzwh")))
                .withAnnotations(Arrays.asList("datafomckewv"))
                .withFolder(new DatasetFolder().withName("fopxf"))
                .withLocation(
                    new DatasetLocation()
                        .withFolderPath("datarqpfzlp")
                        .withFileName("datatznxlu")
                        .withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withSheetName("datahzhrbkhtm")
                .withSheetIndex("datawiuasfg")
                .withRange("dataucyhfaimq")
                .withFirstRowAsHeader("dataruozkgyfp")
                .withCompression(
                    new DatasetCompression().withType("datae").withLevel("datafm").withAdditionalProperties(mapOf()))
                .withNullValue("datazjyielbqrvv");
        model = BinaryData.fromObject(model).toObject(ExcelDataset.class);
        Assertions.assertEquals("vknmpecqxgiqas", model.description());
        Assertions.assertEquals("uiyxfwkztsmsfb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ekwwnthropmdudsy").type());
        Assertions.assertEquals("fopxf", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
