package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * NdGeolocationprop generated by hbm2java
 */
public class NdGeolocationprop implements java.io.Serializable {

	private int ndGeolocationpropId;
	private NdGeolocation ndGeolocation;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public NdGeolocationprop() {
	}

	public NdGeolocationprop(int ndGeolocationpropId,
			NdGeolocation ndGeolocation, Cvterm cvterm, int rank) {
		this.ndGeolocationpropId = ndGeolocationpropId;
		this.ndGeolocation = ndGeolocation;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public NdGeolocationprop(int ndGeolocationpropId,
			NdGeolocation ndGeolocation, Cvterm cvterm, String value, int rank) {
		this.ndGeolocationpropId = ndGeolocationpropId;
		this.ndGeolocation = ndGeolocation;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getNdGeolocationpropId() {
		return this.ndGeolocationpropId;
	}

	public void setNdGeolocationpropId(int ndGeolocationpropId) {
		this.ndGeolocationpropId = ndGeolocationpropId;
	}

	public NdGeolocation getNdGeolocation() {
		return this.ndGeolocation;
	}

	public void setNdGeolocation(NdGeolocation ndGeolocation) {
		this.ndGeolocation = ndGeolocation;
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
