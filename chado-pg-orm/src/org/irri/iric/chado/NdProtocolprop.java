package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * NdProtocolprop generated by hbm2java
 */
public class NdProtocolprop implements java.io.Serializable {

	private int ndProtocolpropId;
	private NdProtocol ndProtocol;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public NdProtocolprop() {
	}

	public NdProtocolprop(int ndProtocolpropId, NdProtocol ndProtocol,
			Cvterm cvterm, int rank) {
		this.ndProtocolpropId = ndProtocolpropId;
		this.ndProtocol = ndProtocol;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public NdProtocolprop(int ndProtocolpropId, NdProtocol ndProtocol,
			Cvterm cvterm, String value, int rank) {
		this.ndProtocolpropId = ndProtocolpropId;
		this.ndProtocol = ndProtocol;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getNdProtocolpropId() {
		return this.ndProtocolpropId;
	}

	public void setNdProtocolpropId(int ndProtocolpropId) {
		this.ndProtocolpropId = ndProtocolpropId;
	}

	public NdProtocol getNdProtocol() {
		return this.ndProtocol;
	}

	public void setNdProtocol(NdProtocol ndProtocol) {
		this.ndProtocol = ndProtocol;
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