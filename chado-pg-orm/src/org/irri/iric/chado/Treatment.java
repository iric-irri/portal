package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Treatment generated by hbm2java
 */
public class Treatment implements java.io.Serializable {

	private int treatmentId;
	private Biomaterial biomaterial;
	private Protocol protocol;
	private Cvterm cvterm;
	private int rank;
	private String name;
	private Set biomaterialTreatments = new HashSet(0);

	public Treatment() {
	}

	public Treatment(int treatmentId, Biomaterial biomaterial, Cvterm cvterm,
			int rank) {
		this.treatmentId = treatmentId;
		this.biomaterial = biomaterial;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public Treatment(int treatmentId, Biomaterial biomaterial,
			Protocol protocol, Cvterm cvterm, int rank, String name,
			Set biomaterialTreatments) {
		this.treatmentId = treatmentId;
		this.biomaterial = biomaterial;
		this.protocol = protocol;
		this.cvterm = cvterm;
		this.rank = rank;
		this.name = name;
		this.biomaterialTreatments = biomaterialTreatments;
	}

	public int getTreatmentId() {
		return this.treatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Biomaterial getBiomaterial() {
		return this.biomaterial;
	}

	public void setBiomaterial(Biomaterial biomaterial) {
		this.biomaterial = biomaterial;
	}

	public Protocol getProtocol() {
		return this.protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBiomaterialTreatments() {
		return this.biomaterialTreatments;
	}

	public void setBiomaterialTreatments(Set biomaterialTreatments) {
		this.biomaterialTreatments = biomaterialTreatments;
	}

}
