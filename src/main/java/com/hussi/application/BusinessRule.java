package com.hussi.application;

import com.hussi.domain.DecodedPan;

public abstract class BusinessRule {
    protected abstract DecodedPan apply(String pan);
}
