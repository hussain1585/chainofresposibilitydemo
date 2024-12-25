package com.hussi.config;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class BusinessRuleUtility {
    // Mandatory Business Rules
    public static Function<String, String> mandatory_function_1_trimEnds = input -> input.trim();
    public static Function<String, String> mandatory_function_2_removeSpecialCharacters = input -> input.replaceAll("[^a-zA-Z0-9]", "");
    public static Function<String, String> mandatory_function_3_enforceLength = input -> input.length() > 11 ? input.substring(0, 11) : input;

    // Optional Business Rules
    public static Function<String, Boolean> optional_function_1_shouldApplyGroupA = input -> input.startsWith("A");
    public static Function<String, String> optional_function_2_applyGroupA = input -> "GroupA-" + input;

    public static Function<String, Boolean> optional_function_3_shouldApplyGroupB = input -> input.startsWith("B");
    public static Function<String, String> optional_function_4_applyGroupB = input -> "GroupB-" + input;

    public static Predicate<String> predicate1 = str -> str != null && str.length() > 10;
    static String alphanumericPattern = "^[a-zA-Z0-9]+$";
    static Pattern pattern = Pattern.compile(alphanumericPattern);
    public static Predicate<String> predicate2 = str -> str != null && pattern.matcher(str).matches();
    public static Predicate<String> predicate3 = str -> str != null && str.startsWith("asd");
}