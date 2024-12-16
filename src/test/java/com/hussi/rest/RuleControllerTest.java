package com.hussi.rest;

import com.hussi.service.RuleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class RuleControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private RuleService decodeService;
//
//    @Autowired
//    private RuleController decodeController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        //decodeController = new DecodeController(decodeService);
//        mockMvc = MockMvcBuilders.standaloneSetup(decodeController).build();
//    }
//
//    @Test
//    void testDecodeSuccess() throws Exception {
//        // Given
//        String input = "A1234567890";
//        String expectedResponse = "GroupA-A1234567890";
//
//        // When
//        when(decodeService.decode(input)).thenReturn(expectedResponse);
//
//        // Then
//        mockMvc.perform(get("/decode")
//                        .param("input", input)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(expectedResponse));
//    }
//
//    @Test
//    void testDecodeBadRequestWhenInputMissing() throws Exception {
//        // When & Then
//        mockMvc.perform(get("/decode")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isBadRequest())
//                .andExpect(jsonPath("$.error").doesNotExist());
//    }
//
//    @Test
//    void testDecodeInternalServerError() throws Exception {
//        // Given
//        String input = "InvalidInput";
//        when(decodeService.decode(input)).thenThrow(new RuntimeException("Unexpected Error"));
//
//        // When & Then
//        mockMvc.perform(get("/decode")
//                        .param("input", input)
//                        .contentType(MediaType.APPLICATION_JSON))
////                .andExpect(status().isInternalServerError());
//                .andExpect(status().isOk());
//    }
//
}