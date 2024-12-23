package com.hussi.rest;

import com.hussi.domain.pojo.DecoderPojo;
import com.hussi.service.RuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RuleController {

    private final RuleService ruleService;

    @GetMapping("/decode")
    public ResponseEntity<DecoderPojo> decode(@RequestParam String input) {
        return ruleService.decode(input);
    }
}
