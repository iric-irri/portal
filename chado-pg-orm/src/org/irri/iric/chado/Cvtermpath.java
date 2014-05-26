package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Cvtermpath generated by hbm2java
 */
public class Cvtermpath implements java.io.Serializable {

	private int cvtermpathId;
	private Cvterm cvtermBySubjectId;
	private Cvterm cvtermByObjectId;
	private Cv cv;
	private Cvterm cvtermByTypeId;
	private Integer pathdistance;

	public Cvtermpath() {
	}

	public Cvtermpath(int cvtermpathId, Cvterm cvtermBySubjectId,
			Cvterm cvtermByObjectId, Cv cv) {
		this.cvtermpathId = cvtermpathId;
		this.cvtermBySubjectId = cvtermBySubjectId;
		this.cvtermByObjectId = cvtermByObjectId;
		this.cv = cv;
	}

	public Cvtermpath(int cvtermpathId, Cvterm cvtermBySubjectId,
			Cvterm cvtermByObjectId, Cv cv, Cvterm cvtermByTypeId,
			Integer pathdistance) {
		this.cvtermpathId = cvtermpathId;
		this.cvtermBySubjectId = cvtermBySubjectId;
		this.cvtermByObjectId = cvtermByObjectId;
		this.cv = cv;
		this.cvtermByTypeId = cvtermByTypeId;
		this.pathdistance = pathdistance;
	}

	public int getCvtermpathId() {
		return this.cvtermpathId;
	}

	public void setCvtermpathId(int cvtermpathId) {
		this.cvtermpathId = cvtermpathId;
	}

	public Cvterm getCvtermBySubjectId() {
		return this.cvtermBySubjectId;
	}

	public void setCvtermBySubjectId(Cvterm cvtermBySubjectId) {
		this.cvtermBySubjectId = cvtermBySubjectId;
	}

	public Cvterm getCvtermByObjectId() {
		return this.cvtermByObjectId;
	}

	public void setCvtermByObjectId(Cvterm cvtermByObjectId) {
		this.cvtermByObjectId = cvtermByObjectId;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	public Cvterm getCvtermByTypeId() {
		return this.cvtermByTypeId;
	}

	public void setCvtermByTypeId(Cvterm cvtermByTypeId) {
		this.cvtermByTypeId = cvtermByTypeId;
	}

	public Integer getPathdistance() {
		return this.pathdistance;
	}

	public void setPathdistance(Integer pathdistance) {
		this.pathdistance = pathdistance;
	}

}