package com.hussi.application;

import com.hussi.domain.DecodedPan;

import java.util.function.Predicate;

public interface OptionalBusinessRule extends BusinessRule {
    boolean check(DecodedPan decodedPan);
}
