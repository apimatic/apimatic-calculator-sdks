/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2MetadataDetailSearchRequest type.
 */
public class TspublicRestV2MetadataDetailSearchRequest {
    private SearchObjectDetailTypeEnum type;
    private List<String> id;
    private SearchObjectDetailShowHiddenEnum showHidden;
    private SearchObjectDetailDropQuestionDetailsEnum dropQuestionDetails;
    private String version;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataDetailSearchRequest() {
        showHidden = SearchObjectDetailShowHiddenEnum.ENUM_FALSE;
        dropQuestionDetails = SearchObjectDetailDropQuestionDetailsEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  type  SearchObjectDetailTypeEnum value for type.
     * @param  id  List of String value for id.
     * @param  showHidden  SearchObjectDetailShowHiddenEnum value for showHidden.
     * @param  dropQuestionDetails  SearchObjectDetailDropQuestionDetailsEnum value for
     *         dropQuestionDetails.
     * @param  version  String value for version.
     */
    public TspublicRestV2MetadataDetailSearchRequest(
            SearchObjectDetailTypeEnum type,
            List<String> id,
            SearchObjectDetailShowHiddenEnum showHidden,
            SearchObjectDetailDropQuestionDetailsEnum dropQuestionDetails,
            String version) {
        this.type = type;
        this.id = id;
        this.showHidden = showHidden;
        this.dropQuestionDetails = dropQuestionDetails;
        this.version = version;
    }

    /**
     * Getter for Type.
     * Type of the metadata object being searched. Valid values
     * @return Returns the SearchObjectDetailTypeEnum
     */
    @JsonGetter("type")
    public SearchObjectDetailTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the metadata object being searched. Valid values
     * @param type Value for SearchObjectDetailTypeEnum
     */
    @JsonSetter("type")
    public void setType(SearchObjectDetailTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * A JSON array of GUIDs of the objects.
     * @return Returns the List of String
     */
    @JsonGetter("id")
    public List<String> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A JSON array of GUIDs of the objects.
     * @param id Value for List of String
     */
    @JsonSetter("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Getter for ShowHidden.
     * When set to true, returns details of the hidden objects, such as a column in a worksheet or a
     * table.
     * @return Returns the SearchObjectDetailShowHiddenEnum
     */
    @JsonGetter("showHidden")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchObjectDetailShowHiddenEnum getShowHidden() {
        return showHidden;
    }

    /**
     * Setter for ShowHidden.
     * When set to true, returns details of the hidden objects, such as a column in a worksheet or a
     * table.
     * @param showHidden Value for SearchObjectDetailShowHiddenEnum
     */
    @JsonSetter("showHidden")
    public void setShowHidden(SearchObjectDetailShowHiddenEnum showHidden) {
        this.showHidden = showHidden;
    }

    /**
     * Getter for DropQuestionDetails.
     * When set to true, the search assist data associated with a worksheet is not included in the
     * API response. This attribute is applicable only for DATAOBJECT data type.
     * @return Returns the SearchObjectDetailDropQuestionDetailsEnum
     */
    @JsonGetter("dropQuestionDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchObjectDetailDropQuestionDetailsEnum getDropQuestionDetails() {
        return dropQuestionDetails;
    }

    /**
     * Setter for DropQuestionDetails.
     * When set to true, the search assist data associated with a worksheet is not included in the
     * API response. This attribute is applicable only for DATAOBJECT data type.
     * @param dropQuestionDetails Value for SearchObjectDetailDropQuestionDetailsEnum
     */
    @JsonSetter("dropQuestionDetails")
    public void setDropQuestionDetails(SearchObjectDetailDropQuestionDetailsEnum dropQuestionDetails) {
        this.dropQuestionDetails = dropQuestionDetails;
    }

    /**
     * Getter for Version.
     * Specify the version to retrieve the objects from. By default, the API returns metadata for
     * all versions of the object.
     * @return Returns the String
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * Specify the version to retrieve the objects from. By default, the API returns metadata for
     * all versions of the object.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Converts this TspublicRestV2MetadataDetailSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2MetadataDetailSearchRequest [" + "type=" + type + ", id=" + id
                + ", showHidden=" + showHidden + ", dropQuestionDetails=" + dropQuestionDetails
                + ", version=" + version + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2MetadataDetailSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2MetadataDetailSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id)
                .showHidden(getShowHidden())
                .dropQuestionDetails(getDropQuestionDetails())
                .version(getVersion());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2MetadataDetailSearchRequest}.
     */
    public static class Builder {
        private SearchObjectDetailTypeEnum type;
        private List<String> id;
        private SearchObjectDetailShowHiddenEnum showHidden =
                SearchObjectDetailShowHiddenEnum.ENUM_FALSE;
        private SearchObjectDetailDropQuestionDetailsEnum dropQuestionDetails =
                SearchObjectDetailDropQuestionDetailsEnum.ENUM_FALSE;
        private String version;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  SearchObjectDetailTypeEnum value for type.
         * @param  id  List of String value for id.
         */
        public Builder(SearchObjectDetailTypeEnum type, List<String> id) {
            this.type = type;
            this.id = id;
        }

        /**
         * Setter for type.
         * @param  type  SearchObjectDetailTypeEnum value for type.
         * @return Builder
         */
        public Builder type(SearchObjectDetailTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  List of String value for id.
         * @return Builder
         */
        public Builder id(List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for showHidden.
         * @param  showHidden  SearchObjectDetailShowHiddenEnum value for showHidden.
         * @return Builder
         */
        public Builder showHidden(SearchObjectDetailShowHiddenEnum showHidden) {
            this.showHidden = showHidden;
            return this;
        }

        /**
         * Setter for dropQuestionDetails.
         * @param  dropQuestionDetails  SearchObjectDetailDropQuestionDetailsEnum value for
         *         dropQuestionDetails.
         * @return Builder
         */
        public Builder dropQuestionDetails(
                SearchObjectDetailDropQuestionDetailsEnum dropQuestionDetails) {
            this.dropQuestionDetails = dropQuestionDetails;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2MetadataDetailSearchRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2MetadataDetailSearchRequest}
         */
        public TspublicRestV2MetadataDetailSearchRequest build() {
            return new TspublicRestV2MetadataDetailSearchRequest(type, id, showHidden,
                    dropQuestionDetails, version);
        }
    }
}
