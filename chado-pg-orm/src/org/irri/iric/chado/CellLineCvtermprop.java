package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CellLineCvtermprop generated by hbm2java
 */
public class CellLineCvtermprop implements java.io.Serializable {

	private int cellLineCvtermpropId;
	private CellLineCvterm cellLineCvterm;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public CellLineCvtermprop() {
	}

	public CellLineCvtermprop(int cellLineCvtermpropId,
			CellLineCvterm cellLineCvterm, Cvterm cvterm, int rank) {
		this.cellLineCvtermpropId = cellLineCvtermpropId;
		this.cellLineCvterm = cellLineCvterm;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public CellLineCvtermprop(int cellLineCvtermpropId,
			CellLineCvterm cellLineCvterm, Cvterm cvterm, String value, int rank) {
		this.cellLineCvtermpropId = cellLineCvtermpropId;
		this.cellLineCvterm = cellLineCvterm;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getCellLineCvtermpropId() {
		return this.cellLineCvtermpropId;
	}

	public void setCellLineCvtermpropId(int cellLineCvtermpropId) {
		this.cellLineCvtermpropId = cellLineCvtermpropId;
	}

	public CellLineCvterm getCellLineCvterm() {
		return this.cellLineCvterm;
	}

	public void setCellLineCvterm(CellLineCvterm cellLineCvterm) {
		this.cellLineCvterm = cellLineCvterm;
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
