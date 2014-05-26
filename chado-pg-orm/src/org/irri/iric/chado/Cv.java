package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Cv generated by hbm2java
 */
public class Cv implements java.io.Serializable {

	private int cvId;
	private String name;
	private String definition;
	private Set cvterms = new HashSet(0);
	private Set cvprops = new HashSet(0);
	private Set cvtermpaths = new HashSet(0);

	public Cv() {
	}

	public Cv(int cvId, String name) {
		this.cvId = cvId;
		this.name = name;
	}

	public Cv(int cvId, String name, String definition, Set cvterms,
			Set cvprops, Set cvtermpaths) {
		this.cvId = cvId;
		this.name = name;
		this.definition = definition;
		this.cvterms = cvterms;
		this.cvprops = cvprops;
		this.cvtermpaths = cvtermpaths;
	}

	public int getCvId() {
		return this.cvId;
	}

	public void setCvId(int cvId) {
		this.cvId = cvId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Set getCvterms() {
		return this.cvterms;
	}

	public void setCvterms(Set cvterms) {
		this.cvterms = cvterms;
	}

	public Set getCvprops() {
		return this.cvprops;
	}

	public void setCvprops(Set cvprops) {
		this.cvprops = cvprops;
	}

	public Set getCvtermpaths() {
		return this.cvtermpaths;
	}

	public void setCvtermpaths(Set cvtermpaths) {
		this.cvtermpaths = cvtermpaths;
	}

}
