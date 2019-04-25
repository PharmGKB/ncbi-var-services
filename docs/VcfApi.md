# VcfApi

All URIs are relative to *https://api.ncbi.nlm.nih.gov/variation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vcfChromPosRefAltsContextualsGet**](VcfApi.md#vcfChromPosRefAltsContextualsGet) | **GET** /vcf/{chrom}/{pos}/{ref}/{alts}/contextuals | Retrieve contextual alleles for the reference allele and each alternate allele
[**vcfFileSetRsidsPost**](VcfApi.md#vcfFileSetRsidsPost) | **POST** /vcf/file/set_rsids | For provided VCF data, add RSIDs in the ID field

<a name="vcfChromPosRefAltsContextualsGet"></a>
# **vcfChromPosRefAltsContextualsGet**
> SpdisSuccess vcfChromPosRefAltsContextualsGet(chrom, pos, ref, alts, assembly)

Retrieve contextual alleles for the reference allele and each alternate allele

Returns a list of SPDI format alleles containing one contextual allele for each reference and alternate allele specified by the input VCF fields.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.VcfApi;


VcfApi apiInstance = new VcfApi();
String chrom = "chrom_example"; // String | Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \"X\", \"Y\", or be of the form like \"chr2\". In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes.
Integer pos = 56; // Integer | The 1-based position on the reference sequence of the first nucleotide in the reference allele string
String ref = "ref_example"; // String | The reference allele, in IUPAC notation, with padding nucleotide when required
String alts = "alts_example"; // String | Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required
String assembly = "assembly_example"; // String | GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like '1' or 'chr1'.
try {
    SpdisSuccess result = apiInstance.vcfChromPosRefAltsContextualsGet(chrom, pos, ref, alts, assembly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcfApi#vcfChromPosRefAltsContextualsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chrom** | **String**| Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \&quot;X\&quot;, \&quot;Y\&quot;, or be of the form like \&quot;chr2\&quot;. In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes. |
 **pos** | **Integer**| The 1-based position on the reference sequence of the first nucleotide in the reference allele string |
 **ref** | **String**| The reference allele, in IUPAC notation, with padding nucleotide when required |
 **alts** | **String**| Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required |
 **assembly** | **String**| GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. | [optional]

### Return type

[**SpdisSuccess**](SpdisSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vcfFileSetRsidsPost"></a>
# **vcfFileSetRsidsPost**
> File vcfFileSetRsidsPost(body, assembly)

For provided VCF data, add RSIDs in the ID field

Where there are matches to dbSNP, update the ID column of the VCF file with the matching RefSNP Identifiers (RSIDs), overwriting any pre-existing data.

### Example
```java
// Import classes:
//import org.pharmgkb.io.ncbi.ApiException;
//import org.pharmgkb.io.ncbi.api.VcfApi;


VcfApi apiInstance = new VcfApi();
String body = "body_example"; // String | Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT.
String assembly = "assembly_example"; // String | GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like '1' or 'chr1'.
try {
    File result = apiInstance.vcfFileSetRsidsPost(body, assembly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcfApi#vcfFileSetRsidsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT. |
 **assembly** | **String**| GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain; charset=utf-8
 - **Accept**: text/plain; charset=utf-8

