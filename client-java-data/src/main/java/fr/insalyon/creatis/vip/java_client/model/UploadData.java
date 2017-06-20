/*
 * Data extension of CARMIN
 * Data requests
 *
 * OpenAPI spec version: 0.2.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.insalyon.creatis.vip.java_client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UploadData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-20T14:24:45.761+02:00")
public class UploadData {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("pathContent")
  private String pathContent = null;

  public UploadData uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public UploadData pathContent(String pathContent) {
    this.pathContent = pathContent;
    return this;
  }

   /**
   * Get pathContent
   * @return pathContent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPathContent() {
    return pathContent;
  }

  public void setPathContent(String pathContent) {
    this.pathContent = pathContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadData uploadData = (UploadData) o;
    return Objects.equals(this.uri, uploadData.uri) &&
        Objects.equals(this.pathContent, uploadData.pathContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, pathContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadData {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    pathContent: ").append(toIndentedString(pathContent)).append("\n");
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

