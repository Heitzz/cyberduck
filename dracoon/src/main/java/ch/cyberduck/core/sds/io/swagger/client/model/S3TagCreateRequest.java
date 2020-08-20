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
/**
 * Request model for creating a S3 tag
 */
@Schema(description = "Request model for creating a S3 tag")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class S3TagCreateRequest {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = false;

  public S3TagCreateRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * S3 tag key
   * @return key
  **/
  @Schema(required = true, description = "S3 tag key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public S3TagCreateRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * S3 tag value
   * @return value
  **/
  @Schema(required = true, description = "S3 tag value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public S3TagCreateRequest isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Determines whether S3 is mandatory or not
   * @return isMandatory
  **/
  @Schema(description = "Determines whether S3 is mandatory or not")
  public Boolean isIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3TagCreateRequest s3TagCreateRequest = (S3TagCreateRequest) o;
    return Objects.equals(this.key, s3TagCreateRequest.key) &&
        Objects.equals(this.value, s3TagCreateRequest.value) &&
        Objects.equals(this.isMandatory, s3TagCreateRequest.isMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, isMandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3TagCreateRequest {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
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
