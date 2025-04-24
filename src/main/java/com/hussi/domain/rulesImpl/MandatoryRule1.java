package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

@Component
public class MandatoryRule1 extends MandatoryBusinessRule {
    @Override
    protected DecodedPan apply(String pan) {
        System.out.println("Mandatory Rule 1 is applied");
        return null;
    }
}
