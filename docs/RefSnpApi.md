# RefSnpApi

All URIs are relative to *https://api.ncbi.nlm.nih.gov/variation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**betaRefsnpRsidGet**](RefSnpApi.md#betaRefsnpRsidGet) | **GET** /beta/refsnp/{rsid} | Lookup RefSNP object by RSID

<a name="betaRefsnpRsidGet"></a>
# **betaRefsnpRsidGet**
> RefsnpSnapshotSuccess betaRefsnpRsidGet(rsid)

Lookup RefSNP object by RSID

Retrieve data object associated with a RefSNP identifier for the current revision.  This is a beta-release of this service and the resulting schema is still under development.  User feedback is welcomed and appreciated.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.RefSnpApi;


RefSnpApi apiInstance = new RefSnpApi();
String rsid = "rsid_example"; // String | 64-bit RefSNP ID (integer)
try {
    RefsnpSnapshotSuccess result = apiInstance.betaRefsnpRsidGet(rsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefSnpApi#betaRefsnpRsidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rsid** | **String**| 64-bit RefSNP ID (integer) |

### Return type

[**RefsnpSnapshotSuccess**](RefsnpSnapshotSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

