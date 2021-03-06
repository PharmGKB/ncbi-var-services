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

import org.pharmgkb.io.ncbi.ApiException;
import org.pharmgkb.io.ncbi.model.Error;
import org.pharmgkb.io.ncbi.model.HgvsBatchSuccess;
import org.pharmgkb.io.ncbi.model.SpdisSuccess;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HgvsApi
 */
@Ignore
public class HgvsApiTest {

    private final HgvsApi api = new HgvsApi();

    /**
     * Retrieve contextual alleles for each input
     *
     * For the input HGVS notation, retrieve all contextual alleles in SPDI syntax. (There can be more than one because of differences in the way the two models represent variation. For example, NC_012920.1:m.961delTinsC(2_7) requires one SPDI for each number of cytosines inserted).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hgvsBatchContextualsPostTest() throws ApiException {
        List<String> body = null;
        String assembly = null;
        HgvsBatchSuccess response = api.hgvsBatchContextualsPost(body, assembly);

        // TODO: test validations
    }
    /**
     * Retrieve the contextual alleles equivalent to the HGVS notation input
     *
     * For the input HGVS notation, retrieve all contextual alleles in SPDI syntax. (There can be more than one because of differences in the way the two models represent variation. For example, NC_012920.1:m.961delTinsC(2_7) requires one SPDI for each number of cytosines inserted.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hgvsHgvsContextualsGetTest() throws ApiException {
        String hgvs = null;
        String assembly = null;
        SpdisSuccess response = api.hgvsHgvsContextualsGet(hgvs, assembly);

        // TODO: test validations
    }
}
