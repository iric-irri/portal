package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * NdReagent generated by hbm2java
 */
public class NdReagent implements java.io.Serializable {

	private int ndReagentId;
	private Cvterm cvterm;
	private String name;
	private Integer featureId;
	private Set ndProtocolReagents = new HashSet(0);
	private Set ndReagentRelationshipsForObjectReagentId = new HashSet(0);
	private Set ndReagentprops = new HashSet(0);
	private Set ndReagentRelationshipsForSubjectReagentId = new HashSet(0);

	public NdReagent() {
	}

	public NdReagent(int ndReagentId, Cvterm cvterm, String name) {
		this.ndReagentId = ndReagentId;
		this.cvterm = cvterm;
		this.name = name;
	}

	public NdReagent(int ndReagentId, Cvterm cvterm, String name,
			Integer featureId, Set ndProtocolReagents,
			Set ndReagentRelationshipsForObjectReagentId, Set ndReagentprops,
			Set ndReagentRelationshipsForSubjectReagentId) {
		this.ndReagentId = ndReagentId;
		this.cvterm = cvterm;
		this.name = name;
		this.featureId = featureId;
		this.ndProtocolReagents = ndProtocolReagents;
		this.ndReagentRelationshipsForObjectReagentId = ndReagentRelationshipsForObjectReagentId;
		this.ndReagentprops = ndReagentprops;
		this.ndReagentRelationshipsForSubjectReagentId = ndReagentRelationshipsForSubjectReagentId;
	}

	public int getNdReagentId() {
		return this.ndReagentId;
	}

	public void setNdReagentId(int ndReagentId) {
		this.ndReagentId = ndReagentId;
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

	public Integer getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
	}

	public Set getNdProtocolReagents() {
		return this.ndProtocolReagents;
	}

	public void setNdProtocolReagents(Set ndProtocolReagents) {
		this.ndProtocolReagents = ndProtocolReagents;
	}

	public Set getNdReagentRelationshipsForObjectReagentId() {
		return this.ndReagentRelationshipsForObjectReagentId;
	}

	public void setNdReagentRelationshipsForObjectReagentId(
			Set ndReagentRelationshipsForObjectReagentId) {
		this.ndReagentRelationshipsForObjectReagentId = ndReagentRelationshipsForObjectReagentId;
	}

	public Set getNdReagentprops() {
		return this.ndReagentprops;
	}

	public void setNdReagentprops(Set ndReagentprops) {
		this.ndReagentprops = ndReagentprops;
	}

	public Set getNdReagentRelationshipsForSubjectReagentId() {
		return this.ndReagentRelationshipsForSubjectReagentId;
	}

	public void setNdReagentRelationshipsForSubjectReagentId(
			Set ndReagentRelationshipsForSubjectReagentId) {
		this.ndReagentRelationshipsForSubjectReagentId = ndReagentRelationshipsForSubjectReagentId;
	}

}
