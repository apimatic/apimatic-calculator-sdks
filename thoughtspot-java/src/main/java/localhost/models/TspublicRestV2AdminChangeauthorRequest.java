/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2AdminChangeauthorRequest type.
 */
public class TspublicRestV2AdminChangeauthorRequest {
    private List<String> tsObjectId;
    private FromUserNameAndIDInput fromUser;
    private ToUserNameAndIDInput toUser;

    /**
     * Default constructor.
     */
    public TspublicRestV2AdminChangeauthorRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tsObjectId  List of String value for tsObjectId.
     * @param  fromUser  FromUserNameAndIDInput value for fromUser.
     * @param  toUser  ToUserNameAndIDInput value for toUser.
     */
    public TspublicRestV2AdminChangeauthorRequest(
            List<String> tsObjectId,
            FromUserNameAndIDInput fromUser,
            ToUserNameAndIDInput toUser) {
        this.tsObjectId = tsObjectId;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    /**
     * Getter for TsObjectId.
     * A JSON array of GUIDs of the metadata objects. To change author of all the objects owned by a
     * user, provide single input as ALL. If multiple object ids along with ALL is provided as
     * input, then ALL will be considered.
     * @return Returns the List of String
     */
    @JsonGetter("tsObjectId")
    public List<String> getTsObjectId() {
        return tsObjectId;
    }

    /**
     * Setter for TsObjectId.
     * A JSON array of GUIDs of the metadata objects. To change author of all the objects owned by a
     * user, provide single input as ALL. If multiple object ids along with ALL is provided as
     * input, then ALL will be considered.
     * @param tsObjectId Value for List of String
     */
    @JsonSetter("tsObjectId")
    public void setTsObjectId(List<String> tsObjectId) {
        this.tsObjectId = tsObjectId;
    }

    /**
     * Getter for FromUser.
     * A JSON object of name or GUIDs of the current owner of the objects. When both are given then
     * id is considered. If a list of object ids are provided as input for TsObjectId, then only for
     * those ids that have owner as the value provided in fromUser, the owner will be changed.
     * Provide either name or id as input. When both are given user id will be considered.
     * @return Returns the FromUserNameAndIDInput
     */
    @JsonGetter("fromUser")
    public FromUserNameAndIDInput getFromUser() {
        return fromUser;
    }

    /**
     * Setter for FromUser.
     * A JSON object of name or GUIDs of the current owner of the objects. When both are given then
     * id is considered. If a list of object ids are provided as input for TsObjectId, then only for
     * those ids that have owner as the value provided in fromUser, the owner will be changed.
     * Provide either name or id as input. When both are given user id will be considered.
     * @param fromUser Value for FromUserNameAndIDInput
     */
    @JsonSetter("fromUser")
    public void setFromUser(FromUserNameAndIDInput fromUser) {
        this.fromUser = fromUser;
    }

    /**
     * Getter for ToUser.
     * A JSON object of name or GUIDs of the new owner for the objects. When both are given then id
     * is considered.
     * @return Returns the ToUserNameAndIDInput
     */
    @JsonGetter("toUser")
    public ToUserNameAndIDInput getToUser() {
        return toUser;
    }

    /**
     * Setter for ToUser.
     * A JSON object of name or GUIDs of the new owner for the objects. When both are given then id
     * is considered.
     * @param toUser Value for ToUserNameAndIDInput
     */
    @JsonSetter("toUser")
    public void setToUser(ToUserNameAndIDInput toUser) {
        this.toUser = toUser;
    }

    /**
     * Converts this TspublicRestV2AdminChangeauthorRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2AdminChangeauthorRequest [" + "tsObjectId=" + tsObjectId
                + ", fromUser=" + fromUser + ", toUser=" + toUser + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2AdminChangeauthorRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2AdminChangeauthorRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tsObjectId, fromUser, toUser);
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2AdminChangeauthorRequest}.
     */
    public static class Builder {
        private List<String> tsObjectId;
        private FromUserNameAndIDInput fromUser;
        private ToUserNameAndIDInput toUser;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tsObjectId  List of String value for tsObjectId.
         * @param  fromUser  FromUserNameAndIDInput value for fromUser.
         * @param  toUser  ToUserNameAndIDInput value for toUser.
         */
        public Builder(List<String> tsObjectId, FromUserNameAndIDInput fromUser,
                ToUserNameAndIDInput toUser) {
            this.tsObjectId = tsObjectId;
            this.fromUser = fromUser;
            this.toUser = toUser;
        }

        /**
         * Setter for tsObjectId.
         * @param  tsObjectId  List of String value for tsObjectId.
         * @return Builder
         */
        public Builder tsObjectId(List<String> tsObjectId) {
            this.tsObjectId = tsObjectId;
            return this;
        }

        /**
         * Setter for fromUser.
         * @param  fromUser  FromUserNameAndIDInput value for fromUser.
         * @return Builder
         */
        public Builder fromUser(FromUserNameAndIDInput fromUser) {
            this.fromUser = fromUser;
            return this;
        }

        /**
         * Setter for toUser.
         * @param  toUser  ToUserNameAndIDInput value for toUser.
         * @return Builder
         */
        public Builder toUser(ToUserNameAndIDInput toUser) {
            this.toUser = toUser;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2AdminChangeauthorRequest} object using the set fields.
         * @return {@link TspublicRestV2AdminChangeauthorRequest}
         */
        public TspublicRestV2AdminChangeauthorRequest build() {
            return new TspublicRestV2AdminChangeauthorRequest(tsObjectId, fromUser, toUser);
        }
    }
}
