# SeqIdTraitByAssembly

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assemblyName** | **String** | The name of the assembly these traits reference | 
**assemblyAccession** | **String** | The Genomic Collections accession for this assembly. For more information, see, for example, http://www.ncbi.nlm.nih.gov/assembly/GCF_000001405.38/ | 
**isTopLevel** | **Boolean** | True if the sequence is top-level (the most highly assembled sequences in a genome assembly) | 
**isAlt** | **Boolean** | True if this placement&#x27;s sequence is an alternative loci (a sequence that provides an alternate representation of a locus found in a largely haploid assembly) | 
**isPatch** | **Boolean** | True if this placement&#x27;s sequence is a patch sequence (a contig sequence that is released outside of the full assembly release cycle.  These sequences are meant to add information to the assembly without disrupting the stable coordinate system) | 
**isChromosome** | **Boolean** | True if this placement&#x27;s sequence is a chromosome sequence (a relatively complete pseudo-molecule assembled from smaller sequences (components) that represent a biological chromosome) | 
