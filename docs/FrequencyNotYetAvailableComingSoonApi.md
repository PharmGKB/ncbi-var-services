# FrequencyNotYetAvailableComingSoonApi

All URIs are relative to *https://api.ncbi.nlm.nih.gov/variation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**frequencyByInterval**](FrequencyNotYetAvailableComingSoonApi.md#frequencyByInterval) | **GET** /interval/{seq_id}:{position}:{length}/overlapping_frequency_records | Retrieve frequencies for variants overlapping a position range
[**frequencyMetadata**](FrequencyNotYetAvailableComingSoonApi.md#frequencyMetadata) | **GET** /metadata/frequency | Retrieve frequency metadata

<a name="frequencyByInterval"></a>
# **frequencyByInterval**
> Object frequencyByInterval(seqId, position, length)

Retrieve frequencies for variants overlapping a position range

Retrieve frequencies for variants whose Contextual SPDI overlaps the sequence interval in the query. Detailed information about ids used in reply could be retrieved using \&quot;/metadata/frequency\&quot; endpoint. 

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.FrequencyNotYetAvailableComingSoonApi;


FrequencyNotYetAvailableComingSoonApi apiInstance = new FrequencyNotYetAvailableComingSoonApi();
String seqId = "seqId_example"; // String | Sequence id in 'accession.version' format
Integer position = 56; // Integer | Zero-based SPDI-like start position. The number of nucleotides to advance from the position before the first nucleotides before starting the interval.
Integer length = 56; // Integer | SPDI-like length of interval in units of nucleotides
try {
    Object result = apiInstance.frequencyByInterval(seqId, position, length);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FrequencyNotYetAvailableComingSoonApi#frequencyByInterval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seqId** | **String**| Sequence id in &#x27;accession.version&#x27; format |
 **position** | **Integer**| Zero-based SPDI-like start position. The number of nucleotides to advance from the position before the first nucleotides before starting the interval. | [enum: ]
 **length** | **Integer**| SPDI-like length of interval in units of nucleotides | [enum: ]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="frequencyMetadata"></a>
# **frequencyMetadata**
> Map frequencyMetadata()

Retrieve frequency metadata

Retrieve information that describes all studies and populations used by frequency endpoint.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.FrequencyNotYetAvailableComingSoonApi;


FrequencyNotYetAvailableComingSoonApi apiInstance = new FrequencyNotYetAvailableComingSoonApi();
try {
    Map result = apiInstance.frequencyMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FrequencyNotYetAvailableComingSoonApi#frequencyMetadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

