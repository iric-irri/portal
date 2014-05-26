package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * NdExperiment generated by hbm2java
 */
public class NdExperiment implements java.io.Serializable {

	private int ndExperimentId;
	private NdGeolocation ndGeolocation;
	private Cvterm cvterm;
	private Set ndExperimentProjects = new HashSet(0);
	private Set ndExperimentGenotypes = new HashSet(0);
	private Set ndExperimentPhenotypes = new HashSet(0);
	private Set ndExperimentStocks = new HashSet(0);
	private Set ndExperimentPubs = new HashSet(0);
	private Set ndExperimentProtocols = new HashSet(0);
	private Set ndExperimentprops = new HashSet(0);
	private Set ndExperimentContacts = new HashSet(0);
	private Set ndExperimentDbxrefs = new HashSet(0);

	public NdExperiment() {
	}

	public NdExperiment(int ndExperimentId, NdGeolocation ndGeolocation,
			Cvterm cvterm) {
		this.ndExperimentId = ndExperimentId;
		this.ndGeolocation = ndGeolocation;
		this.cvterm = cvterm;
	}

	public NdExperiment(int ndExperimentId, NdGeolocation ndGeolocation,
			Cvterm cvterm, Set ndExperimentProjects, Set ndExperimentGenotypes,
			Set ndExperimentPhenotypes, Set ndExperimentStocks,
			Set ndExperimentPubs, Set ndExperimentProtocols,
			Set ndExperimentprops, Set ndExperimentContacts,
			Set ndExperimentDbxrefs) {
		this.ndExperimentId = ndExperimentId;
		this.ndGeolocation = ndGeolocation;
		this.cvterm = cvterm;
		this.ndExperimentProjects = ndExperimentProjects;
		this.ndExperimentGenotypes = ndExperimentGenotypes;
		this.ndExperimentPhenotypes = ndExperimentPhenotypes;
		this.ndExperimentStocks = ndExperimentStocks;
		this.ndExperimentPubs = ndExperimentPubs;
		this.ndExperimentProtocols = ndExperimentProtocols;
		this.ndExperimentprops = ndExperimentprops;
		this.ndExperimentContacts = ndExperimentContacts;
		this.ndExperimentDbxrefs = ndExperimentDbxrefs;
	}

	public int getNdExperimentId() {
		return this.ndExperimentId;
	}

	public void setNdExperimentId(int ndExperimentId) {
		this.ndExperimentId = ndExperimentId;
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

	public Set getNdExperimentProjects() {
		return this.ndExperimentProjects;
	}

	public void setNdExperimentProjects(Set ndExperimentProjects) {
		this.ndExperimentProjects = ndExperimentProjects;
	}

	public Set getNdExperimentGenotypes() {
		return this.ndExperimentGenotypes;
	}

	public void setNdExperimentGenotypes(Set ndExperimentGenotypes) {
		this.ndExperimentGenotypes = ndExperimentGenotypes;
	}

	public Set getNdExperimentPhenotypes() {
		return this.ndExperimentPhenotypes;
	}

	public void setNdExperimentPhenotypes(Set ndExperimentPhenotypes) {
		this.ndExperimentPhenotypes = ndExperimentPhenotypes;
	}

	public Set getNdExperimentStocks() {
		return this.ndExperimentStocks;
	}

	public void setNdExperimentStocks(Set ndExperimentStocks) {
		this.ndExperimentStocks = ndExperimentStocks;
	}

	public Set getNdExperimentPubs() {
		return this.ndExperimentPubs;
	}

	public void setNdExperimentPubs(Set ndExperimentPubs) {
		this.ndExperimentPubs = ndExperimentPubs;
	}

	public Set getNdExperimentProtocols() {
		return this.ndExperimentProtocols;
	}

	public void setNdExperimentProtocols(Set ndExperimentProtocols) {
		this.ndExperimentProtocols = ndExperimentProtocols;
	}

	public Set getNdExperimentprops() {
		return this.ndExperimentprops;
	}

	public void setNdExperimentprops(Set ndExperimentprops) {
		this.ndExperimentprops = ndExperimentprops;
	}

	public Set getNdExperimentContacts() {
		return this.ndExperimentContacts;
	}

	public void setNdExperimentContacts(Set ndExperimentContacts) {
		this.ndExperimentContacts = ndExperimentContacts;
	}

	public Set getNdExperimentDbxrefs() {
		return this.ndExperimentDbxrefs;
	}

	public void setNdExperimentDbxrefs(Set ndExperimentDbxrefs) {
		this.ndExperimentDbxrefs = ndExperimentDbxrefs;
	}

}
