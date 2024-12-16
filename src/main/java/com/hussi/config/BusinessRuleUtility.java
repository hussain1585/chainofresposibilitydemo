package com.hussi.config;

import java.util.function.Function;

public class BusinessRuleUtility {

    // Mandatory Business Rules
    public static Function<String, String> trimEnds = input -> input.trim();
    public static Function<String, String> removeSpecialCharacters = input -> input.replaceAll("[^a-zA-Z0-9]", "");
    public static Function<String, String> enforceLength = input -> input.length() > 11 ? input.substring(0, 11) : input;

    // Optional Business Rules
    public static Function<String, Boolean> shouldApplyGroupA = input -> input.startsWith("A");
    public static Function<String, String> applyGroupA = input -> "GroupA-" + input;

    public static Function<String, Boolean> shouldApplyGroupB = input -> input.startsWith("B");
    public static Function<String, String> applyGroupB = input -> "GroupB-" + input;
}