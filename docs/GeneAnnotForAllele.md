# GeneAnnotForAllele

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the Gene | 
**id** | **Integer** | The NCBI GeneId | 
**locus** | **String** | The NCBI Gene Symbol | 
**isPseudo** | **Boolean** | True, if the gene is labeled a Pseudo-gene by NCBI Gene Resource at the time this revision is built | 
**orientation** | [**OrientationEnum**](#OrientationEnum) | The orientation of the gene relative to the parent assembly sequence upon which it is annotated.  This orientation applies to all children RNAs and Proteins as well. | 
**sequenceOntology** | [**List&lt;SoTerm&gt;**](SoTerm.md) | The description of the variant in respect to its location relative to this gene | 
**rnas** | [**List&lt;RnaAnnotForAllele&gt;**](RnaAnnotForAllele.md) | The set of RNAs annotated on this gene.  In the case of mitochondria, the chromosome coordinate is repeated, as it is the stand-in for the RNA. | 

<a name="OrientationEnum"></a>
## Enum: OrientationEnum
Name | Value
---- | -----
PLUS | &quot;plus&quot;
MINUS | &quot;minus&quot;
