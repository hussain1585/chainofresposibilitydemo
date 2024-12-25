package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MandatoryRule2 implements MandatoryBusinessRule {

    @Override
    public void apply(DecoderPojo pojo) {
        System.out.println("Mandatory Rule 2 executed");
    }
}
