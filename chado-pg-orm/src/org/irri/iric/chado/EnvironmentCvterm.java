package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * EnvironmentCvterm generated by hbm2java
 */
public class EnvironmentCvterm implements java.io.Serializable {

	private int environmentCvtermId;
	private Environment environment;
	private Cvterm cvterm;

	public EnvironmentCvterm() {
	}

	public EnvironmentCvterm(int environmentCvtermId, Environment environment,
			Cvterm cvterm) {
		this.environmentCvtermId = environmentCvtermId;
		this.environment = environment;
		this.cvterm = cvterm;
	}

	public int getEnvironmentCvtermId() {
		return this.environmentCvtermId;
	}

	public void setEnvironmentCvtermId(int environmentCvtermId) {
		this.environmentCvtermId = environmentCvtermId;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

}
