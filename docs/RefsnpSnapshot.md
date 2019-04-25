# RefsnpSnapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refsnpId** | **String** | A 64 bit positive integer that is uniquely and forever assigned to this RefSNP object | 
**createDate** | **String** | The date the RefSNP was created | 
**lastUpdateDate** | **String** | The date the RefSNP was last updated or create_date if never updated | 
**lastUpdateBuildId** | **String** | The id of the last dbSNP build in which this RefSNP was created or updated | 
**dbsnp1Merges** | [**List&lt;Dbsnp1MergeEvent&gt;**](Dbsnp1MergeEvent.md) | Note: this field is for dbsnp1 merge only. Record of each time another RefSNP objects merged into this RefSNP because the RsAnchors of each were the same.  If the recipient of a merge then merges into yet a third RefSNP, the list is flattened. | 
**citations** | **List&lt;Integer&gt;** | Set of PubMed IDs (PMIDs) for this RefSNP or its supporting submissions | 
**lostObsMovements** | [**List&lt;LostObsMovement&gt;**](LostObsMovement.md) | Movements recording observations lost between the previous release and this release | 
**presentObsMovements** | [**List&lt;PresentObsMovement&gt;**](PresentObsMovement.md) | The record of movements between the previous and current release for observations mapped to this RefSNP by the Alignment Data Set used in this release | 
**nosnpposSnapshotData** | [**NosnpposSnapshotData**](NosnpposSnapshotData.md) |  |  [optional]
**withdrawnSnapshotData** | [**WithdrawnSnapshotData**](WithdrawnSnapshotData.md) |  |  [optional]
**primarySnapshotData** | [**PrimarySnapshotData**](PrimarySnapshotData.md) |  |  [optional]
**mergedSnapshotData** | [**MergedSnapshotData**](MergedSnapshotData.md) |  |  [optional]
**unsupportedSnapshotData** | [**UnsupportedSnapshotData**](UnsupportedSnapshotData.md) |  |  [optional]
