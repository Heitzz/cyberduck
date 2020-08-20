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
 * Recover usernames for email
 */
@Schema(description = "Recover usernames for email")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class RecoverUserNameRequest {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("creatorLanguage")
  private String creatorLanguage = null;

  public RecoverUserNameRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email 
   * @return email
  **/
  @Schema(required = true, description = "Email ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RecoverUserNameRequest creatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
    return this;
  }

   /**
   * IETF language tag
   * @return creatorLanguage
  **/
  @Schema(description = "IETF language tag")
  public String getCreatorLanguage() {
    return creatorLanguage;
  }

  public void setCreatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoverUserNameRequest recoverUserNameRequest = (RecoverUserNameRequest) o;
    return Objects.equals(this.email, recoverUserNameRequest.email) &&
        Objects.equals(this.creatorLanguage, recoverUserNameRequest.creatorLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, creatorLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoverUserNameRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    creatorLanguage: ").append(toIndentedString(creatorLanguage)).append("\n");
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
