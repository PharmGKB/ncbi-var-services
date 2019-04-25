# PrimarySnapshotData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementsWithAllele** | [**List&lt;PlacementWithAllele&gt;**](PlacementWithAllele.md) | List of all placements, each containing a list of the alleles in the context of that reference region. Includes both nucleotide and protein placements. For all placements, the list of alleles is the same length and in the same order.  They represent the alleles on the preferred top level placement (PTLP) in sorted order.  So, on a given placement, the first allele is how the first allele on the PTLP appears upon mapping to the given placement.  Similarly for the second allele, and so on. | 
**alleleAnnotations** | [**List&lt;AlleleAnnotationList&gt;**](AlleleAnnotationList.md) | Each element holds the annotations associated with a particular variant. This list of annotation lists has the same order and length as the list of alleles in each placement. This order associates each allele with its corresponding annotation list.  If an allele was not associated with any annotations, the corresponding annotation set will have only empty lists. | 
**support** | [**List&lt;Support&gt;**](Support.md) | The observations that support the existence of a variant at this particular location and type. Supporting observations can come from submissions to dbSNP or from external data sources like ClinVar. | 
**anchor** | **String** | The location and type of the variant, in format &#x27;Acc.Ver:From:DeletionLength:Type&#x27;, which defines the RefSNP.  The Acc.Ver is the preferred top level placement chosen from all of the placements the RefSNP maps to in a given alignment data set.  There is a 1:1 relationship between live RefSNP objects and the set of anchors. | 
**variantType** | [**VariantTypeEnum**](#VariantTypeEnum) | The type of change the variant causes, relative to the reference sequence. | 

<a name="VariantTypeEnum"></a>
## Enum: VariantTypeEnum
Name | Value
---- | -----
SNV | &quot;snv&quot;
MNV | &quot;mnv&quot;
INS | &quot;ins&quot;
DEL | &quot;del&quot;
DELINS | &quot;delins&quot;
IDENTITY | &quot;identity&quot;
