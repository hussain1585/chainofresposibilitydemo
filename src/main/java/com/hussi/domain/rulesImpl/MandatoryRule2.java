package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

@Component
public class MandatoryRule2 extends MandatoryBusinessRule {
    @Override
    protected DecodedPan apply(String pan, DecodedPan decodedPan) {
        return null;
    }
}
