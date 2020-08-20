/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-08-05 13:11:50<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.23.0-beta.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/**
 * Request model for creating a room
 */
@Schema(description = "Request model for creating a room")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class CreateRoomRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentId")
  private Long parentId = 0l;

  @JsonProperty("recycleBinRetentionPeriod")
  private Integer recycleBinRetentionPeriod = null;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("inheritPermissions")
  private Boolean inheritPermissions = null;

  @JsonProperty("adminIds")
  private List<Long> adminIds = null;

  @JsonProperty("adminGroupIds")
  private List<Long> adminGroupIds = null;

  /**
   * Behaviour when new users are added to the group:  * &#x60;autoallow&#x60;  * &#x60;pending&#x60;    Only relevant if &#x60;adminGroupIds&#x60; has items.
   */
  public enum NewGroupMemberAcceptanceEnum {
    AUTOALLOW("autoallow"),
    PENDING("pending");

    private String value;

    NewGroupMemberAcceptanceEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static NewGroupMemberAcceptanceEnum fromValue(String text) {
      for (NewGroupMemberAcceptanceEnum b : NewGroupMemberAcceptanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("newGroupMemberAcceptance")
  private NewGroupMemberAcceptanceEnum newGroupMemberAcceptance = NewGroupMemberAcceptanceEnum.AUTOALLOW;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("hasActivitiesLog")
  private Boolean hasActivitiesLog = true;

  /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    Provided (or default) classification is taken from room  when file gets uploaded without any classification.
   */
  public enum ClassificationEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    ClassificationEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClassificationEnum fromValue(String text) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("classification")
  private ClassificationEnum classification = ClassificationEnum.NUMBER_2;

  @JsonProperty("timestampCreation")
  private DateTime timestampCreation = null;

  @JsonProperty("timestampModification")
  private DateTime timestampModification = null;

  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  public CreateRoomRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(required = true, description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRoomRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent room ID or &#x60;null&#x60; to create a top level room
   * @return parentId
  **/
  @Schema(description = "Parent room ID or `null` to create a top level room")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public CreateRoomRequest recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }

   /**
   * Retention period for deleted nodes in days
   * minimum: 0
   * maximum: 9999
   * @return recycleBinRetentionPeriod
  **/
  @Schema(description = "Retention period for deleted nodes in days")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }

  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }

  public CreateRoomRequest quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Quota in byte
   * @return quota
  **/
  @Schema(description = "Quota in byte")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public CreateRoomRequest inheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
    return this;
  }

   /**
   * Inherit permissions from parent room  (default: &#x60;false&#x60; if &#x60;parentId&#x60; is &#x60;0&#x60;; otherwise: &#x60;true&#x60;)
   * @return inheritPermissions
  **/
  @Schema(description = "Inherit permissions from parent room  (default: `false` if `parentId` is `0`; otherwise: `true`)")
  public Boolean isInheritPermissions() {
    return inheritPermissions;
  }

  public void setInheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
  }

  public CreateRoomRequest adminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
    return this;
  }

  public CreateRoomRequest addAdminIdsItem(Long adminIdsItem) {
    if (this.adminIds == null) {
      this.adminIds = new ArrayList<>();
    }
    this.adminIds.add(adminIdsItem);
    return this;
  }

   /**
   * List of user ids  A room requires at least one admin (user or group)
   * @return adminIds
  **/
  @Schema(description = "List of user ids  A room requires at least one admin (user or group)")
  public List<Long> getAdminIds() {
    return adminIds;
  }

  public void setAdminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
  }

  public CreateRoomRequest adminGroupIds(List<Long> adminGroupIds) {
    this.adminGroupIds = adminGroupIds;
    return this;
  }

  public CreateRoomRequest addAdminGroupIdsItem(Long adminGroupIdsItem) {
    if (this.adminGroupIds == null) {
      this.adminGroupIds = new ArrayList<>();
    }
    this.adminGroupIds.add(adminGroupIdsItem);
    return this;
  }

   /**
   * List of group ids  A room requires at least one admin (user or group)
   * @return adminGroupIds
  **/
  @Schema(description = "List of group ids  A room requires at least one admin (user or group)")
  public List<Long> getAdminGroupIds() {
    return adminGroupIds;
  }

  public void setAdminGroupIds(List<Long> adminGroupIds) {
    this.adminGroupIds = adminGroupIds;
  }

  public CreateRoomRequest newGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
    return this;
  }

   /**
   * Behaviour when new users are added to the group:  * &#x60;autoallow&#x60;  * &#x60;pending&#x60;    Only relevant if &#x60;adminGroupIds&#x60; has items.
   * @return newGroupMemberAcceptance
  **/
  @Schema(description = "Behaviour when new users are added to the group:  * `autoallow`  * `pending`    Only relevant if `adminGroupIds` has items.")
  public NewGroupMemberAcceptanceEnum getNewGroupMemberAcceptance() {
    return newGroupMemberAcceptance;
  }

  public void setNewGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
  }

  public CreateRoomRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes  Use empty string to remove.
   * @return notes
  **/
  @Schema(description = "User notes  Use empty string to remove.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CreateRoomRequest hasActivitiesLog(Boolean hasActivitiesLog) {
    this.hasActivitiesLog = hasActivitiesLog;
    return this;
  }

   /**
   * Is activities log active (for rooms only)
   * @return hasActivitiesLog
  **/
  @Schema(description = "Is activities log active (for rooms only)")
  public Boolean isHasActivitiesLog() {
    return hasActivitiesLog;
  }

  public void setHasActivitiesLog(Boolean hasActivitiesLog) {
    this.hasActivitiesLog = hasActivitiesLog;
  }

  public CreateRoomRequest classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    Provided (or default) classification is taken from room  when file gets uploaded without any classification.
   * @return classification
  **/
  @Schema(description = "Classification ID:  * `1` - public  * `2` - internal  * `3` - confidential  * `4` - strictly confidential    Provided (or default) classification is taken from room  when file gets uploaded without any classification.")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public CreateRoomRequest timestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)
   * @return timestampCreation
  **/
  @Schema(required = true, description = "&#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampCreation() {
    return timestampCreation;
  }

  public void setTimestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
  }

  public CreateRoomRequest timestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)
   * @return timestampModification
  **/
  @Schema(required = true, description = "&#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampModification() {
    return timestampModification;
  }

  public void setTimestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
  }

  public CreateRoomRequest hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).
   * @return hasRecycleBin
  **/
  @Schema(description = "&#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).")
  public Boolean isHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomRequest createRoomRequest = (CreateRoomRequest) o;
    return Objects.equals(this.name, createRoomRequest.name) &&
        Objects.equals(this.parentId, createRoomRequest.parentId) &&
        Objects.equals(this.recycleBinRetentionPeriod, createRoomRequest.recycleBinRetentionPeriod) &&
        Objects.equals(this.quota, createRoomRequest.quota) &&
        Objects.equals(this.inheritPermissions, createRoomRequest.inheritPermissions) &&
        Objects.equals(this.adminIds, createRoomRequest.adminIds) &&
        Objects.equals(this.adminGroupIds, createRoomRequest.adminGroupIds) &&
        Objects.equals(this.newGroupMemberAcceptance, createRoomRequest.newGroupMemberAcceptance) &&
        Objects.equals(this.notes, createRoomRequest.notes) &&
        Objects.equals(this.hasActivitiesLog, createRoomRequest.hasActivitiesLog) &&
        Objects.equals(this.classification, createRoomRequest.classification) &&
        Objects.equals(this.timestampCreation, createRoomRequest.timestampCreation) &&
        Objects.equals(this.timestampModification, createRoomRequest.timestampModification) &&
        Objects.equals(this.hasRecycleBin, createRoomRequest.hasRecycleBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentId, recycleBinRetentionPeriod, quota, inheritPermissions, adminIds, adminGroupIds, newGroupMemberAcceptance, notes, hasActivitiesLog, classification, timestampCreation, timestampModification, hasRecycleBin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoomRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    inheritPermissions: ").append(toIndentedString(inheritPermissions)).append("\n");
    sb.append("    adminIds: ").append(toIndentedString(adminIds)).append("\n");
    sb.append("    adminGroupIds: ").append(toIndentedString(adminGroupIds)).append("\n");
    sb.append("    newGroupMemberAcceptance: ").append(toIndentedString(newGroupMemberAcceptance)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    hasActivitiesLog: ").append(toIndentedString(hasActivitiesLog)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    timestampCreation: ").append(toIndentedString(timestampCreation)).append("\n");
    sb.append("    timestampModification: ").append(toIndentedString(timestampModification)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
