/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.8.0-LTS  - built at: 2018-05-03 15:44:37<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.8.0-LTS
 * Contact: develop@dracoon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateGeneralSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class UpdateGeneralSettings {
  @JsonProperty("sharePasswordSmsEnabled")
  private Boolean sharePasswordSmsEnabled = null;

  @JsonProperty("cryptoEnabled")
  private Boolean cryptoEnabled = null;

  @JsonProperty("emailNotificationButtonEnabled")
  private Boolean emailNotificationButtonEnabled = null;

  @JsonProperty("eulaEnabled")
  private Boolean eulaEnabled = null;

  @JsonProperty("mediaServerEnabled")
  private Boolean mediaServerEnabled = null;

  @JsonProperty("weakPasswordEnabled")
  private Boolean weakPasswordEnabled = null;

  public UpdateGeneralSettings sharePasswordSmsEnabled(Boolean sharePasswordSmsEnabled) {
    this.sharePasswordSmsEnabled = sharePasswordSmsEnabled;
    return this;
  }

   /**
   * Allow sending of share passwords via SMS
   * @return sharePasswordSmsEnabled
  **/
  @ApiModelProperty(example = "false", value = "Allow sending of share passwords via SMS")
  public Boolean getSharePasswordSmsEnabled() {
    return sharePasswordSmsEnabled;
  }

  public void setSharePasswordSmsEnabled(Boolean sharePasswordSmsEnabled) {
    this.sharePasswordSmsEnabled = sharePasswordSmsEnabled;
  }

  public UpdateGeneralSettings cryptoEnabled(Boolean cryptoEnabled) {
    this.cryptoEnabled = cryptoEnabled;
    return this;
  }

   /**
   * Activation status of TripleCrypt™ technology. Can only be enabled once; disabling is not possible.
   * @return cryptoEnabled
  **/
  @ApiModelProperty(example = "false", value = "Activation status of TripleCrypt™ technology. Can only be enabled once; disabling is not possible.")
  public Boolean getCryptoEnabled() {
    return cryptoEnabled;
  }

  public void setCryptoEnabled(Boolean cryptoEnabled) {
    this.cryptoEnabled = cryptoEnabled;
  }

  public UpdateGeneralSettings emailNotificationButtonEnabled(Boolean emailNotificationButtonEnabled) {
    this.emailNotificationButtonEnabled = emailNotificationButtonEnabled;
    return this;
  }

   /**
   * Enable email notification button
   * @return emailNotificationButtonEnabled
  **/
  @ApiModelProperty(example = "false", value = "Enable email notification button")
  public Boolean getEmailNotificationButtonEnabled() {
    return emailNotificationButtonEnabled;
  }

  public void setEmailNotificationButtonEnabled(Boolean emailNotificationButtonEnabled) {
    this.emailNotificationButtonEnabled = emailNotificationButtonEnabled;
  }

  public UpdateGeneralSettings eulaEnabled(Boolean eulaEnabled) {
    this.eulaEnabled = eulaEnabled;
    return this;
  }

   /**
   * Each user has to confirm the EULA at first login.
   * @return eulaEnabled
  **/
  @ApiModelProperty(example = "false", value = "Each user has to confirm the EULA at first login.")
  public Boolean getEulaEnabled() {
    return eulaEnabled;
  }

  public void setEulaEnabled(Boolean eulaEnabled) {
    this.eulaEnabled = eulaEnabled;
  }

  public UpdateGeneralSettings mediaServerEnabled(Boolean mediaServerEnabled) {
    this.mediaServerEnabled = mediaServerEnabled;
    return this;
  }

   /**
   * Is media server enabled?
   * @return mediaServerEnabled
  **/
  @ApiModelProperty(example = "false", value = "Is media server enabled?")
  public Boolean getMediaServerEnabled() {
    return mediaServerEnabled;
  }

  public void setMediaServerEnabled(Boolean mediaServerEnabled) {
    this.mediaServerEnabled = mediaServerEnabled;
  }

  public UpdateGeneralSettings weakPasswordEnabled(Boolean weakPasswordEnabled) {
    this.weakPasswordEnabled = weakPasswordEnabled;
    return this;
  }

   /**
   * Allow weak password * A weak password has to fulfill the following criteria:    * is at least 8 characters long    * contains letters and numbers * A strong password has to fulfill the following criteria in addition:    * contains at least one special character    * contains upper and lower case characters
   * @return weakPasswordEnabled
  **/
  @ApiModelProperty(example = "false", value = "Allow weak password * A weak password has to fulfill the following criteria:    * is at least 8 characters long    * contains letters and numbers * A strong password has to fulfill the following criteria in addition:    * contains at least one special character    * contains upper and lower case characters")
  public Boolean getWeakPasswordEnabled() {
    return weakPasswordEnabled;
  }

  public void setWeakPasswordEnabled(Boolean weakPasswordEnabled) {
    this.weakPasswordEnabled = weakPasswordEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGeneralSettings updateGeneralSettings = (UpdateGeneralSettings) o;
    return Objects.equals(this.sharePasswordSmsEnabled, updateGeneralSettings.sharePasswordSmsEnabled) &&
        Objects.equals(this.cryptoEnabled, updateGeneralSettings.cryptoEnabled) &&
        Objects.equals(this.emailNotificationButtonEnabled, updateGeneralSettings.emailNotificationButtonEnabled) &&
        Objects.equals(this.eulaEnabled, updateGeneralSettings.eulaEnabled) &&
        Objects.equals(this.mediaServerEnabled, updateGeneralSettings.mediaServerEnabled) &&
        Objects.equals(this.weakPasswordEnabled, updateGeneralSettings.weakPasswordEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharePasswordSmsEnabled, cryptoEnabled, emailNotificationButtonEnabled, eulaEnabled, mediaServerEnabled, weakPasswordEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGeneralSettings {\n");

    sb.append("    sharePasswordSmsEnabled: ").append(toIndentedString(sharePasswordSmsEnabled)).append("\n");
    sb.append("    cryptoEnabled: ").append(toIndentedString(cryptoEnabled)).append("\n");
    sb.append("    emailNotificationButtonEnabled: ").append(toIndentedString(emailNotificationButtonEnabled)).append("\n");
    sb.append("    eulaEnabled: ").append(toIndentedString(eulaEnabled)).append("\n");
    sb.append("    mediaServerEnabled: ").append(toIndentedString(mediaServerEnabled)).append("\n");
    sb.append("    weakPasswordEnabled: ").append(toIndentedString(weakPasswordEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
