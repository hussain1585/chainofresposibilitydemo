package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.function.Predicate;

@Component
public class OptionalRule2 implements OptionalBusinessRule {
    @Override
    public boolean check(String str, Predicate<String> predicate) {
        System.out.println("Optional Rule 2 check executed");
        return predicate.test(str);
    }

    @Override
    public void apply(DecoderPojo pojo) {
        System.out.println("Optional Rule 2 executed");

    }
}
