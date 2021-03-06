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
import org.pharmgkb.io.ncbi.model.Spdi;

/**
 * The characteristics of an observation that allow one to find it in the previous release. Should only be used when the observation described was present in the previous release.
 */
@Schema(description = "The characteristics of an observation that allow one to find it in the previous release. Should only be used when the observation described was present in the previous release.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class PreviousRelease {

  @SerializedName("allele")
  private Spdi allele = null;

  @SerializedName("rsids")
  private List<String> rsids = new ArrayList<String>();
  public PreviousRelease allele(Spdi allele) {
    this.allele = allele;
    return this;
  }

  

  /**
  * Get allele
  * @return allele
  **/
  @Schema(required = true, description = "")
  public Spdi getAllele() {
    return allele;
  }
  public void setAllele(Spdi allele) {
    this.allele = allele;
  }
  public PreviousRelease rsids(List<String> rsids) {
    this.rsids = rsids;
    return this;
  }

  public PreviousRelease addRsidsItem(String rsidsItem) {
    this.rsids.add(rsidsItem);
    return this;
  }

  /**
  * The ids of the RefSnps that contained a particular observation in the previous release. Only identity alleles can belong to more than one RefSnp, so this can only have more than one entry if the observation maps to the identity allele.  The PreviousRelease struct should only be used when the observation was present in the previous release, so this field should not be empty.
  * @return rsids
  **/
  @Schema(required = true, description = "The ids of the RefSnps that contained a particular observation in the previous release. Only identity alleles can belong to more than one RefSnp, so this can only have more than one entry if the observation maps to the identity allele.  The PreviousRelease struct should only be used when the observation was present in the previous release, so this field should not be empty.")
  public List<String> getRsids() {
    return rsids;
  }
  public void setRsids(List<String> rsids) {
    this.rsids = rsids;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousRelease previousRelease = (PreviousRelease) o;
    return Objects.equals(this.allele, previousRelease.allele) &&
        Objects.equals(this.rsids, previousRelease.rsids);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(allele, rsids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousRelease {\n");
    
    sb.append("    allele: ").append(toIndentedString(allele)).append("\n");
    sb.append("    rsids: ").append(toIndentedString(rsids)).append("\n");
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
