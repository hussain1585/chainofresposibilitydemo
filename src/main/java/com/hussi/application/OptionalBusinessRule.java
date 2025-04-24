package com.hussi.application;

import com.hussi.domain.DecodedPan;

import java.util.function.Predicate;

public abstract class OptionalBusinessRule extends BusinessRule {

    protected abstract Predicate<String> getPredicate();

    protected boolean check(String pan) {
        System.out.println("checking the predicate for pan : " + pan);
        return getPredicate().test(pan);
    }
}
