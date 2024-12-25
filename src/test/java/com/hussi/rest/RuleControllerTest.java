package com.hussi.rest;

import com.hussi.domain.pojo.DecoderPojo;
import com.hussi.service.RuleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class RuleControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private RuleController ruleController;  // Controller to be tested

    @Mock
    private RuleService ruleService;  // Mocked RuleService

    @BeforeEach
    void setUp() {
        // Initialize MockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(ruleController).build();
    }

    @Test
    void testHussi() throws Exception {
        String input = "testInput";
        DecoderPojo pojo = DecoderPojo.builder().name(input).build();
        //when(ruleService.decode(input)).thenReturn(ResponseEntity.ok(pojo));

        // Act and Assert: Send a GET request and verify the response
        mockMvc.perform(get("/decode")
                        .param("input", input)  // Input parameter
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())  // Expect HTTP 200 OK
                .andExpect(jsonPath("$.name").value(input));
    }

//    @Test
    void testDecode_shouldReturnDecodedPojo() throws Exception {
        // Arrange: Mock the service response
        String input = "testInput";
        DecoderPojo pojo = DecoderPojo.builder().name(input).build();
        when(ruleService.decode(input)).thenReturn(ResponseEntity.ok(pojo));

        // Act and Assert: Send a GET request and verify the response
        mockMvc.perform(get("/decode")
                        .param("input", input)  // Input parameter
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())  // Expect HTTP 200 OK
                .andExpect(jsonPath("$.name").value(input));  // Verify response content
    }
}