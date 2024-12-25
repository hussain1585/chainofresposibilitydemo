package com.hussi.domain.businessRules;

import com.hussi.domain.pojo.DecoderPojo;

import java.util.function.Predicate;

public interface OptionalBusinessRule extends BusinessRule {
    boolean check(String str,Predicate<String> predicate);
}





