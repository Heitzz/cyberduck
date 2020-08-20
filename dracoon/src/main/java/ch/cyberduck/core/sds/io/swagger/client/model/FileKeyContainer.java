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
 * File key container
 */
@Schema(description = "File key container")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class FileKeyContainer {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("iv")
  private String iv = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("tag")
  private String tag = null;

  public FileKeyContainer key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Encryption key
   * @return key
  **/
  @Schema(required = true, description = "Encryption key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FileKeyContainer iv(String iv) {
    this.iv = iv;
    return this;
  }

   /**
   * Initial vector
   * @return iv
  **/
  @Schema(required = true, description = "Initial vector")
  public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }

  public FileKeyContainer version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version
   * @return version
  **/
  @Schema(required = true, description = "Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public FileKeyContainer tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Authentication tag  (needed with authenticated encryption)
   * @return tag
  **/
  @Schema(description = "Authentication tag  (needed with authenticated encryption)")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileKeyContainer fileKeyContainer = (FileKeyContainer) o;
    return Objects.equals(this.key, fileKeyContainer.key) &&
        Objects.equals(this.iv, fileKeyContainer.iv) &&
        Objects.equals(this.version, fileKeyContainer.version) &&
        Objects.equals(this.tag, fileKeyContainer.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, iv, version, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileKeyContainer {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
