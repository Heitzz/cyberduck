/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.brick.io.swagger.client.model.PatchFormFieldSetsFormFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Create Form Field Set
 */
@Schema(description = "Create Form Field Set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T22:25:43.390877+02:00[Europe/Paris]")
public class PostFormFieldSets {
  @JsonProperty("user_id")
  private Integer userId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("skip_email")
  private Boolean skipEmail = null;

  @JsonProperty("skip_name")
  private Boolean skipName = null;

  @JsonProperty("skip_company")
  private Boolean skipCompany = null;

  @JsonProperty("form_fields")
  private List<PatchFormFieldSetsFormFields> formFields = null;

  public PostFormFieldSets userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID.  Provide a value of &#x60;0&#x60; to operate the current session&#x27;s user.
   * @return userId
  **/
  @Schema(description = "User ID.  Provide a value of `0` to operate the current session's user.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public PostFormFieldSets title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title to be displayed
   * @return title
  **/
  @Schema(description = "Title to be displayed")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostFormFieldSets skipEmail(Boolean skipEmail) {
    this.skipEmail = skipEmail;
    return this;
  }

   /**
   * Skip validating form email
   * @return skipEmail
  **/
  @Schema(description = "Skip validating form email")
  public Boolean isSkipEmail() {
    return skipEmail;
  }

  public void setSkipEmail(Boolean skipEmail) {
    this.skipEmail = skipEmail;
  }

  public PostFormFieldSets skipName(Boolean skipName) {
    this.skipName = skipName;
    return this;
  }

   /**
   * Skip validating form name
   * @return skipName
  **/
  @Schema(description = "Skip validating form name")
  public Boolean isSkipName() {
    return skipName;
  }

  public void setSkipName(Boolean skipName) {
    this.skipName = skipName;
  }

  public PostFormFieldSets skipCompany(Boolean skipCompany) {
    this.skipCompany = skipCompany;
    return this;
  }

   /**
   * Skip validating company
   * @return skipCompany
  **/
  @Schema(description = "Skip validating company")
  public Boolean isSkipCompany() {
    return skipCompany;
  }

  public void setSkipCompany(Boolean skipCompany) {
    this.skipCompany = skipCompany;
  }

  public PostFormFieldSets formFields(List<PatchFormFieldSetsFormFields> formFields) {
    this.formFields = formFields;
    return this;
  }

  public PostFormFieldSets addFormFieldsItem(PatchFormFieldSetsFormFields formFieldsItem) {
    if (this.formFields == null) {
      this.formFields = new ArrayList<>();
    }
    this.formFields.add(formFieldsItem);
    return this;
  }

   /**
   * Get formFields
   * @return formFields
  **/
  @Schema(description = "")
  public List<PatchFormFieldSetsFormFields> getFormFields() {
    return formFields;
  }

  public void setFormFields(List<PatchFormFieldSetsFormFields> formFields) {
    this.formFields = formFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFormFieldSets postFormFieldSets = (PostFormFieldSets) o;
    return Objects.equals(this.userId, postFormFieldSets.userId) &&
        Objects.equals(this.title, postFormFieldSets.title) &&
        Objects.equals(this.skipEmail, postFormFieldSets.skipEmail) &&
        Objects.equals(this.skipName, postFormFieldSets.skipName) &&
        Objects.equals(this.skipCompany, postFormFieldSets.skipCompany) &&
        Objects.equals(this.formFields, postFormFieldSets.formFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, title, skipEmail, skipName, skipCompany, formFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFormFieldSets {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    skipEmail: ").append(toIndentedString(skipEmail)).append("\n");
    sb.append("    skipName: ").append(toIndentedString(skipName)).append("\n");
    sb.append("    skipCompany: ").append(toIndentedString(skipCompany)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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