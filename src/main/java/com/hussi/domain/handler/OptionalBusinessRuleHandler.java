package com.hussi.domain.handler;

public interface OptionalBusinessRuleHandler extends BusinessRuleHandler {
    boolean shouldApply(String input);
}