package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Project generated by hbm2java
 */
public class Project implements java.io.Serializable {

	private int projectId;
	private String name;
	private String description;
	private Set projectRelationshipsForSubjectProjectId = new HashSet(0);
	private Set projectPubs = new HashSet(0);
	private Set assayProjects = new HashSet(0);
	private Set ndExperimentProjects = new HashSet(0);
	private Set projectContacts = new HashSet(0);
	private Set projectprops = new HashSet(0);
	private Set projectRelationshipsForObjectProjectId = new HashSet(0);

	public Project() {
	}

	public Project(int projectId, String name, String description) {
		this.projectId = projectId;
		this.name = name;
		this.description = description;
	}

	public Project(int projectId, String name, String description,
			Set projectRelationshipsForSubjectProjectId, Set projectPubs,
			Set assayProjects, Set ndExperimentProjects, Set projectContacts,
			Set projectprops, Set projectRelationshipsForObjectProjectId) {
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.projectRelationshipsForSubjectProjectId = projectRelationshipsForSubjectProjectId;
		this.projectPubs = projectPubs;
		this.assayProjects = assayProjects;
		this.ndExperimentProjects = ndExperimentProjects;
		this.projectContacts = projectContacts;
		this.projectprops = projectprops;
		this.projectRelationshipsForObjectProjectId = projectRelationshipsForObjectProjectId;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
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

	public Set getProjectRelationshipsForSubjectProjectId() {
		return this.projectRelationshipsForSubjectProjectId;
	}

	public void setProjectRelationshipsForSubjectProjectId(
			Set projectRelationshipsForSubjectProjectId) {
		this.projectRelationshipsForSubjectProjectId = projectRelationshipsForSubjectProjectId;
	}

	public Set getProjectPubs() {
		return this.projectPubs;
	}

	public void setProjectPubs(Set projectPubs) {
		this.projectPubs = projectPubs;
	}

	public Set getAssayProjects() {
		return this.assayProjects;
	}

	public void setAssayProjects(Set assayProjects) {
		this.assayProjects = assayProjects;
	}

	public Set getNdExperimentProjects() {
		return this.ndExperimentProjects;
	}

	public void setNdExperimentProjects(Set ndExperimentProjects) {
		this.ndExperimentProjects = ndExperimentProjects;
	}

	public Set getProjectContacts() {
		return this.projectContacts;
	}

	public void setProjectContacts(Set projectContacts) {
		this.projectContacts = projectContacts;
	}

	public Set getProjectprops() {
		return this.projectprops;
	}

	public void setProjectprops(Set projectprops) {
		this.projectprops = projectprops;
	}

	public Set getProjectRelationshipsForObjectProjectId() {
		return this.projectRelationshipsForObjectProjectId;
	}

	public void setProjectRelationshipsForObjectProjectId(
			Set projectRelationshipsForObjectProjectId) {
		this.projectRelationshipsForObjectProjectId = projectRelationshipsForObjectProjectId;
	}

}
