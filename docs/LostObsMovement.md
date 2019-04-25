# LostObsMovement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentIds** | [**List&lt;SupportId&gt;**](SupportId.md) | DbSnpIds of the supporting data where this particular observation is found (SubSnpId, ClinVarSnpId, etc.) | 
**observation** | [**Spdi**](Spdi.md) |  | 
**alleleInCurRelease** | [**Spdi**](Spdi.md) |  | 
**rsidsInCurRelease** | **List&lt;String&gt;** | The ids of the RefSnps that contain this observation in the current release.  Only identity alleles can belong to more than one RefSnp, so this can only have more than one entry if the observation maps to the identity allele. If empty then this observation no longer is associated with any id (which can only occur if it is suppressed or withdrawn (or if there is a bug)). | 
**alleleInPrevRelease** | [**Spdi**](Spdi.md) |  | 
