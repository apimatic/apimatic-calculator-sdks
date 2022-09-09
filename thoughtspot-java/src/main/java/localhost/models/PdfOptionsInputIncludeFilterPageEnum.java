/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * PdfOptionsInputIncludeFilterPageEnum to be used.
 */
public enum PdfOptionsInputIncludeFilterPageEnum {
    ENUM_TRUE,

    ENUM_FALSE;


    private static TreeMap<String, PdfOptionsInputIncludeFilterPageEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_TRUE.value = "true";
        ENUM_FALSE.value = "false";

        valueMap.put("true", ENUM_TRUE);
        valueMap.put("false", ENUM_FALSE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PdfOptionsInputIncludeFilterPageEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of PdfOptionsInputIncludeFilterPageEnum values to list of string values.
     * @param toConvert The list of PdfOptionsInputIncludeFilterPageEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PdfOptionsInputIncludeFilterPageEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PdfOptionsInputIncludeFilterPageEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 