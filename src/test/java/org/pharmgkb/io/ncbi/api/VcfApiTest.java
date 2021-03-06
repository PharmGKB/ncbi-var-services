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
import java.io.File;
import org.pharmgkb.io.ncbi.model.SpdisSuccess;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VcfApi
 */
@Ignore
public class VcfApiTest {

    private final VcfApi api = new VcfApi();

    /**
     * Retrieve contextual alleles for the reference allele and each alternate allele
     *
     * Returns a list of SPDI format alleles containing one contextual allele for each reference and alternate allele specified by the input VCF fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vcfChromPosRefAltsContextualsGetTest() throws ApiException {
        String chrom = null;
        Integer pos = null;
        String ref = null;
        String alts = null;
        String assembly = null;
        SpdisSuccess response = api.vcfChromPosRefAltsContextualsGet(chrom, pos, ref, alts, assembly);

        // TODO: test validations
    }
    /**
     * For provided VCF data, add RSIDs in the ID field
     *
     * Where there are matches to dbSNP, update the ID column of the VCF file with the matching RefSNP Identifiers (RSIDs), overwriting any pre-existing data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vcfFileSetRsidsPostTest() throws ApiException {
        String body = null;
        String assembly = null;
        File response = api.vcfFileSetRsidsPost(body, assembly);

        // TODO: test validations
    }
}
