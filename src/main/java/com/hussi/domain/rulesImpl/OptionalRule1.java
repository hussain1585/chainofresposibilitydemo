package com.hussi.domain.rulesImpl;

import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;
@Component
public class OptionalRule1 extends OptionalBusinessRule {

    @Override
    protected DecodedPan apply(String pan, DecodedPan decodedPan) {
        return null;
    }

    @Override
    protected boolean check(Predicate<DecodedPan> predicate) {
        return true;
    }
}
