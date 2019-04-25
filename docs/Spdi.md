# Spdi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seqId** | **String** | The RefSeq/Genbank Accession.Version for the reference sequence | 
**position** | **Integer** | The 0-based boundary position where the deletion starts. That is, position 0 starts the deletion immediately before the first nucleotide and position 1 starts the deletion between the first and second nucleotides. | 
**deletedSequence** | **String** | The IUPAC sequence of nucleotides/amino-acids to delete from the reference. This can be empty, which is how a pure insertion is represented. | 
**insertedSequence** | **String** | The IUPAC sequence of nucleotides/amino-acids to insert after perforing the deletion. Amino-acids use the single character encoding. All nucleotide codes including the ones for ambiguity are allowed. | 
**warnings** | [**Warnings**](Warnings.md) |  |  [optional]
