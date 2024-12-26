package com.hussi.application;

import com.hussi.domain.DecodedPan;

import java.util.function.Predicate;

public abstract class OptionalBusinessRule extends BusinessRule {

    public Predicate<String> predicate;


    //protected abstract boolean check(String pan);

    protected boolean check(String pan) {
        System.out.println("checking the predicate");
        return predicate.test(pan);
    }
}
