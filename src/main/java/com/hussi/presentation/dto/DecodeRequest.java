package com.hussi.presentation.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class DecodeRequest {
    @NotNull(message = "Input cannot be null.")
    @Size(min = 17, max = 17, message = "Input must be exactly 17 characters.")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Input must be alphanumeric.")
    private String input;
}
