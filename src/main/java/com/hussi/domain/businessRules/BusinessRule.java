package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;

import java.util.function.Function;

public interface BusinessRule {
    void apply(DecoderPojo pojo);
}
