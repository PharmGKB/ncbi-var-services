# ClinvarData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessionVersion** | **String** | The ClinVar RCV record that links this particular allele to this particular phenotype.  For more information, see http://www.ncbi.nlm.nih.gov/clinvar/intro/ | 
**alleleId** | **Integer** | ClinVar&#x27;s identifier for this allele.  For more information, see http://www.ncbi.nlm.nih.gov/clinvar/docs/help/ | 
**measureSetId** | **Integer** | ClinVar&#x27;s identifer for a set of variants that may influence the phenotype together, such as in a haplotype.  A measure-set aggregates together several allele_ids. | 
**variantIdentifiers** | [**List&lt;ExternalRef&gt;**](ExternalRef.md) | External variant identifers, simliar to RefSNP numbers.  They are independent of RCV&#x27;s altogether.  They should be the same for every RCV in a RefSnp.  Formerly &#x27;source-link&#x27;. | 
**refsnpId** | **String** | The associated RefSnp ID according to ClinVar at time of dbSNP revision creation. | 
**createDate** | **String** | The date and time the ClinVar RCV was created | 
**updateDate** | **String** | The date the ClinVar RCV was last updated. If never updated, then same as create-date. | 
**lastEvaluatedDate** | **String** | The date the submitter last evaluated the clinical significance for this record.  If absent, then value not submitted by submitter. |  [optional]
**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) | The status of the RCV | 
**diseaseNames** | **List&lt;String&gt;** | Each RCV record is associated with one or more preferred disease names | 
**clinicalSignificances** | [**List&lt;ClinicalSignificancesEnum&gt;**](#List&lt;ClinicalSignificancesEnum&gt;) | The signifiances of this allele in the context of this disease | 
**diseaseIds** | [**List&lt;ExternalRef&gt;**](ExternalRef.md) | There are zero or more disease-ids per RCV | 
**origins** | [**List&lt;OriginsEnum&gt;**](#List&lt;OriginsEnum&gt;) | The biological origins of the allele. Each SCV can have many values for this field and this reports their aggregate (taken from the RCV), with duplicates removed. | 
**collectionMethod** | **List&lt;String&gt;** | How each SCV was collected.  Each SCV can have many values for this field and this reports their aggregate (taken from the RCV), with duplicates removed. | 
**citations** | **List&lt;Integer&gt;** | Set of PubMed IDs (PMIDs) associated with this RCV | 
**geneIds** | **List&lt;String&gt;** | Set of ClinVar reported genes associated with this RCV | 

<a name="ReviewStatusEnum"></a>
## Enum: ReviewStatusEnum
Name | Value
---- | -----
NO_ASSERTION_PROVIDED | &quot;no_assertion_provided&quot;
NO_ASSERTION_CRITERIA_PROVIDED | &quot;no_assertion_criteria_provided&quot;
CRITERIA_PROVIDED_SINGLE_SUBMITTER | &quot;criteria_provided_single_submitter&quot;
CRITERIA_PROVIDED_MULTIPLE_SUBMITTERS_NO_CONFLICTS | &quot;criteria_provided_multiple_submitters_no_conflicts&quot;
CRITERIA_PROVIDED_CONFLICTING_INTERPRETATIONS | &quot;criteria_provided_conflicting_interpretations&quot;
REVIEWED_BY_EXPERT_PANEL | &quot;reviewed_by_expert_panel&quot;
PRACTICE_GUIDELINE | &quot;practice_guideline&quot;

<a name="List<ClinicalSignificancesEnum>"></a>
## Enum: List&lt;ClinicalSignificancesEnum&gt;
Name | Value
---- | -----
NOT_PROVIDED | &quot;not_provided&quot;
PATHOGENIC | &quot;pathogenic&quot;
LIKELY_PATHOGENIC | &quot;likely_pathogenic&quot;
BENIGN | &quot;benign&quot;
LIKELY_BENIGN | &quot;likely_benign&quot;
DRUG_RESPONSE | &quot;drug_response&quot;
CONFERS_SENSITIVITY | &quot;confers_sensitivity&quot;
RISK_FACTOR | &quot;risk_factor&quot;
ASSOCIATION | &quot;association&quot;
PROTECTIVE | &quot;protective&quot;
CONFLICTING_INTERPRETATIONS_OF_PATHOGENICITY | &quot;conflicting_interpretations_of_pathogenicity&quot;
UNCERTAIN_SIGNIFICANCE | &quot;uncertain_significance&quot;
AFFECTS | &quot;affects&quot;
ASSOCIATION_NOT_FOUND | &quot;association_not_found&quot;
OTHER | &quot;other&quot;

<a name="List<OriginsEnum>"></a>
## Enum: List&lt;OriginsEnum&gt;
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
GERMLINE | &quot;germline&quot;
SOMATIC | &quot;somatic&quot;
DE_NOVO | &quot;de_novo&quot;
INHERITED | &quot;inherited&quot;
MATERNAL | &quot;maternal&quot;
PATERNAL | &quot;paternal&quot;
UNIPARENTAL | &quot;uniparental&quot;
BIPARENTAL | &quot;biparental&quot;
NOT_REPORTED | &quot;not_reported&quot;
TESTED_INCONCLUSIVE | &quot;tested_inconclusive&quot;
NOT_APPLICABLE | &quot;not_applicable&quot;
EXPERIMENTALLY_GENERATED | &quot;experimentally_generated&quot;
