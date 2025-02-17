// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.CapabilityType;
import com.azure.resourcemanager.sphere.models.GenerateCapabilityImageRequest;
import com.azure.resourcemanager.sphere.models.SignedCapabilityImageResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DevicesGenerateCapabilityImageMockTests {
    @Test
    public void testGenerateCapabilityImage() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{\"image\":\"qqaatjinrvgou\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AzureSphereManager manager =
            AzureSphereManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SignedCapabilityImageResponse response =
            manager
                .devices()
                .generateCapabilityImage(
                    "htjsying",
                    "fq",
                    "tmtdhtmdvypgik",
                    "gszywk",
                    "irryuzhlh",
                    new GenerateCapabilityImageRequest()
                        .withCapabilities(
                            Arrays
                                .asList(
                                    CapabilityType.FIELD_SERVICING,
                                    CapabilityType.APPLICATION_DEVELOPMENT,
                                    CapabilityType.APPLICATION_DEVELOPMENT)),
                    com.azure.core.util.Context.NONE);
    }
}
