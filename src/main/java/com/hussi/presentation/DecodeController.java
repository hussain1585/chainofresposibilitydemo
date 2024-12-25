package com.hussi.presentation;

import com.hussi.application.Decode17DigitNumberUseCase;
import com.hussi.presentation.dto.DecodeRequest;
import com.hussi.presentation.dto.DecodeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DecodeController {

    private final Decode17DigitNumberUseCase useCase;

    @PostMapping("/decode")
    public ResponseEntity<DecodeResponse> decode(@Validated @RequestBody DecodeRequest request) {
        String result = useCase.execute(request.getInput());
        return ResponseEntity.ok(new DecodeResponse(result));
    }
}