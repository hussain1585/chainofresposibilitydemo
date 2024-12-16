package com.hussi.service;

import com.hussi.domain.handler.BusinessRuleHandler;
import com.hussi.domain.handler.MandatoryBusinessRuleHandler;
import com.hussi.domain.handler.OptionalBusinessRuleHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RuleService {
    private final List<BusinessRuleHandler> businessRuleHandlers;
    public String decode(String input) {
        String result = input;

        for (BusinessRuleHandler handler : businessRuleHandlers) {
            if (handler instanceof OptionalBusinessRuleHandler optionalHandler) {
                if (optionalHandler.shouldApply(result)) {
                    result = optionalHandler.apply(result);
                }
            } else if(handler instanceof MandatoryBusinessRuleHandler mandatoryBusinessRuleHandler) {
                result = mandatoryBusinessRuleHandler.apply(result);
            }
            else {
                log.info("something fishy just happend");
            }
        }

        return result;
    }
}
