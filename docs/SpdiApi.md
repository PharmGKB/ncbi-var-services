# SpdiApi

All URIs are relative to *https://api.ncbi.nlm.nih.gov/variation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spdiSpdiAllEquivalentContextualGet**](SpdiApi.md#spdiSpdiAllEquivalentContextualGet) | **GET** /spdi/{spdi}/all_equivalent_contextual | Retrieve equivalent contextual allele on all aligned sequences
[**spdiSpdiCanonicalRepresentativeGet**](SpdiApi.md#spdiSpdiCanonicalRepresentativeGet) | **GET** /spdi/{spdi}/canonical_representative | Retrieve canonical allele representative
[**spdiSpdiContextualGet**](SpdiApi.md#spdiSpdiContextualGet) | **GET** /spdi/{spdi}/contextual | Retrieve contextual allele in SPDI syntax for provided allele
[**spdiSpdiHgvsGet**](SpdiApi.md#spdiSpdiHgvsGet) | **GET** /spdi/{spdi}/hgvs | Retrieve HGVS notation for contextual allele in SPDI Syntax
[**spdiSpdiRsidsGet**](SpdiApi.md#spdiSpdiRsidsGet) | **GET** /spdi/{spdi}/rsids | Lookup the RSIDs (if any) associated with the input allele
[**spdiSpdiVcfFieldsGet**](SpdiApi.md#spdiSpdiVcfFieldsGet) | **GET** /spdi/{spdi}/vcf_fields | Retrieve fields suitable for representing the input allele in VCF

<a name="spdiSpdiAllEquivalentContextualGet"></a>
# **spdiSpdiAllEquivalentContextualGet**
> SpdisSuccess spdiSpdiAllEquivalentContextualGet(spdi)

Retrieve equivalent contextual allele on all aligned sequences

Let S be the set of all sequences where the latest alignment specifies a region equivalent to the deletion region of the input allele. For each sequence s in S, calculates a contextual allele equivalent to the input but located on s. The retrieved list cannot be empty because S contains the reference sequence for the input allele and therefore, the retrieved list will contain the contextual allele for the input allele.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    SpdisSuccess result = apiInstance.spdiSpdiAllEquivalentContextualGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiAllEquivalentContextualGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**SpdisSuccess**](SpdisSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spdiSpdiCanonicalRepresentativeGet"></a>
# **spdiSpdiCanonicalRepresentativeGet**
> SpdiSuccess spdiSpdiCanonicalRepresentativeGet(spdi)

Retrieve canonical allele representative

Get the canonical allele representative for a contextual allele, using the latest alignment data.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    SpdiSuccess result = apiInstance.spdiSpdiCanonicalRepresentativeGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiCanonicalRepresentativeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**SpdiSuccess**](SpdiSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spdiSpdiContextualGet"></a>
# **spdiSpdiContextualGet**
> SpdiSuccess spdiSpdiContextualGet(spdi)

Retrieve contextual allele in SPDI syntax for provided allele

An allele in SPDI syntax may be over-precise. This service returns the same result as applying the Blossom Precision Correction Algorithm to the input allele.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    SpdiSuccess result = apiInstance.spdiSpdiContextualGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiContextualGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**SpdiSuccess**](SpdiSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spdiSpdiHgvsGet"></a>
# **spdiSpdiHgvsGet**
> HgvsSuccess spdiSpdiHgvsGet(spdi)

Retrieve HGVS notation for contextual allele in SPDI Syntax

Convert the contextual allele in SPDI syntax to the right-shifted HGVS notation.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    HgvsSuccess result = apiInstance.spdiSpdiHgvsGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiHgvsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**HgvsSuccess**](HgvsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spdiSpdiRsidsGet"></a>
# **spdiSpdiRsidsGet**
> RsidsSuccess spdiSpdiRsidsGet(spdi)

Lookup the RSIDs (if any) associated with the input allele

Given a contextual allele, return the ID numbers of the RefSNPs that include that contextual allele (if there are any).

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    RsidsSuccess result = apiInstance.spdiSpdiRsidsGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiRsidsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**RsidsSuccess**](RsidsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spdiSpdiVcfFieldsGet"></a>
# **spdiSpdiVcfFieldsGet**
> VcfFieldsSuccess spdiSpdiVcfFieldsGet(spdi)

Retrieve fields suitable for representing the input allele in VCF

Return allele-description fields of a VCF entry (CHROM, POS, REF, ALT) for the contextual allele corresponding to the input SPDI

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.SpdiApi;


SpdiApi apiInstance = new SpdiApi();
String spdi = "spdi_example"; // String | Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE)
try {
    VcfFieldsSuccess result = apiInstance.spdiSpdiVcfFieldsGet(spdi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpdiApi#spdiSpdiVcfFieldsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spdi** | **String**| Allele in SPDI syntax of SEQUENCE-ID:POSITION:DEL-SEQUENCE:INS-SEQUENCE (or just deletion length: SEQUENCE-ID:POSITION:DEL-LEN:INS-SEQUENCE) |

### Return type

[**VcfFieldsSuccess**](VcfFieldsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

