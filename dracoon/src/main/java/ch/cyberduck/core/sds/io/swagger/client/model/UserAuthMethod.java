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
import ch.cyberduck.core.sds.io.swagger.client.model.KeyValueEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Authentication method
 */
@Schema(description = "Authentication method")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class UserAuthMethod {
  @JsonProperty("authId")
  private String authId = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("options")
  private List<KeyValueEntry> options = null;

  public UserAuthMethod authId(String authId) {
    this.authId = authId;
    return this;
  }

   /**
   * Authentication method    Authentication methods:  * &#x60;basic&#x60;  * &#x60;active_directory&#x60;  * &#x60;radius&#x60;  * &#x60;openid&#x60;
   * @return authId
  **/
  @Schema(required = true, description = "Authentication method    Authentication methods:  * `basic`  * `active_directory`  * `radius`  * `openid`")
  public String getAuthId() {
    return authId;
  }

  public void setAuthId(String authId) {
    this.authId = authId;
  }

  public UserAuthMethod isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is enabled
   * @return isEnabled
  **/
  @Schema(required = true, description = "Is enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UserAuthMethod options(List<KeyValueEntry> options) {
    this.options = options;
    return this;
  }

  public UserAuthMethod addOptionsItem(KeyValueEntry optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Authentication method options
   * @return options
  **/
  @Schema(description = "Authentication method options")
  public List<KeyValueEntry> getOptions() {
    return options;
  }

  public void setOptions(List<KeyValueEntry> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthMethod userAuthMethod = (UserAuthMethod) o;
    return Objects.equals(this.authId, userAuthMethod.authId) &&
        Objects.equals(this.isEnabled, userAuthMethod.isEnabled) &&
        Objects.equals(this.options, userAuthMethod.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authId, isEnabled, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthMethod {\n");
    
    sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
