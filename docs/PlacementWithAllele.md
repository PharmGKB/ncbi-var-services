# PlacementWithAllele

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seqId** | **String** | The RefSeq/Genbank Accession.Version for the reference sequence | 
**isPtlp** | **Boolean** | True if this placement is the preferred top level placement (PTLP) under the alignment data set which generated this RefSnp cluster | 
**placementAnnot** | [**PlacementAnnot**](PlacementAnnot.md) |  | 
**alleles** | [**List&lt;PlacementAnnotatedAllele&gt;**](PlacementAnnotatedAllele.md) | A RefSnp can describe 1 to N alleles. While for the PTLP, all alleles (in SPDI syntax) are the same type and length, non-PTLP Placements (i.e. all other Placements), the allele in SPDI syntax may have different types, lengths and start positions, and in some rare cases, may not even overlap. But they are all on this placement&#x27;s Sequence. | 
