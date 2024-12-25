package com.hussi.service;

import com.hussi.domain.businessRules.MandatoryRule1;
import com.hussi.domain.businessRules.MandatoryRule2;
import com.hussi.domain.businessRules.OptionalRule1;
import com.hussi.domain.businessRules.OptionalRule2;
import com.hussi.domain.pojo.DecoderPojo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class RuleServiceTest {

    @InjectMocks
    private RuleService ruleService;

    //    @Mock
    @InjectMocks
    private MandatoryRule1 mandatoryRule1;

    //    @Mock
    @InjectMocks
    private MandatoryRule2 mandatoryRule2;

    //    @Mock
    @InjectMocks
    private OptionalRule1 optionalRule1;

    //    @Mock
    @InjectMocks
    private OptionalRule2 optionalRule2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testHussi() {
        String input = "testInput";
        DecoderPojo decoderPojo = DecoderPojo.builder().name(input).build();
        ResponseEntity<DecoderPojo> response = ruleService.decode(input);
        System.out.println();
    }

    //    @Test
    void testDecode_withMandatoryRules() {
        // Arrange
        String input = "testInput";
        DecoderPojo decoderPojo = DecoderPojo.builder().name(input).build();

        // Mock the behavior of Optional rules to always return true
        when(optionalRule1.shouldApply(any())).thenReturn(true);
        when(optionalRule2.shouldApply(any())).thenReturn(true);

        // Act
        ResponseEntity<DecoderPojo> response = ruleService.decode(input);

        // Assert
        assertNotNull(response);
        assertEquals(input, response.getBody().getName());

        // Verify that mandatory rules are applied
        verify(mandatoryRule1, times(1)).apply(decoderPojo);
        verify(mandatoryRule2, times(1)).apply(decoderPojo);

        // Verify that optional rules are checked and applied
        verify(optionalRule1, times(1)).shouldApply(decoderPojo);
        verify(optionalRule1, times(1)).apply(decoderPojo);
        verify(optionalRule2, times(1)).shouldApply(decoderPojo);
        verify(optionalRule2, times(1)).apply(decoderPojo);
    }

    //    @Test
    void testDecode_withOptionalRules_notApplied() {
        // Arrange
        String input = "testInput";
        DecoderPojo decoderPojo = DecoderPojo.builder().name(input).build();

        // Mock the behavior of Optional rules to return false
        when(optionalRule1.shouldApply(any())).thenReturn(false);
        when(optionalRule2.shouldApply(any())).thenReturn(false);

        // Act
        ResponseEntity<DecoderPojo> response = ruleService.decode(input);

        // Assert
        assertNotNull(response);
        assertEquals(input, response.getBody().getName());

        // Verify that mandatory rules are applied
        verify(mandatoryRule1, times(1)).apply(decoderPojo);
        verify(mandatoryRule2, times(1)).apply(decoderPojo);

        // Verify that optional rules are not applied
        verify(optionalRule1, times(1)).shouldApply(decoderPojo);
        verify(optionalRule1, times(0)).apply(decoderPojo);
        verify(optionalRule2, times(1)).shouldApply(decoderPojo);
        verify(optionalRule2, times(0)).apply(decoderPojo);
    }

    //    @Test
    void testDecode_withEmptyBusinessRules() {
        // Arrange
        RuleService emptyRuleService = new RuleService(List.of());

        // Act
        ResponseEntity<DecoderPojo> response = emptyRuleService.decode("testInput");

        // Assert
        assertNotNull(response);
        assertEquals("testInput", response.getBody().getName());
    }

    //    @Test
    void testDecode_withNullInput() {
        // Arrange
        String input = null;

        // Act
        ResponseEntity<DecoderPojo> response = ruleService.decode(input);

        // Assert
        assertNotNull(response);
        assertNull(response.getBody().getName());
    }
}
