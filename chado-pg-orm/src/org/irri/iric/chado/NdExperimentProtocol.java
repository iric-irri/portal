package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * NdExperimentProtocol generated by hbm2java
 */
public class NdExperimentProtocol implements java.io.Serializable {

	private int ndExperimentProtocolId;
	private NdProtocol ndProtocol;
	private NdExperiment ndExperiment;

	public NdExperimentProtocol() {
	}

	public NdExperimentProtocol(int ndExperimentProtocolId,
			NdProtocol ndProtocol, NdExperiment ndExperiment) {
		this.ndExperimentProtocolId = ndExperimentProtocolId;
		this.ndProtocol = ndProtocol;
		this.ndExperiment = ndExperiment;
	}

	public int getNdExperimentProtocolId() {
		return this.ndExperimentProtocolId;
	}

	public void setNdExperimentProtocolId(int ndExperimentProtocolId) {
		this.ndExperimentProtocolId = ndExperimentProtocolId;
	}

	public NdProtocol getNdProtocol() {
		return this.ndProtocol;
	}

	public void setNdProtocol(NdProtocol ndProtocol) {
		this.ndProtocol = ndProtocol;
	}

	public NdExperiment getNdExperiment() {
		return this.ndExperiment;
	}

	public void setNdExperiment(NdExperiment ndExperiment) {
		this.ndExperiment = ndExperiment;
	}

}
