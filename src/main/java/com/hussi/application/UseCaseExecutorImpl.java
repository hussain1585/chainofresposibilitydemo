package com.hussi.application;

import com.hussi.domain.UseCaseExecutor;
import com.hussi.presentation.UseCase;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@Service
public class UseCaseExecutorImpl implements UseCaseExecutor {

    @Override
    public <I, O, O2> CompletableFuture<O2> execute(UseCase<I, O> useCase, I input, Function<O, O2> dtoToResponseWrapper) {
        return CompletableFuture
                .supplyAsync(() -> input)
                .thenApplyAsync(useCase::execute)
                .thenApplyAsync(dtoToResponseWrapper);
    }
}
