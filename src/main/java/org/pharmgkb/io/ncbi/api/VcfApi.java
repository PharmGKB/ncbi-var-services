/*
 * Variation Services
 * Services for variation data processing<p> <div style=\"font-size:1.1em;font-weight:normal\">NOTE: This service is still in beta testing mode. Please limit your request rate to 1 request/second.  dbSNP provides bulk download in VCF and JSON on the <a href=\"ftp://ftp.ncbi.nih.gov/snp/latest_release/\">FTP site</a> for users with a large number of RefSNPs (>100K) to process.</div> 
 *
 * OpenAPI spec version: 2.0.0
 * Contact: variation-services@ncbi.nlm.nih.gov
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.pharmgkb.io.ncbi.api;

import org.pharmgkb.io.ncbi.ApiCallback;
import org.pharmgkb.io.ncbi.ApiClient;
import org.pharmgkb.io.ncbi.ApiException;
import org.pharmgkb.io.ncbi.ApiResponse;
import org.pharmgkb.io.ncbi.Configuration;
import org.pharmgkb.io.ncbi.Pair;
import org.pharmgkb.io.ncbi.ProgressRequestBody;
import org.pharmgkb.io.ncbi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.pharmgkb.io.ncbi.model.Error;
import java.io.File;
import org.pharmgkb.io.ncbi.model.SpdisSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VcfApi {
    private ApiClient apiClient;

    public VcfApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VcfApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for vcfChromPosRefAltsContextualsGet
     * @param chrom Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \&quot;X\&quot;, \&quot;Y\&quot;, or be of the form like \&quot;chr2\&quot;. In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes. (required)
     * @param pos The 1-based position on the reference sequence of the first nucleotide in the reference allele string (required)
     * @param ref The reference allele, in IUPAC notation, with padding nucleotide when required (required)
     * @param alts Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call vcfChromPosRefAltsContextualsGetCall(String chrom, Integer pos, String ref, String alts, String assembly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vcf/{chrom}/{pos}/{ref}/{alts}/contextuals"
            .replaceAll("\\{" + "chrom" + "\\}", apiClient.escapeString(chrom.toString()))
            .replaceAll("\\{" + "pos" + "\\}", apiClient.escapeString(pos.toString()))
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "alts" + "\\}", apiClient.escapeString(alts.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (assembly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("assembly", assembly));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call vcfChromPosRefAltsContextualsGetValidateBeforeCall(String chrom, Integer pos, String ref, String alts, String assembly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'chrom' is set
        if (chrom == null) {
            throw new ApiException("Missing the required parameter 'chrom' when calling vcfChromPosRefAltsContextualsGet(Async)");
        }
        // verify the required parameter 'pos' is set
        if (pos == null) {
            throw new ApiException("Missing the required parameter 'pos' when calling vcfChromPosRefAltsContextualsGet(Async)");
        }
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling vcfChromPosRefAltsContextualsGet(Async)");
        }
        // verify the required parameter 'alts' is set
        if (alts == null) {
            throw new ApiException("Missing the required parameter 'alts' when calling vcfChromPosRefAltsContextualsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = vcfChromPosRefAltsContextualsGetCall(chrom, pos, ref, alts, assembly, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve contextual alleles for the reference allele and each alternate allele
     * Returns a list of SPDI format alleles containing one contextual allele for each reference and alternate allele specified by the input VCF fields.
     * @param chrom Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \&quot;X\&quot;, \&quot;Y\&quot;, or be of the form like \&quot;chr2\&quot;. In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes. (required)
     * @param pos The 1-based position on the reference sequence of the first nucleotide in the reference allele string (required)
     * @param ref The reference allele, in IUPAC notation, with padding nucleotide when required (required)
     * @param alts Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @return SpdisSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SpdisSuccess vcfChromPosRefAltsContextualsGet(String chrom, Integer pos, String ref, String alts, String assembly) throws ApiException {
        ApiResponse<SpdisSuccess> resp = vcfChromPosRefAltsContextualsGetWithHttpInfo(chrom, pos, ref, alts, assembly);
        return resp.getData();
    }

    /**
     * Retrieve contextual alleles for the reference allele and each alternate allele
     * Returns a list of SPDI format alleles containing one contextual allele for each reference and alternate allele specified by the input VCF fields.
     * @param chrom Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \&quot;X\&quot;, \&quot;Y\&quot;, or be of the form like \&quot;chr2\&quot;. In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes. (required)
     * @param pos The 1-based position on the reference sequence of the first nucleotide in the reference allele string (required)
     * @param ref The reference allele, in IUPAC notation, with padding nucleotide when required (required)
     * @param alts Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @return ApiResponse&lt;SpdisSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SpdisSuccess> vcfChromPosRefAltsContextualsGetWithHttpInfo(String chrom, Integer pos, String ref, String alts, String assembly) throws ApiException {
        com.squareup.okhttp.Call call = vcfChromPosRefAltsContextualsGetValidateBeforeCall(chrom, pos, ref, alts, assembly, null, null);
        Type localVarReturnType = new TypeToken<SpdisSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve contextual alleles for the reference allele and each alternate allele (asynchronously)
     * Returns a list of SPDI format alleles containing one contextual allele for each reference and alternate allele specified by the input VCF fields.
     * @param chrom Usually this is the RefSeq/Genbank Accession.Version for the reference sequence. Despite the name (taken from the VCF standard) this does not need to be a chromosome. But this field can also be an integer 1..22 or a string. The string can be \&quot;X\&quot;, \&quot;Y\&quot;, or be of the form like \&quot;chr2\&quot;. In those cases the assembly parameter must be supplied to tell from what assembly the chromosome comes. (required)
     * @param pos The 1-based position on the reference sequence of the first nucleotide in the reference allele string (required)
     * @param ref The reference allele, in IUPAC notation, with padding nucleotide when required (required)
     * @param alts Comma delimited list of alternate alleles, in IUPAC notation, with padding nucleotide when required (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call vcfChromPosRefAltsContextualsGetAsync(String chrom, Integer pos, String ref, String alts, String assembly, final ApiCallback<SpdisSuccess> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = vcfChromPosRefAltsContextualsGetValidateBeforeCall(chrom, pos, ref, alts, assembly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SpdisSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vcfFileSetRsidsPost
     * @param body Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT. (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call vcfFileSetRsidsPostCall(String body, String assembly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vcf/file/set_rsids";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (assembly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("assembly", assembly));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "text/plain; charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call vcfFileSetRsidsPostValidateBeforeCall(String body, String assembly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling vcfFileSetRsidsPost(Async)");
        }
        
        com.squareup.okhttp.Call call = vcfFileSetRsidsPostCall(body, assembly, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * For provided VCF data, add RSIDs in the ID field
     * Where there are matches to dbSNP, update the ID column of the VCF file with the matching RefSNP Identifiers (RSIDs), overwriting any pre-existing data.
     * @param body Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT. (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File vcfFileSetRsidsPost(String body, String assembly) throws ApiException {
        ApiResponse<File> resp = vcfFileSetRsidsPostWithHttpInfo(body, assembly);
        return resp.getData();
    }

    /**
     * For provided VCF data, add RSIDs in the ID field
     * Where there are matches to dbSNP, update the ID column of the VCF file with the matching RefSNP Identifiers (RSIDs), overwriting any pre-existing data.
     * @param body Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT. (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> vcfFileSetRsidsPostWithHttpInfo(String body, String assembly) throws ApiException {
        com.squareup.okhttp.Call call = vcfFileSetRsidsPostValidateBeforeCall(body, assembly, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * For provided VCF data, add RSIDs in the ID field (asynchronously)
     * Where there are matches to dbSNP, update the ID column of the VCF file with the matching RefSNP Identifiers (RSIDs), overwriting any pre-existing data.
     * @param body Up to 50,000 VCF rows may be included in a single request. Only four fields will be used - CHROM, POS, REF and ALT. (required)
     * @param assembly GenColl accession.version string of the assembly used to disambiguate references. Required if the chrom field uses a location like &#x27;1&#x27; or &#x27;chr1&#x27;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call vcfFileSetRsidsPostAsync(String body, String assembly, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = vcfFileSetRsidsPostValidateBeforeCall(body, assembly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
