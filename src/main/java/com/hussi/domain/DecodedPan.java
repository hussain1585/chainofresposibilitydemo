package com.hussi.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DecodedPan {
    private String pan;
    private String decodedResult;
    private String mandatory1;
    private String mandatory2;
    private String optional1;
    private String optional2;
    private String optionalCheck1;
    private String optionalCheck2;
}