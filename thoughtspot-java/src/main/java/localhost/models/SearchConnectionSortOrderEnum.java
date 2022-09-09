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
 * SearchConnectionSortOrderEnum to be used.
 */
public enum SearchConnectionSortOrderEnum {
    DEFAULT,

    ASC,

    DESC;


    private static TreeMap<String, SearchConnectionSortOrderEnum> valueMap = new TreeMap<>();
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
    public static SearchConnectionSortOrderEnum fromString(String toConvert) {
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
     * Convert list of SearchConnectionSortOrderEnum values to list of string values.
     * @param toConvert The list of SearchConnectionSortOrderEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SearchConnectionSortOrderEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SearchConnectionSortOrderEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 