package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class OptionalRule2 implements OptionalBusinessRule {

    public Predicate<DecodedPan> predicate = decodedPan -> null != decodedPan;

    @Override
    public DecodedPan apply(DecodedPan decodedPan) {
        System.out.println("Optional Rule 2 is applied");
        decodedPan.setOptional2("optional2");
        return decodedPan;
    }

    @Override
    public boolean check(DecodedPan decodedPan) {
        System.out.println("Optional Rule 2 check is applied");
        decodedPan.setOptionalCheck2("optionalCheck2");
        return predicate.test(decodedPan);
    }
}
