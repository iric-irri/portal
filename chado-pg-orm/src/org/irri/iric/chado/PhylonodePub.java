package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * PhylonodePub generated by hbm2java
 */
public class PhylonodePub implements java.io.Serializable {

	private int phylonodePubId;
	private Pub pub;
	private Phylonode phylonode;

	public PhylonodePub() {
	}

	public PhylonodePub(int phylonodePubId, Pub pub, Phylonode phylonode) {
		this.phylonodePubId = phylonodePubId;
		this.pub = pub;
		this.phylonode = phylonode;
	}

	public int getPhylonodePubId() {
		return this.phylonodePubId;
	}

	public void setPhylonodePubId(int phylonodePubId) {
		this.phylonodePubId = phylonodePubId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Phylonode getPhylonode() {
		return this.phylonode;
	}

	public void setPhylonode(Phylonode phylonode) {
		this.phylonode = phylonode;
	}

}
