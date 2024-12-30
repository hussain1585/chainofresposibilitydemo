package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

@Component
public class MandatoryRule2 implements MandatoryBusinessRule {
    @Override
    public DecodedPan apply(DecodedPan decodedPan) {
        System.out.println("Mandatory Rule 2 is applied");
        decodedPan.setMandatory2("mandatory2");
        return decodedPan;
    }
}
