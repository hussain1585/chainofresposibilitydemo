package com.hussi.config;

import com.hussi.domain.handler.BusinessRuleHandler;
import com.hussi.domain.handler.MandatoryBusinessRuleHandler;
import com.hussi.domain.handler.OptionalBusinessRuleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfiguration {

    // Mandatory Business Rule Handlers
    @Bean
    public MandatoryBusinessRuleHandler trimEndsHandler() {
        return input -> BusinessRuleUtility.trimEnds.apply(input);
    }

    @Bean
    public MandatoryBusinessRuleHandler removeSpecialCharactersHandler() {
        return input -> BusinessRuleUtility.removeSpecialCharacters.apply(input);
    }

    @Bean
    public MandatoryBusinessRuleHandler enforceLengthHandler() {
        return input -> BusinessRuleUtility.enforceLength.apply(input);
    }

    // Optional Business Rule Handlers
    @Bean
    public OptionalBusinessRuleHandler groupAHandler() {
        return new OptionalBusinessRuleHandler() {
            @Override
            public boolean shouldApply(String input) {
                return BusinessRuleUtility.shouldApplyGroupA.apply(input);
            }

            @Override
            public String apply(String input) {
                return BusinessRuleUtility.applyGroupA.apply(input);
            }
        };
    }

    @Bean
    public OptionalBusinessRuleHandler groupBHandler() {
        return new OptionalBusinessRuleHandler() {
            @Override
            public boolean shouldApply(String input) {
                return BusinessRuleUtility.shouldApplyGroupB.apply(input);
            }

            @Override
            public String apply(String input) {
                return BusinessRuleUtility.applyGroupB.apply(input);
            }
        };
    }

    // Inject all business rule handlers as a list
    @Bean
    public List<BusinessRuleHandler> businessRuleHandlers(
            MandatoryBusinessRuleHandler trimEndsHandler,
            MandatoryBusinessRuleHandler removeSpecialCharactersHandler,
            MandatoryBusinessRuleHandler enforceLengthHandler,
            OptionalBusinessRuleHandler groupAHandler,
            OptionalBusinessRuleHandler groupBHandler
    ) {
        return List.of(
                trimEndsHandler,
                removeSpecialCharactersHandler,
                enforceLengthHandler,
                groupAHandler,
                groupBHandler
        );
    }
}
