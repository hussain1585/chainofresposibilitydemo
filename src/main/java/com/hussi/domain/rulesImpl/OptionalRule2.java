package com.hussi.domain.rulesImpl;

import com.hussi.application.MandatoryBusinessRule;
import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class OptionalRule2 extends OptionalBusinessRule {

    public Predicate<String> predicate = pan -> null != pan;

    @Override
    protected DecodedPan apply(String pan) {
        System.out.println("Optional Rule 2 is applied");
        return null;
    }

    @Override
    protected Predicate<String> getPredicate() {
        return predicate;
    }
}
