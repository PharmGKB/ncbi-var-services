# PlacementAnnot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seqType** | [**SeqTypeEnum**](#SeqTypeEnum) | The associated sequence&#x27;s type | 
**molType** | [**MolTypeEnum**](#MolTypeEnum) | The associated sequence&#x27;s molecule type | 
**seqIdTraitsByAssembly** | [**List&lt;SeqIdTraitByAssembly&gt;**](SeqIdTraitByAssembly.md) | The relationships between this sequence and the genomic assemblies in which it participates (if any) | 
**isAlnOppositeOrientation** | **Boolean** | True if this sequence is aligned reverse to the PTLP sequence. Thus, the PTLP sequence&#x27;s is_aln_opposite_orientation attribute is always false. | 
**isMismatch** | **Boolean** | True if this sequence&#x27;s residues are different than the PTLP sequence at this locus.  Thus, the PTLP sequence&#x27;s is_mismatch attribute is always false. | 

<a name="SeqTypeEnum"></a>
## Enum: SeqTypeEnum
Name | Value
---- | -----
REFSEQ_CHROMOSOME | &quot;refseq_chromosome&quot;
REFSEQ_CONTIG | &quot;refseq_contig&quot;
GPIPE_CHROMOSOME | &quot;gpipe_chromosome&quot;
CONTIG | &quot;contig&quot;
REFSEQ_GENOMIC | &quot;refseq_genomic&quot;
REFSEQ_MRNA | &quot;refseq_mrna&quot;
REFSEQ_MRNA_PRED | &quot;refseq_mrna_pred&quot;
MRNA | &quot;mrna&quot;
REFSEQ_NCRNA | &quot;refseq_ncrna&quot;
REFSEQ_NCRNA_PRED | &quot;refseq_ncrna_pred&quot;
NCRNA | &quot;ncrna&quot;
REFSEQ_PROT | &quot;refseq_prot&quot;
GENBANK | &quot;genbank&quot;
EMBL | &quot;embl&quot;
DDBJ | &quot;ddbj&quot;

<a name="MolTypeEnum"></a>
## Enum: MolTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
GENOMIC | &quot;genomic&quot;
RNA | &quot;rna&quot;
PROTEIN | &quot;protein&quot;
MITOCHONDRION | &quot;mitochondrion&quot;
NUCLEIC_ACID | &quot;nucleic_acid&quot;
