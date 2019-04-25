package org.pharmgkb.io.ncbi.wrapper;

import org.junit.Test;
import org.pharmgkb.io.ncbi.ApiException;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testing the {@link NcbiRefsnp}
 *
 * @author Ryan Whaley
 */
public class NcbiRefsnpTest {
  private static final String REFSNP = "rs9274407";
  
  
  @Test
  public void testGetRsid() throws ApiException {
    NcbiRefsnp ncbiRefsnp = new NcbiRefsnp(REFSNP);
    assertEquals(REFSNP, ncbiRefsnp.getRsid());
    
    assertEquals(5, ncbiRefsnp.getMergedRsids().size());
    assertEquals(40, ncbiRefsnp.getHgvsNames().size());
    assertEquals(40, ncbiRefsnp.getSpdiNames().size());
    
    NcbiPlacement current = ncbiRefsnp.getCurrentChromoPlacement().orElseThrow(() -> new IllegalStateException("Expected current"));
    assertEquals("A", current.getRefAllele().orElseThrow(() -> new IllegalStateException("bad test data")));
    assertEquals("NC_000006.12", current.getSequenceId());
    assertEquals(new Integer(32665054), current.getPosition().orElseThrow(() -> new IllegalStateException("bad test data")));
    
    NcbiPlacement prev = ncbiRefsnp.getPreviousChromoPlacement().orElseThrow(() -> new IllegalStateException("bad test data"));
    String alts = prev.getVarAlleles().collect(Collectors.joining(","));
    assertEquals("C,T", alts);
    assertEquals("NC_000006.11", prev.getSequenceId());
    assertEquals(new Integer(32632831), prev.getPosition().orElseThrow(() -> new IllegalStateException("bad test data")));
    
    NcbiPlacement prot = ncbiRefsnp.getProteinPlacement().orElseThrow(() -> new IllegalStateException("bad test data"));
    String protAlts = prot.getVarAlleles().collect(Collectors.joining(","));
    assertEquals("C,Y", protAlts);
    assertEquals("NP_002114.3", prot.getSequenceId());
    assertEquals(new Integer(40), prot.getPosition().orElseThrow(() -> new IllegalStateException("bad test data")));
    
    List<String> genes = ncbiRefsnp.getGenes();
    assertEquals(1, genes.size());
    assertTrue(genes.contains("HLA-DQB1"));
  }
}
