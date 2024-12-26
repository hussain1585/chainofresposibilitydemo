package com.hussi.presentation;

import com.hussi.application.DecodeUseCase;
import com.hussi.domain.DecodedPan;
import com.hussi.domain.UseCaseExecutor;
import com.hussi.presentation.dto.DecodeRequest;
import com.hussi.presentation.dto.DecodeResponse;
import com.hussi.presentation.rest.IController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
public class DecodeController implements IController<String, DecodedPan> {

    private final UseCaseExecutor useCaseExecutor;
    private final DecodeUseCase decodeUseCase;


    @Override
    public CompletableFuture<ResponseEntity<DecodedPan>> decode(String pan) {
        return useCaseExecutor.execute(decodeUseCase, pan, (decodedPan) -> ResponseEntity.ok(decodedPan));
    }
}