package com.hussi.domain.rulesImpl;

import com.hussi.application.OptionalBusinessRule;
import com.hussi.domain.DecodedPan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
//@RequiredArgsConstructor
public class OptionalRule1 extends OptionalBusinessRule {

    private final Predicate<String> predicate = pan -> pan.length() == 8;

    @Override
    protected DecodedPan apply(String pan) {
        System.out.println("Optional Rule 1 is applied");
        return null;
    }
}
