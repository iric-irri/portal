package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Dbxrefprop generated by hbm2java
 */
public class Dbxrefprop implements java.io.Serializable {

	private int dbxrefpropId;
	private Dbxref dbxref;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public Dbxrefprop() {
	}

	public Dbxrefprop(int dbxrefpropId, Dbxref dbxref, Cvterm cvterm,
			String value, int rank) {
		this.dbxrefpropId = dbxrefpropId;
		this.dbxref = dbxref;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getDbxrefpropId() {
		return this.dbxrefpropId;
	}

	public void setDbxrefpropId(int dbxrefpropId) {
		this.dbxrefpropId = dbxrefpropId;
	}

	public Dbxref getDbxref() {
		return this.dbxref;
	}

	public void setDbxref(Dbxref dbxref) {
		this.dbxref = dbxref;
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
