/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateFolderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class UpdateFolderRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  private String notes = null;

  public UpdateFolderRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Folder name
   * @return name
  **/
  @ApiModelProperty(value = "Folder name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateFolderRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes. Use empty string to remove.
   * @return notes
  **/
  @ApiModelProperty(value = "User notes. Use empty string to remove.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFolderRequest updateFolderRequest = (UpdateFolderRequest) o;
    return Objects.equals(this.name, updateFolderRequest.name) &&
        Objects.equals(this.notes, updateFolderRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFolderRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
