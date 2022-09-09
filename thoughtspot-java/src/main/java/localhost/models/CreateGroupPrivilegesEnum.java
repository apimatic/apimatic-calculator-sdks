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
 * CreateGroupPrivilegesEnum to be used.
 */
public enum CreateGroupPrivilegesEnum {
    ADMINISTRATION,

    AUTHORING,

    DEVELOPER,

    USERDATAUPLOADING,

    DATADOWNLOADING,

    DATAMANAGEMENT,

    SHAREWITHALL,

    EXPERIMENTALFEATUREPRIVILEGE,

    JOBSCHEDULING,

    RANALYSIS,

    A3ANALYSIS,

    BYPASSRLS;


    private static TreeMap<String, CreateGroupPrivilegesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ADMINISTRATION.value = "ADMINISTRATION";
        AUTHORING.value = "AUTHORING";
        DEVELOPER.value = "DEVELOPER";
        USERDATAUPLOADING.value = "USERDATAUPLOADING";
        DATADOWNLOADING.value = "DATADOWNLOADING";
        DATAMANAGEMENT.value = "DATAMANAGEMENT";
        SHAREWITHALL.value = "SHAREWITHALL";
        EXPERIMENTALFEATUREPRIVILEGE.value = "EXPERIMENTALFEATUREPRIVILEGE";
        JOBSCHEDULING.value = "JOBSCHEDULING";
        RANALYSIS.value = "RANALYSIS";
        A3ANALYSIS.value = "A3ANALYSIS";
        BYPASSRLS.value = "BYPASSRLS";

        valueMap.put("ADMINISTRATION", ADMINISTRATION);
        valueMap.put("AUTHORING", AUTHORING);
        valueMap.put("DEVELOPER", DEVELOPER);
        valueMap.put("USERDATAUPLOADING", USERDATAUPLOADING);
        valueMap.put("DATADOWNLOADING", DATADOWNLOADING);
        valueMap.put("DATAMANAGEMENT", DATAMANAGEMENT);
        valueMap.put("SHAREWITHALL", SHAREWITHALL);
        valueMap.put("EXPERIMENTALFEATUREPRIVILEGE", EXPERIMENTALFEATUREPRIVILEGE);
        valueMap.put("JOBSCHEDULING", JOBSCHEDULING);
        valueMap.put("RANALYSIS", RANALYSIS);
        valueMap.put("A3ANALYSIS", A3ANALYSIS);
        valueMap.put("BYPASSRLS", BYPASSRLS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CreateGroupPrivilegesEnum fromString(String toConvert) {
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
     * Convert list of CreateGroupPrivilegesEnum values to list of string values.
     * @param toConvert The list of CreateGroupPrivilegesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreateGroupPrivilegesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreateGroupPrivilegesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 