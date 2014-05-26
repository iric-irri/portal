package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * PhenotypeComparison generated by hbm2java
 */
public class PhenotypeComparison implements java.io.Serializable {

	private int phenotypeComparisonId;
	private Pub pub;
	private Environment environmentByEnvironment2Id;
	private Environment environmentByEnvironment1Id;
	private Genotype genotypeByGenotype1Id;
	private Organism organism;
	private Phenotype phenotypeByPhenotype2Id;
	private Phenotype phenotypeByPhenotype1Id;
	private Genotype genotypeByGenotype2Id;
	private Set phenotypeComparisonCvterms = new HashSet(0);

	public PhenotypeComparison() {
	}

	public PhenotypeComparison(int phenotypeComparisonId, Pub pub,
			Environment environmentByEnvironment2Id,
			Environment environmentByEnvironment1Id,
			Genotype genotypeByGenotype1Id, Organism organism,
			Phenotype phenotypeByPhenotype1Id, Genotype genotypeByGenotype2Id) {
		this.phenotypeComparisonId = phenotypeComparisonId;
		this.pub = pub;
		this.environmentByEnvironment2Id = environmentByEnvironment2Id;
		this.environmentByEnvironment1Id = environmentByEnvironment1Id;
		this.genotypeByGenotype1Id = genotypeByGenotype1Id;
		this.organism = organism;
		this.phenotypeByPhenotype1Id = phenotypeByPhenotype1Id;
		this.genotypeByGenotype2Id = genotypeByGenotype2Id;
	}

	public PhenotypeComparison(int phenotypeComparisonId, Pub pub,
			Environment environmentByEnvironment2Id,
			Environment environmentByEnvironment1Id,
			Genotype genotypeByGenotype1Id, Organism organism,
			Phenotype phenotypeByPhenotype2Id,
			Phenotype phenotypeByPhenotype1Id, Genotype genotypeByGenotype2Id,
			Set phenotypeComparisonCvterms) {
		this.phenotypeComparisonId = phenotypeComparisonId;
		this.pub = pub;
		this.environmentByEnvironment2Id = environmentByEnvironment2Id;
		this.environmentByEnvironment1Id = environmentByEnvironment1Id;
		this.genotypeByGenotype1Id = genotypeByGenotype1Id;
		this.organism = organism;
		this.phenotypeByPhenotype2Id = phenotypeByPhenotype2Id;
		this.phenotypeByPhenotype1Id = phenotypeByPhenotype1Id;
		this.genotypeByGenotype2Id = genotypeByGenotype2Id;
		this.phenotypeComparisonCvterms = phenotypeComparisonCvterms;
	}

	public int getPhenotypeComparisonId() {
		return this.phenotypeComparisonId;
	}

	public void setPhenotypeComparisonId(int phenotypeComparisonId) {
		this.phenotypeComparisonId = phenotypeComparisonId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Environment getEnvironmentByEnvironment2Id() {
		return this.environmentByEnvironment2Id;
	}

	public void setEnvironmentByEnvironment2Id(
			Environment environmentByEnvironment2Id) {
		this.environmentByEnvironment2Id = environmentByEnvironment2Id;
	}

	public Environment getEnvironmentByEnvironment1Id() {
		return this.environmentByEnvironment1Id;
	}

	public void setEnvironmentByEnvironment1Id(
			Environment environmentByEnvironment1Id) {
		this.environmentByEnvironment1Id = environmentByEnvironment1Id;
	}

	public Genotype getGenotypeByGenotype1Id() {
		return this.genotypeByGenotype1Id;
	}

	public void setGenotypeByGenotype1Id(Genotype genotypeByGenotype1Id) {
		this.genotypeByGenotype1Id = genotypeByGenotype1Id;
	}

	public Organism getOrganism() {
		return this.organism;
	}

	public void setOrganism(Organism organism) {
		this.organism = organism;
	}

	public Phenotype getPhenotypeByPhenotype2Id() {
		return this.phenotypeByPhenotype2Id;
	}

	public void setPhenotypeByPhenotype2Id(Phenotype phenotypeByPhenotype2Id) {
		this.phenotypeByPhenotype2Id = phenotypeByPhenotype2Id;
	}

	public Phenotype getPhenotypeByPhenotype1Id() {
		return this.phenotypeByPhenotype1Id;
	}

	public void setPhenotypeByPhenotype1Id(Phenotype phenotypeByPhenotype1Id) {
		this.phenotypeByPhenotype1Id = phenotypeByPhenotype1Id;
	}

	public Genotype getGenotypeByGenotype2Id() {
		return this.genotypeByGenotype2Id;
	}

	public void setGenotypeByGenotype2Id(Genotype genotypeByGenotype2Id) {
		this.genotypeByGenotype2Id = genotypeByGenotype2Id;
	}

	public Set getPhenotypeComparisonCvterms() {
		return this.phenotypeComparisonCvterms;
	}

	public void setPhenotypeComparisonCvterms(Set phenotypeComparisonCvterms) {
		this.phenotypeComparisonCvterms = phenotypeComparisonCvterms;
	}

}