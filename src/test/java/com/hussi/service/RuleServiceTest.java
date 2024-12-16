package com.hussi.service;

import com.hussi.domain.handler.MandatoryBusinessRuleHandler;
import com.hussi.domain.handler.OptionalBusinessRuleHandler;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest

class RuleServiceTest {
    @Autowired
    private RuleService decodeService;

//    @Test
    void testDecodeAppliesMandatoryRules() {
        // Arrange
        String input = " Input123 ";
        String afterMandatory1 = "Input123";
        String afterMandatory2 = "Input123Cleaned";

        // Mock mandatory rule behavior
//        when(mandatoryRule1.apply(input)).thenReturn(afterMandatory1);
//        when(mandatoryRule2.apply(afterMandatory1)).thenReturn(afterMandatory2);

        // Act
        String result = decodeService.decode(input);

        // Assert
        assertEquals(afterMandatory2, result);

        // Verify mandatory rules were applied in sequence
//        verify(mandatoryRule1).apply(input);
//        verify(mandatoryRule2).apply(afterMandatory1);

        // Verify optional rules were not applied
//        verifyNoInteractions(optionalRule1, optionalRule2);
    }


}