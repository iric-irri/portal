package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Genotype generated by hbm2java
 */
public class Genotype implements java.io.Serializable {

	private int genotypeId;
	private Cvterm cvterm;
	private String name;
	private String uniquename;
	private String description;
	private Set phenotypeComparisonsForGenotype1Id = new HashSet(0);
	private Set genotypeprops = new HashSet(0);
	private Set featureGenotypes = new HashSet(0);
	private Set stockGenotypes = new HashSet(0);
	private Set phenotypeComparisonsForGenotype2Id = new HashSet(0);
	private Set phenstatements = new HashSet(0);
	private Set phendescs = new HashSet(0);
	private Set ndExperimentGenotypes = new HashSet(0);

	public Genotype() {
	}

	public Genotype(int genotypeId, Cvterm cvterm, String uniquename) {
		this.genotypeId = genotypeId;
		this.cvterm = cvterm;
		this.uniquename = uniquename;
	}

	public Genotype(int genotypeId, Cvterm cvterm, String name,
			String uniquename, String description,
			Set phenotypeComparisonsForGenotype1Id, Set genotypeprops,
			Set featureGenotypes, Set stockGenotypes,
			Set phenotypeComparisonsForGenotype2Id, Set phenstatements,
			Set phendescs, Set ndExperimentGenotypes) {
		this.genotypeId = genotypeId;
		this.cvterm = cvterm;
		this.name = name;
		this.uniquename = uniquename;
		this.description = description;
		this.phenotypeComparisonsForGenotype1Id = phenotypeComparisonsForGenotype1Id;
		this.genotypeprops = genotypeprops;
		this.featureGenotypes = featureGenotypes;
		this.stockGenotypes = stockGenotypes;
		this.phenotypeComparisonsForGenotype2Id = phenotypeComparisonsForGenotype2Id;
		this.phenstatements = phenstatements;
		this.phendescs = phendescs;
		this.ndExperimentGenotypes = ndExperimentGenotypes;
	}

	public int getGenotypeId() {
		return this.genotypeId;
	}

	public void setGenotypeId(int genotypeId) {
		this.genotypeId = genotypeId;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniquename() {
		return this.uniquename;
	}

	public void setUniquename(String uniquename) {
		this.uniquename = uniquename;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getPhenotypeComparisonsForGenotype1Id() {
		return this.phenotypeComparisonsForGenotype1Id;
	}

	public void setPhenotypeComparisonsForGenotype1Id(
			Set phenotypeComparisonsForGenotype1Id) {
		this.phenotypeComparisonsForGenotype1Id = phenotypeComparisonsForGenotype1Id;
	}

	public Set getGenotypeprops() {
		return this.genotypeprops;
	}

	public void setGenotypeprops(Set genotypeprops) {
		this.genotypeprops = genotypeprops;
	}

	public Set getFeatureGenotypes() {
		return this.featureGenotypes;
	}

	public void setFeatureGenotypes(Set featureGenotypes) {
		this.featureGenotypes = featureGenotypes;
	}

	public Set getStockGenotypes() {
		return this.stockGenotypes;
	}

	public void setStockGenotypes(Set stockGenotypes) {
		this.stockGenotypes = stockGenotypes;
	}

	public Set getPhenotypeComparisonsForGenotype2Id() {
		return this.phenotypeComparisonsForGenotype2Id;
	}

	public void setPhenotypeComparisonsForGenotype2Id(
			Set phenotypeComparisonsForGenotype2Id) {
		this.phenotypeComparisonsForGenotype2Id = phenotypeComparisonsForGenotype2Id;
	}

	public Set getPhenstatements() {
		return this.phenstatements;
	}

	public void setPhenstatements(Set phenstatements) {
		this.phenstatements = phenstatements;
	}

	public Set getPhendescs() {
		return this.phendescs;
	}

	public void setPhendescs(Set phendescs) {
		this.phendescs = phendescs;
	}

	public Set getNdExperimentGenotypes() {
		return this.ndExperimentGenotypes;
	}

	public void setNdExperimentGenotypes(Set ndExperimentGenotypes) {
		this.ndExperimentGenotypes = ndExperimentGenotypes;
	}

}