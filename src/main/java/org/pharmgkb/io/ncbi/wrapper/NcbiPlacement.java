package org.pharmgkb.io.ncbi.wrapper;

import org.pharmgkb.io.ncbi.model.PlacementWithAllele;
import org.pharmgkb.io.ncbi.model.Spdi;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * TODO: fill in docs
 *
 * @author Ryan Whaley
 */
public class NcbiPlacement {
  
  private PlacementWithAllele placement;
  
  public NcbiPlacement(PlacementWithAllele placement) {
    this.placement = placement;
  }

  /**
   * Whether this is the primary placement for the parent RefSnp record, should only be the chomosomal placement for 
   * the current assembly.
   * @return true if this is primary
   */
  public boolean isPrimary() {
    return this.placement.isIsPtlp();
  }

  /**
   * Whether this placement is for a reference protein sequence
   * @return true if this is a reference protein placement
   */
  public boolean isProtein() {
    return this.placement.getSeqId().startsWith("NP_");
  }

  /**
   * Whether this placement is for a reference chromosome sequence
   * @return true if this is a reference chromosome placement
   */
  public boolean isChromosome() {
    return this.placement.getSeqId().startsWith("NC_");
  }
  
  public boolean isChromoCurrentBuild() {
    return isChromosome() && isPrimary();
  }
  
  public boolean isChromoPreviousBuild() {
    return isChromosome() && !isPrimary();
  }

  /**
   * Gets the Optional reference allele for this sequence placement
   */
  public Optional<String> getRefAllele() {
    return this.placement.getAlleles().stream()
        .map(p -> p.getAllele().getSpdi().getDeletedSequence())
        .findFirst();
  }

  /**
   * Gets a Stream of variant alleles for this sequence placement
   */
  public Stream<String> getVarAlleles() {
    return this.placement.getAlleles().stream()
        .map(p -> p.getAllele().getSpdi())
        .filter(s -> !Objects.equals(s.getDeletedSequence(), s.getInsertedSequence()))
        .map(Spdi::getInsertedSequence);
  }

  /**
   * Gets the sequence ID for this placement
   * @return a Sequence ID String, either a RefSeq ID or Genbank ID
   */
  public String getSequenceId() {
    return this.placement.getSeqId();
  }

  /**
   * Gets the position on the sequence placement
   * @return the 0-based position
   */
  public Optional<Integer> getPosition() {
    return this.placement.getAlleles().stream()
        .map(p -> p.getAllele().getSpdi().getPosition())
        .findFirst();
  }
}
