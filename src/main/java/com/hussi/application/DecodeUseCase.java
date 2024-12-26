package com.hussi.application;

import com.hussi.domain.DecodedPan;
import com.hussi.presentation.UseCase;

import java.util.ArrayList;
import java.util.List;

public class DecodeUseCase extends UseCase<String, DecodedPan> {

    private final List<BusinessRule> rules = new ArrayList<>();

    @Override
    public DecodedPan execute(String input) {
        return null;
    }
}
