package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * ProjectPub generated by hbm2java
 */
public class ProjectPub implements java.io.Serializable {

	private int projectPubId;
	private Pub pub;
	private Project project;

	public ProjectPub() {
	}

	public ProjectPub(int projectPubId, Pub pub, Project project) {
		this.projectPubId = projectPubId;
		this.pub = pub;
		this.project = project;
	}

	public int getProjectPubId() {
		return this.projectPubId;
	}

	public void setProjectPubId(int projectPubId) {
		this.projectPubId = projectPubId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
