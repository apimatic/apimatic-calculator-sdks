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
 * GetObjectDetailTypeEnum to be used.
 */
public enum GetObjectDetailTypeEnum {
    ANSWER,

    LIVEBOARD,

    DATAOBJECT,

    COLUMN,

    JOIN,

    CONNECTION,

    TAG,

    USER,

    USER_GROUP;


    private static TreeMap<String, GetObjectDetailTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ANSWER.value = "ANSWER";
        LIVEBOARD.value = "LIVEBOARD";
        DATAOBJECT.value = "DATAOBJECT";
        COLUMN.value = "COLUMN";
        JOIN.value = "JOIN";
        CONNECTION.value = "CONNECTION";
        TAG.value = "TAG";
        USER.value = "USER";
        USER_GROUP.value = "USER_GROUP";

        valueMap.put("ANSWER", ANSWER);
        valueMap.put("LIVEBOARD", LIVEBOARD);
        valueMap.put("DATAOBJECT", DATAOBJECT);
        valueMap.put("COLUMN", COLUMN);
        valueMap.put("JOIN", JOIN);
        valueMap.put("CONNECTION", CONNECTION);
        valueMap.put("TAG", TAG);
        valueMap.put("USER", USER);
        valueMap.put("USER_GROUP", USER_GROUP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static GetObjectDetailTypeEnum fromString(String toConvert) {
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
     * Convert list of GetObjectDetailTypeEnum values to list of string values.
     * @param toConvert The list of GetObjectDetailTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GetObjectDetailTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GetObjectDetailTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 