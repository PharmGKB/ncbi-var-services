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
 * This reports the codon change and its position in SPDI notation when the variant is in a coding region. Then the position reported is the transcript position of the first nucleotide of the affected codons, not the variant allele itself which can occur at anywhere in those codons. For a non-coding transcript, this is just the allele change as mapped to the transcript.
 */
@Schema(description = "This reports the codon change and its position in SPDI notation when the variant is in a coding region. Then the position reported is the transcript position of the first nucleotide of the affected codons, not the variant allele itself which can occur at anywhere in those codons. For a non-coding transcript, this is just the allele change as mapped to the transcript.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class CodonAlignedTranscriptChange {

  @SerializedName("seq_id")
  private String seqId = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("deleted_sequence")
  private String deletedSequence = null;

  @SerializedName("inserted_sequence")
  private String insertedSequence = null;
  public CodonAlignedTranscriptChange seqId(String seqId) {
    this.seqId = seqId;
    return this;
  }

  

  /**
  * The RefSeq/Genbank Accession.Version for the reference sequence
  * @return seqId
  **/
  @Schema(example = "NC_000001.23", required = true, description = "The RefSeq/Genbank Accession.Version for the reference sequence")
  public String getSeqId() {
    return seqId;
  }
  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }
  public CodonAlignedTranscriptChange position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * The 0-based boundary position where the deletion starts. That is, position 0 starts the deletion immediately before the first nucleotide and position 1 starts the deletion between the first and second nucleotides.
  * @return position
  **/
  @Schema(required = true, description = "The 0-based boundary position where the deletion starts. That is, position 0 starts the deletion immediately before the first nucleotide and position 1 starts the deletion between the first and second nucleotides.")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public CodonAlignedTranscriptChange deletedSequence(String deletedSequence) {
    this.deletedSequence = deletedSequence;
    return this;
  }

  

  /**
  * The IUPAC sequence of nucleotides/amino-acids to delete from the reference. This can be empty, which is how a pure insertion is represented.
  * @return deletedSequence
  **/
  @Schema(required = true, description = "The IUPAC sequence of nucleotides/amino-acids to delete from the reference. This can be empty, which is how a pure insertion is represented.")
  public String getDeletedSequence() {
    return deletedSequence;
  }
  public void setDeletedSequence(String deletedSequence) {
    this.deletedSequence = deletedSequence;
  }
  public CodonAlignedTranscriptChange insertedSequence(String insertedSequence) {
    this.insertedSequence = insertedSequence;
    return this;
  }

  

  /**
  * The IUPAC sequence of nucleotides/amino-acids to insert after perforing the deletion. Amino-acids use the single character encoding. All nucleotide codes including the ones for ambiguity are allowed.
  * @return insertedSequence
  **/
  @Schema(required = true, description = "The IUPAC sequence of nucleotides/amino-acids to insert after perforing the deletion. Amino-acids use the single character encoding. All nucleotide codes including the ones for ambiguity are allowed.")
  public String getInsertedSequence() {
    return insertedSequence;
  }
  public void setInsertedSequence(String insertedSequence) {
    this.insertedSequence = insertedSequence;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodonAlignedTranscriptChange codonAlignedTranscriptChange = (CodonAlignedTranscriptChange) o;
    return Objects.equals(this.seqId, codonAlignedTranscriptChange.seqId) &&
        Objects.equals(this.position, codonAlignedTranscriptChange.position) &&
        Objects.equals(this.deletedSequence, codonAlignedTranscriptChange.deletedSequence) &&
        Objects.equals(this.insertedSequence, codonAlignedTranscriptChange.insertedSequence);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(seqId, position, deletedSequence, insertedSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodonAlignedTranscriptChange {\n");
    
    sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    deletedSequence: ").append(toIndentedString(deletedSequence)).append("\n");
    sb.append("    insertedSequence: ").append(toIndentedString(insertedSequence)).append("\n");
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
