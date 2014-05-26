package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Studyfactor generated by hbm2java
 */
public class Studyfactor implements java.io.Serializable {

	private int studyfactorId;
	private Studydesign studydesign;
	private Cvterm cvterm;
	private String name;
	private String description;
	private Set studyfactorvalues = new HashSet(0);

	public Studyfactor() {
	}

	public Studyfactor(int studyfactorId, Studydesign studydesign, String name) {
		this.studyfactorId = studyfactorId;
		this.studydesign = studydesign;
		this.name = name;
	}

	public Studyfactor(int studyfactorId, Studydesign studydesign,
			Cvterm cvterm, String name, String description,
			Set studyfactorvalues) {
		this.studyfactorId = studyfactorId;
		this.studydesign = studydesign;
		this.cvterm = cvterm;
		this.name = name;
		this.description = description;
		this.studyfactorvalues = studyfactorvalues;
	}

	public int getStudyfactorId() {
		return this.studyfactorId;
	}

	public void setStudyfactorId(int studyfactorId) {
		this.studyfactorId = studyfactorId;
	}

	public Studydesign getStudydesign() {
		return this.studydesign;
	}

	public void setStudydesign(Studydesign studydesign) {
		this.studydesign = studydesign;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getStudyfactorvalues() {
		return this.studyfactorvalues;
	}

	public void setStudyfactorvalues(Set studyfactorvalues) {
		this.studyfactorvalues = studyfactorvalues;
	}

}