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

/**
 * A set of RefSNP IDs. Order is not significant. There may be duplicates.
 */
@Schema(description = "A set of RefSNP IDs. Order is not significant. There may be duplicates.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class Rsids {

  @SerializedName("rsids")
  private List<Integer> rsids = new ArrayList<Integer>();
  public Rsids rsids(List<Integer> rsids) {
    this.rsids = rsids;
    return this;
  }

  public Rsids addRsidsItem(Integer rsidsItem) {
    this.rsids.add(rsidsItem);
    return this;
  }

  /**
  * Get rsids
  * @return rsids
  **/
  @Schema(required = true, description = "")
  public List<Integer> getRsids() {
    return rsids;
  }
  public void setRsids(List<Integer> rsids) {
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
    Rsids rsids = (Rsids) o;
    return Objects.equals(this.rsids, rsids.rsids);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rsids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rsids {\n");
    
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
