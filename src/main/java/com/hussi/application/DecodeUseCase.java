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
        DecodedPan decodedPan = DecodedPan.builder().pan(pan).build();
        System.out.println(decodedPan);
//        for (BusinessRule rule : rules) {
//            if (rule instanceof OptionalBusinessRule op1 && op1.check(decodedPan) ||
//                rule instanceof MandatoryBusinessRule mr)
//            {
//                rule.apply(decodedPan);
//            }
//        }
        rules.stream()
                .filter(rule -> (rule instanceof OptionalBusinessRule op1 && op1.check(decodedPan)) ||
                        (rule instanceof MandatoryBusinessRule))
                .forEach(rule -> rule.apply(decodedPan));
        System.out.println(decodedPan);
        return decodedPan;
    }
}
