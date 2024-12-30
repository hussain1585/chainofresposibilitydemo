package com.hussi.domain.rulesImpl;

import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
@RequiredArgsConstructor
public class OptionalRule1 implements OptionalBusinessRule {

    @Qualifier("optional1")
    private final Predicate<DecodedPan> predicate;

    @Override
    public DecodedPan apply(DecodedPan decodedPan) {
        System.out.println("Optional Rule 1 is applied");
        decodedPan.setOptional1("optional1");
        return decodedPan;
    }

    @Override
    public boolean check(DecodedPan decodedPan) {
        System.out.println("Optional Rule 1 check is applied");
        decodedPan.setOptionalCheck1("optionalCheck1");
        return predicate.test(decodedPan);
    }
}
