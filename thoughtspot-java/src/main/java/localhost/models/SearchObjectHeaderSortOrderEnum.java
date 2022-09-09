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
 * SearchObjectHeaderSortOrderEnum to be used.
 */
public enum SearchObjectHeaderSortOrderEnum {
    DEFAULT,

    ASC,

    DESC;


    private static TreeMap<String, SearchObjectHeaderSortOrderEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DEFAULT.value = "DEFAULT";
        ASC.value = "ASC";
        DESC.value = "DESC";

        valueMap.put("DEFAULT", DEFAULT);
        valueMap.put("ASC", ASC);
        valueMap.put("DESC", DESC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SearchObjectHeaderSortOrderEnum fromString(String toConvert) {
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
     * Convert list of SearchObjectHeaderSortOrderEnum values to list of string values.
     * @param toConvert The list of SearchObjectHeaderSortOrderEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SearchObjectHeaderSortOrderEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SearchObjectHeaderSortOrderEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 