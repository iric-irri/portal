package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Studyprop generated by hbm2java
 */
public class Studyprop implements java.io.Serializable {

	private int studypropId;
	private Study study;
	private Cvterm cvterm;
	private String value;
	private int rank;
	private Set studypropFeatures = new HashSet(0);

	public Studyprop() {
	}

	public Studyprop(int studypropId, Study study, Cvterm cvterm, int rank) {
		this.studypropId = studypropId;
		this.study = study;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public Studyprop(int studypropId, Study study, Cvterm cvterm, String value,
			int rank, Set studypropFeatures) {
		this.studypropId = studypropId;
		this.study = study;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
		this.studypropFeatures = studypropFeatures;
	}

	public int getStudypropId() {
		return this.studypropId;
	}

	public void setStudypropId(int studypropId) {
		this.studypropId = studypropId;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
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

	public Set getStudypropFeatures() {
		return this.studypropFeatures;
	}

	public void setStudypropFeatures(Set studypropFeatures) {
		this.studypropFeatures = studypropFeatures;
	}

}