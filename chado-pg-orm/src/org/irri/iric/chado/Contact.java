package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Contact generated by hbm2java
 */
public class Contact implements java.io.Serializable {

	private int contactId;
	private Cvterm cvterm;
	private String name;
	private String description;
	private Set quantifications = new HashSet(0);
	private Set assays = new HashSet(0);
	private Set arraydesigns = new HashSet(0);
	private Set projectContacts = new HashSet(0);
	private Set contactRelationshipsForObjectId = new HashSet(0);
	private Set studies = new HashSet(0);
	private Set stockcollections = new HashSet(0);
	private Set ndExperimentContacts = new HashSet(0);
	private Set biomaterials = new HashSet(0);
	private Set contactRelationshipsForSubjectId = new HashSet(0);

	public Contact() {
	}

	public Contact(int contactId, String name) {
		this.contactId = contactId;
		this.name = name;
	}

	public Contact(int contactId, Cvterm cvterm, String name,
			String description, Set quantifications, Set assays,
			Set arraydesigns, Set projectContacts,
			Set contactRelationshipsForObjectId, Set studies,
			Set stockcollections, Set ndExperimentContacts, Set biomaterials,
			Set contactRelationshipsForSubjectId) {
		this.contactId = contactId;
		this.cvterm = cvterm;
		this.name = name;
		this.description = description;
		this.quantifications = quantifications;
		this.assays = assays;
		this.arraydesigns = arraydesigns;
		this.projectContacts = projectContacts;
		this.contactRelationshipsForObjectId = contactRelationshipsForObjectId;
		this.studies = studies;
		this.stockcollections = stockcollections;
		this.ndExperimentContacts = ndExperimentContacts;
		this.biomaterials = biomaterials;
		this.contactRelationshipsForSubjectId = contactRelationshipsForSubjectId;
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
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

	public Set getQuantifications() {
		return this.quantifications;
	}

	public void setQuantifications(Set quantifications) {
		this.quantifications = quantifications;
	}

	public Set getAssays() {
		return this.assays;
	}

	public void setAssays(Set assays) {
		this.assays = assays;
	}

	public Set getArraydesigns() {
		return this.arraydesigns;
	}

	public void setArraydesigns(Set arraydesigns) {
		this.arraydesigns = arraydesigns;
	}

	public Set getProjectContacts() {
		return this.projectContacts;
	}

	public void setProjectContacts(Set projectContacts) {
		this.projectContacts = projectContacts;
	}

	public Set getContactRelationshipsForObjectId() {
		return this.contactRelationshipsForObjectId;
	}

	public void setContactRelationshipsForObjectId(
			Set contactRelationshipsForObjectId) {
		this.contactRelationshipsForObjectId = contactRelationshipsForObjectId;
	}

	public Set getStudies() {
		return this.studies;
	}

	public void setStudies(Set studies) {
		this.studies = studies;
	}

	public Set getStockcollections() {
		return this.stockcollections;
	}

	public void setStockcollections(Set stockcollections) {
		this.stockcollections = stockcollections;
	}

	public Set getNdExperimentContacts() {
		return this.ndExperimentContacts;
	}

	public void setNdExperimentContacts(Set ndExperimentContacts) {
		this.ndExperimentContacts = ndExperimentContacts;
	}

	public Set getBiomaterials() {
		return this.biomaterials;
	}

	public void setBiomaterials(Set biomaterials) {
		this.biomaterials = biomaterials;
	}

	public Set getContactRelationshipsForSubjectId() {
		return this.contactRelationshipsForSubjectId;
	}

	public void setContactRelationshipsForSubjectId(
			Set contactRelationshipsForSubjectId) {
		this.contactRelationshipsForSubjectId = contactRelationshipsForSubjectId;
	}

}