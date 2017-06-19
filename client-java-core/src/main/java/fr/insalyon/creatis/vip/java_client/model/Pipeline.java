/*
 * CARMIN a Common web API for Remote pipeline INvocation
 * FLI/IAM REST API for exchanging data and remote calling pipelines.
 *
 * OpenAPI spec version: 0.2.1
 * Contact: carmin@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.insalyon.creatis.vip.java_client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import fr.insalyon.creatis.vip.java_client.model.ErrorCodeAndMessage;
import fr.insalyon.creatis.vip.java_client.model.PipelineParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Pipeline
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-19T11:01:11.364+02:00")
public class Pipeline {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("canExecute")
  private Boolean canExecute = null;

  @SerializedName("parameters")
  private List<PipelineParameter> parameters = new ArrayList<PipelineParameter>();

  @SerializedName("errorCodesAndMessages")
  private List<ErrorCodeAndMessage> errorCodesAndMessages = new ArrayList<ErrorCodeAndMessage>();

  public Pipeline identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Pipeline name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pipeline version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Pipeline description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Pipeline canExecute(Boolean canExecute) {
    this.canExecute = canExecute;
    return this;
  }

   /**
   * true if the user who requested the pipeline can execute it
   * @return canExecute
  **/
  @ApiModelProperty(example = "null", value = "true if the user who requested the pipeline can execute it")
  public Boolean getCanExecute() {
    return canExecute;
  }

  public void setCanExecute(Boolean canExecute) {
    this.canExecute = canExecute;
  }

  public Pipeline parameters(List<PipelineParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Pipeline addParametersItem(PipelineParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PipelineParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<PipelineParameter> parameters) {
    this.parameters = parameters;
  }

  public Pipeline errorCodesAndMessages(List<ErrorCodeAndMessage> errorCodesAndMessages) {
    this.errorCodesAndMessages = errorCodesAndMessages;
    return this;
  }

  public Pipeline addErrorCodesAndMessagesItem(ErrorCodeAndMessage errorCodesAndMessagesItem) {
    this.errorCodesAndMessages.add(errorCodesAndMessagesItem);
    return this;
  }

   /**
   * Get errorCodesAndMessages
   * @return errorCodesAndMessages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ErrorCodeAndMessage> getErrorCodesAndMessages() {
    return errorCodesAndMessages;
  }

  public void setErrorCodesAndMessages(List<ErrorCodeAndMessage> errorCodesAndMessages) {
    this.errorCodesAndMessages = errorCodesAndMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(this.identifier, pipeline.identifier) &&
        Objects.equals(this.name, pipeline.name) &&
        Objects.equals(this.version, pipeline.version) &&
        Objects.equals(this.description, pipeline.description) &&
        Objects.equals(this.canExecute, pipeline.canExecute) &&
        Objects.equals(this.parameters, pipeline.parameters) &&
        Objects.equals(this.errorCodesAndMessages, pipeline.errorCodesAndMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, version, description, canExecute, parameters, errorCodesAndMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    errorCodesAndMessages: ").append(toIndentedString(errorCodesAndMessages)).append("\n");
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

