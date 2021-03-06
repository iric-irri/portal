package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeatureSynonym generated by hbm2java
 */
public class FeatureSynonym implements java.io.Serializable {

	private int featureSynonymId;
	private Pub pub;
	private Feature feature;
	private Synonym synonym;
	private boolean isCurrent;
	private boolean isInternal;

	public FeatureSynonym() {
	}

	public FeatureSynonym(int featureSynonymId, Pub pub, Feature feature,
			Synonym synonym, boolean isCurrent, boolean isInternal) {
		this.featureSynonymId = featureSynonymId;
		this.pub = pub;
		this.feature = feature;
		this.synonym = synonym;
		this.isCurrent = isCurrent;
		this.isInternal = isInternal;
	}

	public int getFeatureSynonymId() {
		return this.featureSynonymId;
	}

	public void setFeatureSynonymId(int featureSynonymId) {
		this.featureSynonymId = featureSynonymId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Feature getFeature() {
		return this.feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Synonym getSynonym() {
		return this.synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}

	public boolean isIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public boolean isIsInternal() {
		return this.isInternal;
	}

	public void setIsInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}

}
