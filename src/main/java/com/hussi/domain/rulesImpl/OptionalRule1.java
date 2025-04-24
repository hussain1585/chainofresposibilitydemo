package com.hussi.domain.rulesImpl;

import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
@RequiredArgsConstructor
public class OptionalRule1 extends OptionalBusinessRule {

    @Qualifier("optional1")
    private final Predicate<String> predicate;

    @Override
    protected DecodedPan apply(String pan) {
        System.out.println("Optional Rule 1 is applied");
        return null;
    }

    @Override
    protected Predicate<String> getPredicate() {
        return predicate;
    }
}
