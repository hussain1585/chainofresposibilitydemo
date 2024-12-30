package com.hussi.application;

import com.hussi.domain.DecodedPan;

public interface BusinessRule {
    DecodedPan apply(DecodedPan decodedPan);
}
