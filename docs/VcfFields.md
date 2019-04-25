# VcfFields

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chrom** | **String** | The RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. | 
**pos** | **Integer** | The 1-based position of the first nucleotide in the reference allele string on its sequence | 
**ref** | **String** | The reference allele, with padding nucleotide when required | 
**alt** | **String** | Alternate allele, with padding nucleotide when required | 
**warnings** | [**Warnings**](Warnings.md) |  |  [optional]
