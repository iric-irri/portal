package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * PubRelationship generated by hbm2java
 */
public class PubRelationship implements java.io.Serializable {

	private int pubRelationshipId;
	private Pub pubByObjectId;
	private Pub pubBySubjectId;
	private Cvterm cvterm;

	public PubRelationship() {
	}

	public PubRelationship(int pubRelationshipId, Pub pubByObjectId,
			Pub pubBySubjectId, Cvterm cvterm) {
		this.pubRelationshipId = pubRelationshipId;
		this.pubByObjectId = pubByObjectId;
		this.pubBySubjectId = pubBySubjectId;
		this.cvterm = cvterm;
	}

	public int getPubRelationshipId() {
		return this.pubRelationshipId;
	}

	public void setPubRelationshipId(int pubRelationshipId) {
		this.pubRelationshipId = pubRelationshipId;
	}

	public Pub getPubByObjectId() {
		return this.pubByObjectId;
	}

	public void setPubByObjectId(Pub pubByObjectId) {
		this.pubByObjectId = pubByObjectId;
	}

	public Pub getPubBySubjectId() {
		return this.pubBySubjectId;
	}

	public void setPubBySubjectId(Pub pubBySubjectId) {
		this.pubBySubjectId = pubBySubjectId;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

}
