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
import org.pharmgkb.io.ncbi.model.GeneAnnotForAllele;

/**
 * NCBI Annotation Releases calculate Gene, RNA and Coding Regions on top level assembly sequence molecules.  Sometimes, a sequence molecule may have more than one Annotation Release associated with it.  We report the effect of the variant in relation to these regions *per* Annotation Release *and* Sequence-id pair. A tuple is then associated with a tree of annotations, consisting of genes, their directly associated RNAs and Protein products, and any protein products associated with those RNAs.
 */
@Schema(description = "NCBI Annotation Releases calculate Gene, RNA and Coding Regions on top level assembly sequence molecules.  Sometimes, a sequence molecule may have more than one Annotation Release associated with it.  We report the effect of the variant in relation to these regions *per* Annotation Release *and* Sequence-id pair. A tuple is then associated with a tree of annotations, consisting of genes, their directly associated RNAs and Protein products, and any protein products associated with those RNAs.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class AssemblyAnnotForAllele {

  @SerializedName("seq_id")
  private String seqId = null;

  @SerializedName("annotation_release")
  private String annotationRelease = null;

  @SerializedName("genes")
  private List<GeneAnnotForAllele> genes = new ArrayList<GeneAnnotForAllele>();
  public AssemblyAnnotForAllele seqId(String seqId) {
    this.seqId = seqId;
    return this;
  }

  

  /**
  * The RefSeq/Genbank Accession.Version for the reference sequence
  * @return seqId
  **/
  @Schema(required = true, description = "The RefSeq/Genbank Accession.Version for the reference sequence")
  public String getSeqId() {
    return seqId;
  }
  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }
  public AssemblyAnnotForAllele annotationRelease(String annotationRelease) {
    this.annotationRelease = annotationRelease;
    return this;
  }

  

  /**
  * The name of the annotation release
  * @return annotationRelease
  **/
  @Schema(required = true, description = "The name of the annotation release")
  public String getAnnotationRelease() {
    return annotationRelease;
  }
  public void setAnnotationRelease(String annotationRelease) {
    this.annotationRelease = annotationRelease;
  }
  public AssemblyAnnotForAllele genes(List<GeneAnnotForAllele> genes) {
    this.genes = genes;
    return this;
  }

  public AssemblyAnnotForAllele addGenesItem(GeneAnnotForAllele genesItem) {
    this.genes.add(genesItem);
    return this;
  }

  /**
  * The set of genes annotated on the associated assembly and sequence, for which this allele overlaps
  * @return genes
  **/
  @Schema(required = true, description = "The set of genes annotated on the associated assembly and sequence, for which this allele overlaps")
  public List<GeneAnnotForAllele> getGenes() {
    return genes;
  }
  public void setGenes(List<GeneAnnotForAllele> genes) {
    this.genes = genes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyAnnotForAllele assemblyAnnotForAllele = (AssemblyAnnotForAllele) o;
    return Objects.equals(this.seqId, assemblyAnnotForAllele.seqId) &&
        Objects.equals(this.annotationRelease, assemblyAnnotForAllele.annotationRelease) &&
        Objects.equals(this.genes, assemblyAnnotForAllele.genes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(seqId, annotationRelease, genes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyAnnotForAllele {\n");
    
    sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
    sb.append("    annotationRelease: ").append(toIndentedString(annotationRelease)).append("\n");
    sb.append("    genes: ").append(toIndentedString(genes)).append("\n");
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
