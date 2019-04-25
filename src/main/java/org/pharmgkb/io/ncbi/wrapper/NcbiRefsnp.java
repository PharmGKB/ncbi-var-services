package org.pharmgkb.io.ncbi.wrapper;

import org.pharmgkb.io.ncbi.ApiException;
import org.pharmgkb.io.ncbi.api.RefSnpApi;
import org.pharmgkb.io.ncbi.model.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Wrapper around the {@link RefsnpSnapshot} API response object. This has a bunch of convenience methods that put data
 * into formats that PharmGKB can process.
 *
 * @author Ryan Whaley
 */
public class NcbiRefsnp {
  private static final String FORMAT_REFSNP = "rs%s";
  
  private RefsnpSnapshot snapshot;
  
  public NcbiRefsnp(String rsid) throws ApiException {
    if (rsid == null || rsid.length() == 0) {
      throw new IllegalArgumentException("No RSID specified");
    }
    else if (!rsid.startsWith("rs")) {
      throw new IllegalArgumentException("RSID not in expected format");
    }
    
    setSnapshot(new RefSnpApi().betaRefsnpRsidGet(rsid.replaceAll("rs", "")));
  }

  private RefsnpSnapshot getSnapshot() {
    return this.snapshot;
  }

  private void setSnapshot(RefsnpSnapshot snapshot) {
    this.snapshot = snapshot;
  }

  /**
   * Gets the dbSNP ID for this variant in the format "rs####"
   * @return the dbSNP ID in the format "rs####"
   */
  public String getRsid() {
    return String.format(FORMAT_REFSNP, getSnapshot().getRefsnpId());
  }

  /**
   * Gets all the dbSNP IDs that have been merged into this record
   * @return a List of dbSNP IDs in the format "rs####"
   */
  public List<String> getMergedRsids() {
    return snapshot.getDbsnp1Merges().stream()
        .map(m -> String.format(FORMAT_REFSNP, m.getMergedRsid()))
        .collect(Collectors.toList());
  }

  /**
   * Gets all the non-reference HGVS names that have been associated with this variant 
   * @return a List of HGVS names
   */
  public List<String> getHgvsNames() {
    return snapshot.getPrimarySnapshotData().getPlacementsWithAllele().stream()
        .flatMap(p -> p.getAlleles().stream())
        .filter(isVariant)
        .map(PlacementAnnotatedAllele::getHgvs)
        .sorted()
        .collect(Collectors.toList());
  }

  /**
   * Gets all the non-reference SPDI strings associated with this variant
   * @return a List of SPDI names
   */
  public List<String> getSpdiNames() {
    return snapshot.getPrimarySnapshotData().getPlacementsWithAllele().stream()
        .flatMap(p -> p.getAlleles().stream())
        .filter(isVariant)
        .map(a -> a.getAllele().getSpdi())
        .map(toSpdiString)
        .sorted()
        .collect(Collectors.toList());
  }

  /**
   * Gets an optional placement on the current (GRCh38) assembly
   * @return a chromosomal placement
   */
  public Optional<NcbiPlacement> getCurrentChromoPlacement() {
    return getSnapshot().getPrimarySnapshotData().getPlacementsWithAllele().stream()
        .map(NcbiPlacement::new)
        .filter(NcbiPlacement::isChromoCurrentBuild)
        .findFirst();
  }

  /**
   * Gets an optional placement on the previous (GRCh37) assembly
   * @return a chromosomal placement
   */
  public Optional<NcbiPlacement> getPreviousChromoPlacement() {
    return getSnapshot().getPrimarySnapshotData().getPlacementsWithAllele().stream()
        .map(NcbiPlacement::new)
        .filter(NcbiPlacement::isChromoPreviousBuild)
        .findFirst();
  }

  /**
   * Gets an optional placement on a protein sequence
   * @return a protein placement
   */
  public Optional<NcbiPlacement> getProteinPlacement() {
    return getSnapshot().getPrimarySnapshotData().getPlacementsWithAllele().stream()
        .map(NcbiPlacement::new)
        .filter(NcbiPlacement::isProtein)
        .findFirst();
  }

  /**
   * Gets a List of all gene symbols that this variant is associated with
   * @return a List of gene symbol Strings
   */
  public List<String> getGenes() {
    return getSnapshot().getPrimarySnapshotData().getAlleleAnnotations().stream()
        .flatMap(a -> a.getAssemblyAnnotation().stream())
        .flatMap(aa -> aa.getGenes().stream())
        .map(GeneAnnotForAllele::getLocus)
        .distinct()
        .sorted()
        .collect(Collectors.toList());
  }
  
  private static final Predicate<PlacementAnnotatedAllele> isVariant = (a) -> {
    if (a.getAllele() == null || a.getAllele().getSpdi() == null) {
      return false;
    }
    Spdi spdi = a.getAllele().getSpdi();
    return !spdi.getInsertedSequence().equals(spdi.getDeletedSequence());
  };
  
  private static final Function<Spdi, String> toSpdiString = (s) -> s.getSeqId() 
        + ":" + s.getPosition()
        + ":" + s.getDeletedSequence()
        + ":" + s.getInsertedSequence();
  
  public Stream<String> getSnpTypes() {
    return getSnapshot().getPrimarySnapshotData().getAlleleAnnotations().stream()
        .flatMap(a -> a.getAssemblyAnnotation().stream())
        .flatMap(aa -> aa.getGenes().stream())
        .flatMap(g -> g.getRnas().stream())
        .flatMap(r -> r.getSequenceOntology().stream())
        .map(SoTerm::getName)
        .distinct()
        .sorted();
  }
  
  public Stream<String> getChangeClassifications() {
    return getSnapshot().getPrimarySnapshotData().getAlleleAnnotations().stream()
        .flatMap(a -> a.getAssemblyAnnotation().stream())
        .flatMap(aa -> aa.getGenes().stream())
        .flatMap(g -> g.getRnas().stream())
        .filter(r -> !Objects.equals(r.getCodonAlignedTranscriptChange().getDeletedSequence(), r.getCodonAlignedTranscriptChange().getInsertedSequence()))
        .flatMap(r -> r.getProtein().getSequenceOntology().stream())
        .map(SoTerm::getName)
        .distinct()
        .sorted();
  }
}
