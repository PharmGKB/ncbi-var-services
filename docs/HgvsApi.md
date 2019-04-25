# HgvsApi

All URIs are relative to *https://api.ncbi.nlm.nih.gov/variation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hgvsBatchContextualsPost**](HgvsApi.md#hgvsBatchContextualsPost) | **POST** /hgvs/batch/contextuals | Retrieve contextual alleles for each input
[**hgvsHgvsContextualsGet**](HgvsApi.md#hgvsHgvsContextualsGet) | **GET** /hgvs/{hgvs}/contextuals | Retrieve the contextual alleles equivalent to the HGVS notation input

<a name="hgvsBatchContextualsPost"></a>
# **hgvsBatchContextualsPost**
> HgvsBatchSuccess hgvsBatchContextualsPost(body, assembly)

Retrieve contextual alleles for each input

For the input HGVS notation, retrieve all contextual alleles in SPDI syntax. (There can be more than one because of differences in the way the two models represent variation. For example, NC_012920.1:m.961delTinsC(2_7) requires one SPDI for each number of cytosines inserted).

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.HgvsApi;


HgvsApi apiInstance = new HgvsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | JSON object containing a single field "hgvs" which contains an array of the variants to process, each in HGVS notation. Up to 50,000 expressions may be included in a single request.
String assembly = "assembly_example"; // String | GenColl assembly accession for provided list of HGVS. Used only if the hgvs uses a chr location like chr1:g.12345A>T or chrX:g.234C>G
try {
    HgvsBatchSuccess result = apiInstance.hgvsBatchContextualsPost(body, assembly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HgvsApi#hgvsBatchContextualsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)| JSON object containing a single field &quot;hgvs&quot; which contains an array of the variants to process, each in HGVS notation. Up to 50,000 expressions may be included in a single request. |
 **assembly** | **String**| GenColl assembly accession for provided list of HGVS. Used only if the hgvs uses a chr location like chr1:g.12345A&gt;T or chrX:g.234C&gt;G | [optional]

### Return type

[**HgvsBatchSuccess**](HgvsBatchSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hgvsHgvsContextualsGet"></a>
# **hgvsHgvsContextualsGet**
> SpdisSuccess hgvsHgvsContextualsGet(hgvs, assembly)

Retrieve the contextual alleles equivalent to the HGVS notation input

For the input HGVS notation, retrieve all contextual alleles in SPDI syntax. (There can be more than one because of differences in the way the two models represent variation. For example, NC_012920.1:m.961delTinsC(2_7) requires one SPDI for each number of cytosines inserted.)

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.HgvsApi;


HgvsApi apiInstance = new HgvsApi();
String hgvs = "hgvs_example"; // String | Allele in HGVS notation
String assembly = "assembly_example"; // String | GenColl assembly accession for provided list of HGVS. Required only if the hgvs uses a chr location like chr1:g.12345A>T or chrX:g.234C>G
try {
    SpdisSuccess result = apiInstance.hgvsHgvsContextualsGet(hgvs, assembly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HgvsApi#hgvsHgvsContextualsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hgvs** | **String**| Allele in HGVS notation |
 **assembly** | **String**| GenColl assembly accession for provided list of HGVS. Required only if the hgvs uses a chr location like chr1:g.12345A&gt;T or chrX:g.234C&gt;G | [optional]

### Return type

[**SpdisSuccess**](SpdisSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

