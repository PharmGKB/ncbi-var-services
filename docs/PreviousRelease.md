# PreviousRelease

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allele** | [**Spdi**](Spdi.md) |  | 
**rsids** | **List&lt;String&gt;** | The ids of the RefSnps that contained a particular observation in the previous release. Only identity alleles can belong to more than one RefSnp, so this can only have more than one entry if the observation maps to the identity allele.  The PreviousRelease struct should only be used when the observation was present in the previous release, so this field should not be empty. | 
