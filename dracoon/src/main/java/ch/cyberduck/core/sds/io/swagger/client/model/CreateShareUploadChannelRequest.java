/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
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
import org.joda.time.DateTime;
/**
 * Request model for creating an upload channel
 */
@Schema(description = "Request model for creating an upload channel")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class CreateShareUploadChannelRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("directS3Upload")
  private Boolean directS3Upload = false;

  @JsonProperty("timestampCreation")
  private DateTime timestampCreation = null;

  @JsonProperty("timestampModification")
  private DateTime timestampModification = null;

  public CreateShareUploadChannelRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File name
   * @return name
  **/
  @Schema(required = true, description = "File name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateShareUploadChannelRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size in byte
   * @return size
  **/
  @Schema(description = "File size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public CreateShareUploadChannelRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @Schema(description = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateShareUploadChannelRequest directS3Upload(Boolean directS3Upload) {
    this.directS3Upload = directS3Upload;
    return this;
  }

   /**
   * &amp;#128640; Since v4.15.0  Upload direct to S3
   * @return directS3Upload
  **/
  @Schema(description = "&#128640; Since v4.15.0  Upload direct to S3")
  public Boolean isDirectS3Upload() {
    return directS3Upload;
  }

  public void setDirectS3Upload(Boolean directS3Upload) {
    this.directS3Upload = directS3Upload;
  }

  public CreateShareUploadChannelRequest timestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)
   * @return timestampCreation
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the node was created on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampCreation() {
    return timestampCreation;
  }

  public void setTimestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
  }

  public CreateShareUploadChannelRequest timestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)
   * @return timestampModification
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the content of a node was last modified on external file system  (default: current server datetime in UTC format)")
  public DateTime getTimestampModification() {
    return timestampModification;
  }

  public void setTimestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareUploadChannelRequest createShareUploadChannelRequest = (CreateShareUploadChannelRequest) o;
    return Objects.equals(this.name, createShareUploadChannelRequest.name) &&
        Objects.equals(this.size, createShareUploadChannelRequest.size) &&
        Objects.equals(this.password, createShareUploadChannelRequest.password) &&
        Objects.equals(this.directS3Upload, createShareUploadChannelRequest.directS3Upload) &&
        Objects.equals(this.timestampCreation, createShareUploadChannelRequest.timestampCreation) &&
        Objects.equals(this.timestampModification, createShareUploadChannelRequest.timestampModification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, password, directS3Upload, timestampCreation, timestampModification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareUploadChannelRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    directS3Upload: ").append(toIndentedString(directS3Upload)).append("\n");
    sb.append("    timestampCreation: ").append(toIndentedString(timestampCreation)).append("\n");
    sb.append("    timestampModification: ").append(toIndentedString(timestampModification)).append("\n");
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
