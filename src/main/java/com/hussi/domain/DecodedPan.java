package com.hussi.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DecodedPan {
    private String input;
    private String decodedResult;
}