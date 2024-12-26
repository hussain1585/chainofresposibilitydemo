package com.hussi.application;

import com.hussi.domain.DecodedPan;

import java.util.function.Predicate;

public abstract class OptionalBusinessRule extends BusinessRule {
    protected abstract boolean check(Predicate<DecodedPan> predicate);
}
