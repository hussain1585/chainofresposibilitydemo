package com.hussi.service;

import com.hussi.domain.businessRules.BusinessRule;
import com.hussi.domain.businessRules.MandatoryBusinessRule;
import com.hussi.domain.businessRules.OptionalBusinessRule;
import com.hussi.domain.pojo.DecoderPojo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RuleService {
    private final List<BusinessRule> businessRules;

    public ResponseEntity<DecoderPojo> decode(String input) {
        DecoderPojo decoderPojo = DecoderPojo.builder().name(input).build();

        for (BusinessRule rule : businessRules) {
            if (rule instanceof OptionalBusinessRule optionalRule && !optionalRule.shouldApply(decoderPojo)) {
                continue;
            } else {
                log.info("something fishy just happend");
            }
            rule.apply(decoderPojo);
        }
        return ResponseEntity.ok(decoderPojo);
    }
}
