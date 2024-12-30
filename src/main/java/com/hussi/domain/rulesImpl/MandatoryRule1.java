package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

@Component
public class MandatoryRule1 implements MandatoryBusinessRule {
    @Override
    public DecodedPan apply(DecodedPan decodedPan) {
        System.out.println("Mandatory Rule 1 is applied");
        decodedPan.setMandatory1("mandatory1");
        return decodedPan;
    }
}
