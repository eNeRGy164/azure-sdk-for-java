// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.core.util.Context;
import com.azure.cosmos.implementation.OperationType;
import com.azure.cosmos.implementation.Paths;
import com.azure.cosmos.implementation.ResourceType;
import com.azure.cosmos.implementation.UserDefinedFunction;
import com.azure.cosmos.models.CosmosUserDefinedFunctionResponse;
import com.azure.cosmos.models.CosmosUserDefinedFunctionProperties;
import com.azure.cosmos.models.ModelBridgeInternal;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.withContext;

/**
 * The type Cosmos async user defined function.
 */
public class CosmosAsyncUserDefinedFunction {

    private final CosmosAsyncContainer container;

    @SuppressWarnings("EnforceFinalFields")
    private String id;

    CosmosAsyncUserDefinedFunction(String id, CosmosAsyncContainer container) {
        this.id = id;
        this.container = container;
    }

    /**
     * Get the id of the {@link CosmosAsyncUserDefinedFunction}
     *
     * @return the id of the {@link CosmosAsyncUserDefinedFunction}
     */
    public String getId() {
        return id;
    }

    /**
     * Set the id of the {@link CosmosAsyncUserDefinedFunction}
     *
     * @param id the id of the {@link CosmosAsyncUserDefinedFunction}
     * @return the same {@link CosmosAsyncUserDefinedFunction} that had the id set
     */
    CosmosAsyncUserDefinedFunction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Read a user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the read user defined
     * function.
     * In case of failure the {@link Mono} will error.
     *
     * @return an {@link Mono} containing the single resource response for the read user defined function or an error.
     */
    public Mono<CosmosUserDefinedFunctionResponse> read() {
        return withContext(this::readInternal);
    }

    /**
     * Replaces a cosmos user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced user
     * defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @param udfSettings the cosmos user defined function properties.
     * @return an {@link Mono} containing the single resource response with the replaced cosmos user defined function
     * or an error.
     */
    public Mono<CosmosUserDefinedFunctionResponse> replace(CosmosUserDefinedFunctionProperties udfSettings) {
        return withContext(context -> replaceInternal(udfSettings, context));
    }

    /**
     * Deletes a cosmos user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted user
     * defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @return an {@link Mono} containing the single resource response for the deleted cosmos user defined function or
     * an error.
     */
    public Mono<CosmosUserDefinedFunctionResponse> delete() {
        return withContext(this::deleteInternal);
    }

    String getURIPathSegment() {
        return Paths.USER_DEFINED_FUNCTIONS_PATH_SEGMENT;
    }

    String getParentLink() {
        return container.getLink();
    }

    String getLink() {
        return getParentLink()
            + "/"
            + getURIPathSegment()
            + "/"
            + getId();
    }

    private Mono<CosmosUserDefinedFunctionResponse> readInternal(Context context) {
        String spanName = "readUserDefinedFunction." + container.getId();
        Mono<CosmosUserDefinedFunctionResponse> responseMono = container
            .getDatabase()
            .getDocClientWrapper()
            .readUserDefinedFunction(getLink(), null)
            .map(ModelBridgeInternal::createCosmosUserDefinedFunctionResponse).single();
        CosmosAsyncClient client = container.getDatabase().getClient();
        return client.getDiagnosticsProvider().traceEnabledCosmosResponsePublisher(
            responseMono,
            context,
            spanName,
            container.getDatabase().getId(),
            container.getId(),
            client,
            null,
            OperationType.Read,
            ResourceType.UserDefinedFunction,
            null);
    }

    private Mono<CosmosUserDefinedFunctionResponse> replaceInternal(CosmosUserDefinedFunctionProperties udfSettings,
                                                                 Context context) {
        String spanName = "replaceUserDefinedFunction." + container.getId();
        Mono<CosmosUserDefinedFunctionResponse> responseMono = container.getDatabase()
            .getDocClientWrapper()
            .replaceUserDefinedFunction(new UserDefinedFunction(ModelBridgeInternal.toJsonFromJsonSerializable(
                ModelBridgeInternal.getResource(udfSettings))), null)
            .map(ModelBridgeInternal::createCosmosUserDefinedFunctionResponse)
            .single();
        CosmosAsyncClient client = container.getDatabase().getClient();
        return client.getDiagnosticsProvider().traceEnabledCosmosResponsePublisher(
            responseMono,
            context,
            spanName,
            container.getDatabase().getId(),
            container.getId(),
            client,
            null,
            OperationType.Replace,
            ResourceType.UserDefinedFunction,
            null);
    }

    private Mono<CosmosUserDefinedFunctionResponse> deleteInternal(Context context) {
        String spanName = "deleteUserDefinedFunction." + container.getId();
        Mono<CosmosUserDefinedFunctionResponse> responseMono = container.getDatabase()
            .getDocClientWrapper()
            .deleteUserDefinedFunction(this.getLink(), null)
            .map(ModelBridgeInternal::createCosmosUserDefinedFunctionResponse)
            .single();
        CosmosAsyncClient client = container.getDatabase().getClient();
        return client.getDiagnosticsProvider().traceEnabledCosmosResponsePublisher(
            responseMono,
            context,
            spanName,
            container.getDatabase().getId(),
            container.getId(),
            client,
            null,
            OperationType.Delete,
            ResourceType.UserDefinedFunction,
            null);
    }
}
