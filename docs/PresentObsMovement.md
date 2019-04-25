# PresentObsMovement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentIds** | [**List&lt;SupportId&gt;**](SupportId.md) | DbSnpIds of the supporting data where this particular observation is found (SubSnpId, ClinVarSnpId, etc.) | 
**observation** | [**Spdi**](Spdi.md) |  | 
**alleleInCurRelease** | [**Spdi**](Spdi.md) |  | 
**otherRsidsInCurRelease** | **List&lt;String&gt;** | The RSIDs of any other RefSnps that contain this observation in the current release. Can only be non-empty for the identity allele. | 
**previousRelease** | [**PreviousRelease**](PreviousRelease.md) |  |  [optional]
**lastAddedToThisRs** | **String** | The most recent release in which this observation started being associated with this RSID. If the historical membership for this observation is release1:rs1 release2:rs2 release3:rs1 release4:rs1, this will hold \&quot;release3\&quot;. Note that because of a change to the dbSNP data model between builds 151 and 152, if the most recent release is prior to 152 then the observation may have been added to this RefSNP before the build listed.  For example, if it says 140, it is possible that it was really added in 130. But it cannot have been added after build 140. If it says 152, then it was last added in build 152 and not before or after that. | 
