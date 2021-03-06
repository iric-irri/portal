package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureRelationship generated by hbm2java
 */
public class FeatureRelationship implements java.io.Serializable {

	private int featureRelationshipId;
	private Feature featureByObjectId;
	private Feature featureBySubjectId;
	private Cvterm cvterm;
	private String value;
	private int rank;
	private Set featureRelationshipprops = new HashSet(0);
	private Set featureRelationshipPubs = new HashSet(0);

	public FeatureRelationship() {
	}

	public FeatureRelationship(int featureRelationshipId,
			Feature featureByObjectId, Feature featureBySubjectId,
			Cvterm cvterm, int rank) {
		this.featureRelationshipId = featureRelationshipId;
		this.featureByObjectId = featureByObjectId;
		this.featureBySubjectId = featureBySubjectId;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public FeatureRelationship(int featureRelationshipId,
			Feature featureByObjectId, Feature featureBySubjectId,
			Cvterm cvterm, String value, int rank,
			Set featureRelationshipprops, Set featureRelationshipPubs) {
		this.featureRelationshipId = featureRelationshipId;
		this.featureByObjectId = featureByObjectId;
		this.featureBySubjectId = featureBySubjectId;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
		this.featureRelationshipprops = featureRelationshipprops;
		this.featureRelationshipPubs = featureRelationshipPubs;
	}

	public int getFeatureRelationshipId() {
		return this.featureRelationshipId;
	}

	public void setFeatureRelationshipId(int featureRelationshipId) {
		this.featureRelationshipId = featureRelationshipId;
	}

	public Feature getFeatureByObjectId() {
		return this.featureByObjectId;
	}

	public void setFeatureByObjectId(Feature featureByObjectId) {
		this.featureByObjectId = featureByObjectId;
	}

	public Feature getFeatureBySubjectId() {
		return this.featureBySubjectId;
	}

	public void setFeatureBySubjectId(Feature featureBySubjectId) {
		this.featureBySubjectId = featureBySubjectId;
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

	public Set getFeatureRelationshipprops() {
		return this.featureRelationshipprops;
	}

	public void setFeatureRelationshipprops(Set featureRelationshipprops) {
		this.featureRelationshipprops = featureRelationshipprops;
	}

	public Set getFeatureRelationshipPubs() {
		return this.featureRelationshipPubs;
	}

	public void setFeatureRelationshipPubs(Set featureRelationshipPubs) {
		this.featureRelationshipPubs = featureRelationshipPubs;
	}

}
