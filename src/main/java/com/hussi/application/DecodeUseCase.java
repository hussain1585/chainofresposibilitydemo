package com.hussi.application;

import com.hussi.domain.DecodedPan;
import com.hussi.presentation.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DecodeUseCase extends UseCase<String, DecodedPan> {

    private final List<BusinessRule> rules;

    @Override
    public DecodedPan execute(String pan) {
        for (BusinessRule rule : rules) {
            if (rule instanceof OptionalBusinessRule op1 && op1.check(pan)
                    || rule instanceof MandatoryBusinessRule mr) {
                rule.apply(pan);
            }
        }
        return null;
    }
}
