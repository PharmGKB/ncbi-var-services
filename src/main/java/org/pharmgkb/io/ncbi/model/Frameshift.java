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

/**
 * A length poloymorphism in a nucleotide sequence that coincides with an open reading frame, produces a frameshift in protein sequence
 */
@Schema(description = "A length poloymorphism in a nucleotide sequence that coincides with an open reading frame, produces a frameshift in protein sequence")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class Frameshift {

  @SerializedName("seq_id")
  private String seqId = null;

  @SerializedName("position")
  private Integer position = null;
  public Frameshift seqId(String seqId) {
    this.seqId = seqId;
    return this;
  }

  

  /**
  * The RefSeq/Genbank Accession.Version for the protein reference sequence
  * @return seqId
  **/
  @Schema(example = "NP_000198.1", required = true, description = "The RefSeq/Genbank Accession.Version for the protein reference sequence")
  public String getSeqId() {
    return seqId;
  }
  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }
  public Frameshift position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * The 0-based boundary position where the frameshift starts. That is, position 0 starts the frameshift immediately before the first amino acid and position 1 starts the frameshift between the first and second amino acid.
  * @return position
  **/
  @Schema(required = true, description = "The 0-based boundary position where the frameshift starts. That is, position 0 starts the frameshift immediately before the first amino acid and position 1 starts the frameshift between the first and second amino acid.")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frameshift frameshift = (Frameshift) o;
    return Objects.equals(this.seqId, frameshift.seqId) &&
        Objects.equals(this.position, frameshift.position);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(seqId, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frameshift {\n");
    
    sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
