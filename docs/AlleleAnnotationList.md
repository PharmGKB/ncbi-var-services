# AlleleAnnotationList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | [**List&lt;FrequencyData&gt;**](FrequencyData.md) | Selected frequency attributes for each large genotype/frequency study (if any) in which the allele has been reported. One frequency_data object per study. | 
**clinical** | [**List&lt;ClinvarData&gt;**](ClinvarData.md) | Select clinical attributes for each NCBI ClinVar RCV of which this allele is a member | 
**submissions** | **List&lt;String&gt;** | The particular SubSNP ids that support this allele are reported here | 
**assemblyAnnotation** | [**List&lt;AssemblyAnnotForAllele&gt;**](AssemblyAnnotForAllele.md) | For this particular allele, the set of Annotation Releases and associated sequences for which Genes, RNAs and Coding Regions are annotated | 
