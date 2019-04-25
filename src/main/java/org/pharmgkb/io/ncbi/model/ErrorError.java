/*
 * Variation Services
 * Services for variation data processing<p> <div style=\"font-size:1.1em;font-weight:normal\">NOTE: This service is still in beta testing mode. Please limit your request rate to 1 request/second.  dbSNP provides bulk download in VCF and JSON on the <a href=\"ftp://ftp.ncbi.nih.gov/snp/latest_release/\">FTP site</a> for users with a large number of RefSNPs (>100K) to process.</div> 
 *
 * OpenAPI spec version: 2.0.0
 * Contact: variation-services@ncbi.nlm.nih.gov
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.pharmgkb.io.ncbi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.pharmgkb.io.ncbi.model.DetailedError;

/**
 * Remember that these fields are all optional.
 */
@Schema(description = "Remember that these fields are all optional.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class ErrorError {

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("errors")
  private List<DetailedError> errors = null;
  public ErrorError code(Integer code) {
    this.code = code;
    return this;
  }

  

  /**
  * Represents the code for this error. This property value will represent the HTTP response code. If there are multiple errors, code will be the error code for the first error.
  * @return code
  **/
  @Schema(description = "Represents the code for this error. This property value will represent the HTTP response code. If there are multiple errors, code will be the error code for the first error.")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
  public ErrorError message(String message) {
    this.message = message;
    return this;
  }

  

  /**
  * A human readable message providing more details about the error. If there are multiple errors, message will be the message for the first error.
  * @return message
  **/
  @Schema(description = "A human readable message providing more details about the error. If there are multiple errors, message will be the message for the first error.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public ErrorError errors(List<DetailedError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorError addErrorsItem(DetailedError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<DetailedError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
  * Container for any additional information regarding the error. If the service returns multiple errors, each element in the errors array represents a different error.
  * @return errors
  **/
  @Schema(description = "Container for any additional information regarding the error. If the service returns multiple errors, each element in the errors array represents a different error.")
  public List<DetailedError> getErrors() {
    return errors;
  }
  public void setErrors(List<DetailedError> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.code, errorError.code) &&
        Objects.equals(this.message, errorError.message) &&
        Objects.equals(this.errors, errorError.errors);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(code, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
