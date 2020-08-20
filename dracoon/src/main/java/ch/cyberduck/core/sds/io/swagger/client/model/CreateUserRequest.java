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
import ch.cyberduck.core.sds.io.swagger.client.model.ObjectExpiration;
import ch.cyberduck.core.sds.io.swagger.client.model.UserAuthData;
import ch.cyberduck.core.sds.io.swagger.client.model.UserAuthMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Request model for creating an user
 */
@Schema(description = "Request model for creating an user")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class CreateUserRequest {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("receiverLanguage")
  private String receiverLanguage = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("notifyUser")
  private Boolean notifyUser = null;

  @JsonProperty("authData")
  private UserAuthData authData = null;

  @JsonProperty("isNonmemberViewer")
  private Boolean isNonmemberViewer = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("authMethods")
  private List<UserAuthMethod> authMethods = null;

  @JsonProperty("needsToChangePassword")
  private Boolean needsToChangePassword = null;

  @JsonProperty("gender")
  private String gender = "n";

  public CreateUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * User first name
   * @return firstName
  **/
  @Schema(required = true, description = "User first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User last name
   * @return lastName
  **/
  @Schema(required = true, description = "User last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * &amp;#128640; Since v4.13.0  Username
   * @return userName
  **/
  @Schema(description = "&#128640; Since v4.13.0  Username")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CreateUserRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number
   * @return phone
  **/
  @Schema(description = "Phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateUserRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public CreateUserRequest receiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
    return this;
  }

   /**
   * IETF language tag
   * @return receiverLanguage
  **/
  @Schema(description = "IETF language tag")
  public String getReceiverLanguage() {
    return receiverLanguage;
  }

  public void setReceiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
  }

  public CreateUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email 
   * @return email
  **/
  @Schema(description = "Email ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserRequest notifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
    return this;
  }

   /**
   * &amp;#128640; Since v4.9.0  Notify user about his new account  * default: &#x60;true&#x60; for &#x60;basic&#x60; auth type  * default: &#x60;false&#x60; for &#x60;active_directory&#x60;, &#x60;openid&#x60; and &#x60;radius&#x60; auth types
   * @return notifyUser
  **/
  @Schema(description = "&#128640; Since v4.9.0  Notify user about his new account  * default: `true` for `basic` auth type  * default: `false` for `active_directory`, `openid` and `radius` auth types")
  public Boolean isNotifyUser() {
    return notifyUser;
  }

  public void setNotifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
  }

  public CreateUserRequest authData(UserAuthData authData) {
    this.authData = authData;
    return this;
  }

   /**
   * Get authData
   * @return authData
  **/
  @Schema(description = "")
  public UserAuthData getAuthData() {
    return authData;
  }

  public void setAuthData(UserAuthData authData) {
    this.authData = authData;
  }

  public CreateUserRequest isNonmemberViewer(Boolean isNonmemberViewer) {
    this.isNonmemberViewer = isNonmemberViewer;
    return this;
  }

   /**
   * &amp;#128640; Since v4.12.0  Determines whether user has the role NONMEMBER_VIEWER
   * @return isNonmemberViewer
  **/
  @Schema(description = "&#128640; Since v4.12.0  Determines whether user has the role NONMEMBER_VIEWER")
  public Boolean isIsNonmemberViewer() {
    return isNonmemberViewer;
  }

  public void setIsNonmemberViewer(Boolean isNonmemberViewer) {
    this.isNonmemberViewer = isNonmemberViewer;
  }

  public CreateUserRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.18.0  Job title
   * @return title
  **/
  @Schema(description = "&#128679; Deprecated since v4.18.0  Job title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateUserRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.13.0  An initial password may be preset  use &#x60;authData&#x60; instead
   * @return password
  **/
  @Schema(description = "&#128679; Deprecated since v4.13.0  An initial password may be preset  use `authData` instead")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserRequest login(String login) {
    this.login = login;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.13.0  User login name
   * @return login
  **/
  @Schema(description = "&#128679; Deprecated since v4.13.0  User login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public CreateUserRequest authMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }

  public CreateUserRequest addAuthMethodsItem(UserAuthMethod authMethodsItem) {
    if (this.authMethods == null) {
      this.authMethods = new ArrayList<>();
    }
    this.authMethods.add(authMethodsItem);
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.13.0  Authentication methods:  * &#x60;sql&#x60;  * &#x60;active_directory&#x60;  * &#x60;radius&#x60;  * &#x60;openid&#x60;  use &#x60;authData&#x60; instead
   * @return authMethods
  **/
  @Schema(description = "&#128679; Deprecated since v4.13.0  Authentication methods:  * `sql`  * `active_directory`  * `radius`  * `openid`  use `authData` instead")
  public List<UserAuthMethod> getAuthMethods() {
    return authMethods;
  }

  public void setAuthMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
  }

  public CreateUserRequest needsToChangePassword(Boolean needsToChangePassword) {
    this.needsToChangePassword = needsToChangePassword;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.13.0  Determines whether user has to change his / her initial password.  use &#x60;authDate.mustChangePassword&#x60; instead
   * @return needsToChangePassword
  **/
  @Schema(description = "&#128679; Deprecated since v4.13.0  Determines whether user has to change his / her initial password.  use `authDate.mustChangePassword` instead")
  public Boolean isNeedsToChangePassword() {
    return needsToChangePassword;
  }

  public void setNeedsToChangePassword(Boolean needsToChangePassword) {
    this.needsToChangePassword = needsToChangePassword;
  }

  public CreateUserRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.12.0  Gender  Do NOT use &#x60;gender&#x60;! It will be ignored.
   * @return gender
  **/
  @Schema(description = "&#128679; Deprecated since v4.12.0  Gender  Do NOT use `gender`! It will be ignored.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.firstName, createUserRequest.firstName) &&
        Objects.equals(this.lastName, createUserRequest.lastName) &&
        Objects.equals(this.userName, createUserRequest.userName) &&
        Objects.equals(this.phone, createUserRequest.phone) &&
        Objects.equals(this.expiration, createUserRequest.expiration) &&
        Objects.equals(this.receiverLanguage, createUserRequest.receiverLanguage) &&
        Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.notifyUser, createUserRequest.notifyUser) &&
        Objects.equals(this.authData, createUserRequest.authData) &&
        Objects.equals(this.isNonmemberViewer, createUserRequest.isNonmemberViewer) &&
        Objects.equals(this.title, createUserRequest.title) &&
        Objects.equals(this.password, createUserRequest.password) &&
        Objects.equals(this.login, createUserRequest.login) &&
        Objects.equals(this.authMethods, createUserRequest.authMethods) &&
        Objects.equals(this.needsToChangePassword, createUserRequest.needsToChangePassword) &&
        Objects.equals(this.gender, createUserRequest.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, userName, phone, expiration, receiverLanguage, email, notifyUser, authData, isNonmemberViewer, title, password, login, authMethods, needsToChangePassword, gender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    receiverLanguage: ").append(toIndentedString(receiverLanguage)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notifyUser: ").append(toIndentedString(notifyUser)).append("\n");
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    isNonmemberViewer: ").append(toIndentedString(isNonmemberViewer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
    sb.append("    needsToChangePassword: ").append(toIndentedString(needsToChangePassword)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
