package com.vitoria;

public class Normaliser {

    public static String ARCHITECT = "Architect";
    public static String ACCOUNTANT = "Accountant";
    public static String SOFTWARE_ENGINEER = "Software engineer";
    public static String QUANTITY_SURVEYOR = "Quantity surveyor";

    public String normalise(String value) {
        String lowerCaseValue = value.toLowerCase();
        if (lowerCaseValue.contains("architect")) {
            return ARCHITECT;
        } else if (lowerCaseValue.contains("accountant")) {
            return ACCOUNTANT;
        } else if (lowerCaseValue.contains("software") || lowerCaseValue.contains("engineer")) {
            return SOFTWARE_ENGINEER;
        } else if (lowerCaseValue.contains("quantity") || lowerCaseValue.contains("surveyor")) {
            return QUANTITY_SURVEYOR;
        }
        return "";
    }

}
