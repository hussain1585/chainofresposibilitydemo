package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;

public interface BusinessRule {
    void apply(DecoderPojo pojo);
}
