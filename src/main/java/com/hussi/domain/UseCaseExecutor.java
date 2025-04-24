package com.hussi.domain;

import com.hussi.presentation.UseCase;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface UseCaseExecutor {
    <I, O, O2> CompletableFuture<O2> execute(UseCase<I, O> useCase, I input, Function<O, O2> dtoToResponseWrapper);
}