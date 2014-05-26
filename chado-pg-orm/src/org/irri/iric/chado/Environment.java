package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Environment generated by hbm2java
 */
public class Environment implements java.io.Serializable {

	private int environmentId;
	private String uniquename;
	private String description;
	private Set phenotypeComparisonsForEnvironment1Id = new HashSet(0);
	private Set phendescs = new HashSet(0);
	private Set phenotypeComparisonsForEnvironment2Id = new HashSet(0);
	private Set phenstatements = new HashSet(0);
	private Set environmentCvterms = new HashSet(0);

	public Environment() {
	}

	public Environment(int environmentId, String uniquename) {
		this.environmentId = environmentId;
		this.uniquename = uniquename;
	}

	public Environment(int environmentId, String uniquename,
			String description, Set phenotypeComparisonsForEnvironment1Id,
			Set phendescs, Set phenotypeComparisonsForEnvironment2Id,
			Set phenstatements, Set environmentCvterms) {
		this.environmentId = environmentId;
		this.uniquename = uniquename;
		this.description = description;
		this.phenotypeComparisonsForEnvironment1Id = phenotypeComparisonsForEnvironment1Id;
		this.phendescs = phendescs;
		this.phenotypeComparisonsForEnvironment2Id = phenotypeComparisonsForEnvironment2Id;
		this.phenstatements = phenstatements;
		this.environmentCvterms = environmentCvterms;
	}

	public int getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(int environmentId) {
		this.environmentId = environmentId;
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

	public Set getPhenotypeComparisonsForEnvironment1Id() {
		return this.phenotypeComparisonsForEnvironment1Id;
	}

	public void setPhenotypeComparisonsForEnvironment1Id(
			Set phenotypeComparisonsForEnvironment1Id) {
		this.phenotypeComparisonsForEnvironment1Id = phenotypeComparisonsForEnvironment1Id;
	}

	public Set getPhendescs() {
		return this.phendescs;
	}

	public void setPhendescs(Set phendescs) {
		this.phendescs = phendescs;
	}

	public Set getPhenotypeComparisonsForEnvironment2Id() {
		return this.phenotypeComparisonsForEnvironment2Id;
	}

	public void setPhenotypeComparisonsForEnvironment2Id(
			Set phenotypeComparisonsForEnvironment2Id) {
		this.phenotypeComparisonsForEnvironment2Id = phenotypeComparisonsForEnvironment2Id;
	}

	public Set getPhenstatements() {
		return this.phenstatements;
	}

	public void setPhenstatements(Set phenstatements) {
		this.phenstatements = phenstatements;
	}

	public Set getEnvironmentCvterms() {
		return this.environmentCvterms;
	}

	public void setEnvironmentCvterms(Set environmentCvterms) {
		this.environmentCvterms = environmentCvterms;
	}

}
