package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;

public interface OptionalBusinessRule extends BusinessRule {
    boolean shouldApply(DecoderPojo pojo);
}





