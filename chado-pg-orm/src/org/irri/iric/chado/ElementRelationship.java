package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * ElementRelationship generated by hbm2java
 */
public class ElementRelationship implements java.io.Serializable {

	private int elementRelationshipId;
	private Element elementByObjectId;
	private Element elementBySubjectId;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public ElementRelationship() {
	}

	public ElementRelationship(int elementRelationshipId,
			Element elementByObjectId, Element elementBySubjectId,
			Cvterm cvterm, int rank) {
		this.elementRelationshipId = elementRelationshipId;
		this.elementByObjectId = elementByObjectId;
		this.elementBySubjectId = elementBySubjectId;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public ElementRelationship(int elementRelationshipId,
			Element elementByObjectId, Element elementBySubjectId,
			Cvterm cvterm, String value, int rank) {
		this.elementRelationshipId = elementRelationshipId;
		this.elementByObjectId = elementByObjectId;
		this.elementBySubjectId = elementBySubjectId;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getElementRelationshipId() {
		return this.elementRelationshipId;
	}

	public void setElementRelationshipId(int elementRelationshipId) {
		this.elementRelationshipId = elementRelationshipId;
	}

	public Element getElementByObjectId() {
		return this.elementByObjectId;
	}

	public void setElementByObjectId(Element elementByObjectId) {
		this.elementByObjectId = elementByObjectId;
	}

	public Element getElementBySubjectId() {
		return this.elementBySubjectId;
	}

	public void setElementBySubjectId(Element elementBySubjectId) {
		this.elementBySubjectId = elementBySubjectId;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
