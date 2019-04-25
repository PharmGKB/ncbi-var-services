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
import org.pharmgkb.io.ncbi.model.Frameshift;
import org.pharmgkb.io.ncbi.model.Spdi;

/**
 * An allele object describes the sequence change in either nucleotide or amino acid sequence at a particular position on a particular sequence. Exactly one of the spdi and frameshift fields will be present. Most alleles can be modeled as defined breakpoint changes (SPDI data model).  However, indel nucleotide changes can create frameshift changes in proteins, which are difficult to model this way. Therefore this allele object is a choice between either a SPDI representation (when the breakpoints are known) or protein frameshifts (where the final breakpoint is not known).
 */
@Schema(description = "An allele object describes the sequence change in either nucleotide or amino acid sequence at a particular position on a particular sequence. Exactly one of the spdi and frameshift fields will be present. Most alleles can be modeled as defined breakpoint changes (SPDI data model).  However, indel nucleotide changes can create frameshift changes in proteins, which are difficult to model this way. Therefore this allele object is a choice between either a SPDI representation (when the breakpoints are known) or protein frameshifts (where the final breakpoint is not known).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class Allele {

  @SerializedName("spdi")
  private Spdi spdi = null;

  @SerializedName("frameshift")
  private Frameshift frameshift = null;
  public Allele spdi(Spdi spdi) {
    this.spdi = spdi;
    return this;
  }

  

  /**
  * Get spdi
  * @return spdi
  **/
  @Schema(description = "")
  public Spdi getSpdi() {
    return spdi;
  }
  public void setSpdi(Spdi spdi) {
    this.spdi = spdi;
  }
  public Allele frameshift(Frameshift frameshift) {
    this.frameshift = frameshift;
    return this;
  }

  

  /**
  * Get frameshift
  * @return frameshift
  **/
  @Schema(description = "")
  public Frameshift getFrameshift() {
    return frameshift;
  }
  public void setFrameshift(Frameshift frameshift) {
    this.frameshift = frameshift;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allele allele = (Allele) o;
    return Objects.equals(this.spdi, allele.spdi) &&
        Objects.equals(this.frameshift, allele.frameshift);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(spdi, frameshift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allele {\n");
    
    sb.append("    spdi: ").append(toIndentedString(spdi)).append("\n");
    sb.append("    frameshift: ").append(toIndentedString(frameshift)).append("\n");
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
