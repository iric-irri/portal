package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Phenstatement generated by hbm2java
 */
public class Phenstatement implements java.io.Serializable {

	private int phenstatementId;
	private Pub pub;
	private Environment environment;
	private Genotype genotype;
	private Phenotype phenotype;
	private Cvterm cvterm;

	public Phenstatement() {
	}

	public Phenstatement(int phenstatementId, Pub pub, Environment environment,
			Genotype genotype, Phenotype phenotype, Cvterm cvterm) {
		this.phenstatementId = phenstatementId;
		this.pub = pub;
		this.environment = environment;
		this.genotype = genotype;
		this.phenotype = phenotype;
		this.cvterm = cvterm;
	}

	public int getPhenstatementId() {
		return this.phenstatementId;
	}

	public void setPhenstatementId(int phenstatementId) {
		this.phenstatementId = phenstatementId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Genotype getGenotype() {
		return this.genotype;
	}

	public void setGenotype(Genotype genotype) {
		this.genotype = genotype;
	}

	public Phenotype getPhenotype() {
		return this.phenotype;
	}

	public void setPhenotype(Phenotype phenotype) {
		this.phenotype = phenotype;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

}
