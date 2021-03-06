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
import org.pharmgkb.io.ncbi.model.AlleleAnnotationList;
import org.pharmgkb.io.ncbi.model.PlacementWithAllele;
import org.pharmgkb.io.ncbi.model.Support;

/**
 * Data specific to primary snapshots; cannot be present at the same time as merged_snapshot_data or nosnppos_snapshot_data
 */
@Schema(description = "Data specific to primary snapshots; cannot be present at the same time as merged_snapshot_data or nosnppos_snapshot_data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-25T10:32:24.325-07:00[America/Los_Angeles]")public class PrimarySnapshotData {

  @SerializedName("placements_with_allele")
  private List<PlacementWithAllele> placementsWithAllele = new ArrayList<PlacementWithAllele>();

  @SerializedName("allele_annotations")
  private List<AlleleAnnotationList> alleleAnnotations = new ArrayList<AlleleAnnotationList>();

  @SerializedName("support")
  private List<Support> support = new ArrayList<Support>();

  @SerializedName("anchor")
  private String anchor = null;
  /**
   * The type of change the variant causes, relative to the reference sequence.
   */
  @JsonAdapter(VariantTypeEnum.Adapter.class)
  public enum VariantTypeEnum {
    SNV("snv"),
    MNV("mnv"),
    INS("ins"),
    DEL("del"),
    DELINS("delins"),
    IDENTITY("identity");

    private String value;

    VariantTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VariantTypeEnum fromValue(String text) {
      for (VariantTypeEnum b : VariantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VariantTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariantTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariantTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VariantTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("variant_type")
  private VariantTypeEnum variantType = null;
  public PrimarySnapshotData placementsWithAllele(List<PlacementWithAllele> placementsWithAllele) {
    this.placementsWithAllele = placementsWithAllele;
    return this;
  }

  public PrimarySnapshotData addPlacementsWithAlleleItem(PlacementWithAllele placementsWithAlleleItem) {
    this.placementsWithAllele.add(placementsWithAlleleItem);
    return this;
  }

  /**
  * List of all placements, each containing a list of the alleles in the context of that reference region. Includes both nucleotide and protein placements. For all placements, the list of alleles is the same length and in the same order.  They represent the alleles on the preferred top level placement (PTLP) in sorted order.  So, on a given placement, the first allele is how the first allele on the PTLP appears upon mapping to the given placement.  Similarly for the second allele, and so on.
  * @return placementsWithAllele
  **/
  @Schema(required = true, description = "List of all placements, each containing a list of the alleles in the context of that reference region. Includes both nucleotide and protein placements. For all placements, the list of alleles is the same length and in the same order.  They represent the alleles on the preferred top level placement (PTLP) in sorted order.  So, on a given placement, the first allele is how the first allele on the PTLP appears upon mapping to the given placement.  Similarly for the second allele, and so on.")
  public List<PlacementWithAllele> getPlacementsWithAllele() {
    return placementsWithAllele;
  }
  public void setPlacementsWithAllele(List<PlacementWithAllele> placementsWithAllele) {
    this.placementsWithAllele = placementsWithAllele;
  }
  public PrimarySnapshotData alleleAnnotations(List<AlleleAnnotationList> alleleAnnotations) {
    this.alleleAnnotations = alleleAnnotations;
    return this;
  }

  public PrimarySnapshotData addAlleleAnnotationsItem(AlleleAnnotationList alleleAnnotationsItem) {
    this.alleleAnnotations.add(alleleAnnotationsItem);
    return this;
  }

  /**
  * Each element holds the annotations associated with a particular variant. This list of annotation lists has the same order and length as the list of alleles in each placement. This order associates each allele with its corresponding annotation list.  If an allele was not associated with any annotations, the corresponding annotation set will have only empty lists.
  * @return alleleAnnotations
  **/
  @Schema(required = true, description = "Each element holds the annotations associated with a particular variant. This list of annotation lists has the same order and length as the list of alleles in each placement. This order associates each allele with its corresponding annotation list.  If an allele was not associated with any annotations, the corresponding annotation set will have only empty lists.")
  public List<AlleleAnnotationList> getAlleleAnnotations() {
    return alleleAnnotations;
  }
  public void setAlleleAnnotations(List<AlleleAnnotationList> alleleAnnotations) {
    this.alleleAnnotations = alleleAnnotations;
  }
  public PrimarySnapshotData support(List<Support> support) {
    this.support = support;
    return this;
  }

  public PrimarySnapshotData addSupportItem(Support supportItem) {
    this.support.add(supportItem);
    return this;
  }

  /**
  * The observations that support the existence of a variant at this particular location and type. Supporting observations can come from submissions to dbSNP or from external data sources like ClinVar.
  * @return support
  **/
  @Schema(required = true, description = "The observations that support the existence of a variant at this particular location and type. Supporting observations can come from submissions to dbSNP or from external data sources like ClinVar.")
  public List<Support> getSupport() {
    return support;
  }
  public void setSupport(List<Support> support) {
    this.support = support;
  }
  public PrimarySnapshotData anchor(String anchor) {
    this.anchor = anchor;
    return this;
  }

  

  /**
  * The location and type of the variant, in format &#x27;Acc.Ver:From:DeletionLength:Type&#x27;, which defines the RefSNP.  The Acc.Ver is the preferred top level placement chosen from all of the placements the RefSNP maps to in a given alignment data set.  There is a 1:1 relationship between live RefSNP objects and the set of anchors.
  * @return anchor
  **/
  @Schema(required = true, description = "The location and type of the variant, in format 'Acc.Ver:From:DeletionLength:Type', which defines the RefSNP.  The Acc.Ver is the preferred top level placement chosen from all of the placements the RefSNP maps to in a given alignment data set.  There is a 1:1 relationship between live RefSNP objects and the set of anchors.")
  public String getAnchor() {
    return anchor;
  }
  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }
  public PrimarySnapshotData variantType(VariantTypeEnum variantType) {
    this.variantType = variantType;
    return this;
  }

  

  /**
  * The type of change the variant causes, relative to the reference sequence.
  * @return variantType
  **/
  @Schema(required = true, description = "The type of change the variant causes, relative to the reference sequence.")
  public VariantTypeEnum getVariantType() {
    return variantType;
  }
  public void setVariantType(VariantTypeEnum variantType) {
    this.variantType = variantType;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimarySnapshotData primarySnapshotData = (PrimarySnapshotData) o;
    return Objects.equals(this.placementsWithAllele, primarySnapshotData.placementsWithAllele) &&
        Objects.equals(this.alleleAnnotations, primarySnapshotData.alleleAnnotations) &&
        Objects.equals(this.support, primarySnapshotData.support) &&
        Objects.equals(this.anchor, primarySnapshotData.anchor) &&
        Objects.equals(this.variantType, primarySnapshotData.variantType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(placementsWithAllele, alleleAnnotations, support, anchor, variantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimarySnapshotData {\n");
    
    sb.append("    placementsWithAllele: ").append(toIndentedString(placementsWithAllele)).append("\n");
    sb.append("    alleleAnnotations: ").append(toIndentedString(alleleAnnotations)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    variantType: ").append(toIndentedString(variantType)).append("\n");
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
