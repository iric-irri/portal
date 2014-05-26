package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Featuremap generated by hbm2java
 */
public class Featuremap implements java.io.Serializable {

	private int featuremapId;
	private Cvterm cvterm;
	private String name;
	private String description;
	private Set featureranges = new HashSet(0);
	private Set featureposes = new HashSet(0);
	private Set featuremapPubs = new HashSet(0);

	public Featuremap() {
	}

	public Featuremap(int featuremapId) {
		this.featuremapId = featuremapId;
	}

	public Featuremap(int featuremapId, Cvterm cvterm, String name,
			String description, Set featureranges, Set featureposes,
			Set featuremapPubs) {
		this.featuremapId = featuremapId;
		this.cvterm = cvterm;
		this.name = name;
		this.description = description;
		this.featureranges = featureranges;
		this.featureposes = featureposes;
		this.featuremapPubs = featuremapPubs;
	}

	public int getFeaturemapId() {
		return this.featuremapId;
	}

	public void setFeaturemapId(int featuremapId) {
		this.featuremapId = featuremapId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getFeatureranges() {
		return this.featureranges;
	}

	public void setFeatureranges(Set featureranges) {
		this.featureranges = featureranges;
	}

	public Set getFeatureposes() {
		return this.featureposes;
	}

	public void setFeatureposes(Set featureposes) {
		this.featureposes = featureposes;
	}

	public Set getFeaturemapPubs() {
		return this.featuremapPubs;
	}

	public void setFeaturemapPubs(Set featuremapPubs) {
		this.featuremapPubs = featuremapPubs;
	}

}