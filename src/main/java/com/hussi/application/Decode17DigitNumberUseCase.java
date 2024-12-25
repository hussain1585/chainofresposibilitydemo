package com.hussi.application;

import com.hussi.domain.DecoderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Decode17DigitNumberUseCase {
    private final DecoderService decoderService;

    public String execute(String input) {
        if (input == null || input.length() != 17 || !input.matches("^[a-zA-Z0-9]+$")) {
            throw new IllegalArgumentException("Invalid input: Must be a 17-digit alphanumeric string.");
        }
        return decoderService.decode(input);
    }
}