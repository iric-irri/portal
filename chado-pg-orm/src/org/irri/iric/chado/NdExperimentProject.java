package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * NdExperimentProject generated by hbm2java
 */
public class NdExperimentProject implements java.io.Serializable {

	private int ndExperimentProjectId;
	private Project project;
	private NdExperiment ndExperiment;

	public NdExperimentProject() {
	}

	public NdExperimentProject(int ndExperimentProjectId, Project project,
			NdExperiment ndExperiment) {
		this.ndExperimentProjectId = ndExperimentProjectId;
		this.project = project;
		this.ndExperiment = ndExperiment;
	}

	public int getNdExperimentProjectId() {
		return this.ndExperimentProjectId;
	}

	public void setNdExperimentProjectId(int ndExperimentProjectId) {
		this.ndExperimentProjectId = ndExperimentProjectId;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public NdExperiment getNdExperiment() {
		return this.ndExperiment;
	}

	public void setNdExperiment(NdExperiment ndExperiment) {
		this.ndExperiment = ndExperiment;
	}

}
