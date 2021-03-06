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
import org.pharmgkb.io.ncbi.model.Warnings;

/**
 * An allele in HGVS notation
 */
@Schema(description = "An allele in HGVS notation")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class Hgvs {

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("warnings")
  private Warnings warnings = null;
  public Hgvs hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

  

  /**
  * Get hgvs
  * @return hgvs
  **/
  @Schema(required = true, description = "")
  public String getHgvs() {
    return hgvs;
  }
  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }
  public Hgvs warnings(Warnings warnings) {
    this.warnings = warnings;
    return this;
  }

  

  /**
  * Get warnings
  * @return warnings
  **/
  @Schema(description = "")
  public Warnings getWarnings() {
    return warnings;
  }
  public void setWarnings(Warnings warnings) {
    this.warnings = warnings;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hgvs hgvs = (Hgvs) o;
    return Objects.equals(this.hgvs, hgvs.hgvs) &&
        Objects.equals(this.warnings, hgvs.warnings);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(hgvs, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hgvs {\n");
    
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
