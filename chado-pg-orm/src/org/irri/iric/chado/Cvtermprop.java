package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Cvtermprop generated by hbm2java
 */
public class Cvtermprop implements java.io.Serializable {

	private int cvtermpropId;
	private Cvterm cvtermByCvtermId;
	private Cvterm cvtermByTypeId;
	private String value;
	private int rank;

	public Cvtermprop() {
	}

	public Cvtermprop(int cvtermpropId, Cvterm cvtermByCvtermId,
			Cvterm cvtermByTypeId, String value, int rank) {
		this.cvtermpropId = cvtermpropId;
		this.cvtermByCvtermId = cvtermByCvtermId;
		this.cvtermByTypeId = cvtermByTypeId;
		this.value = value;
		this.rank = rank;
	}

	public int getCvtermpropId() {
		return this.cvtermpropId;
	}

	public void setCvtermpropId(int cvtermpropId) {
		this.cvtermpropId = cvtermpropId;
	}

	public Cvterm getCvtermByCvtermId() {
		return this.cvtermByCvtermId;
	}

	public void setCvtermByCvtermId(Cvterm cvtermByCvtermId) {
		this.cvtermByCvtermId = cvtermByCvtermId;
	}

	public Cvterm getCvtermByTypeId() {
		return this.cvtermByTypeId;
	}

	public void setCvtermByTypeId(Cvterm cvtermByTypeId) {
		this.cvtermByTypeId = cvtermByTypeId;
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
