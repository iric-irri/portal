package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * PhylonodeOrganism generated by hbm2java
 */
public class PhylonodeOrganism implements java.io.Serializable {

	private int phylonodeOrganismId;
	private Organism organism;
	private Phylonode phylonode;

	public PhylonodeOrganism() {
	}

	public PhylonodeOrganism(int phylonodeOrganismId, Organism organism,
			Phylonode phylonode) {
		this.phylonodeOrganismId = phylonodeOrganismId;
		this.organism = organism;
		this.phylonode = phylonode;
	}

	public int getPhylonodeOrganismId() {
		return this.phylonodeOrganismId;
	}

	public void setPhylonodeOrganismId(int phylonodeOrganismId) {
		this.phylonodeOrganismId = phylonodeOrganismId;
	}

	public Organism getOrganism() {
		return this.organism;
	}

	public void setOrganism(Organism organism) {
		this.organism = organism;
	}

	public Phylonode getPhylonode() {
		return this.phylonode;
	}

	public void setPhylonode(Phylonode phylonode) {
		this.phylonode = phylonode;
	}

}
