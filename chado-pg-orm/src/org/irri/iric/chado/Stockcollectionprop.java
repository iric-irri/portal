package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Stockcollectionprop generated by hbm2java
 */
public class Stockcollectionprop implements java.io.Serializable {

	private int stockcollectionpropId;
	private Stockcollection stockcollection;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public Stockcollectionprop() {
	}

	public Stockcollectionprop(int stockcollectionpropId,
			Stockcollection stockcollection, Cvterm cvterm, int rank) {
		this.stockcollectionpropId = stockcollectionpropId;
		this.stockcollection = stockcollection;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public Stockcollectionprop(int stockcollectionpropId,
			Stockcollection stockcollection, Cvterm cvterm, String value,
			int rank) {
		this.stockcollectionpropId = stockcollectionpropId;
		this.stockcollection = stockcollection;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getStockcollectionpropId() {
		return this.stockcollectionpropId;
	}

	public void setStockcollectionpropId(int stockcollectionpropId) {
		this.stockcollectionpropId = stockcollectionpropId;
	}

	public Stockcollection getStockcollection() {
		return this.stockcollection;
	}

	public void setStockcollection(Stockcollection stockcollection) {
		this.stockcollection = stockcollection;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
