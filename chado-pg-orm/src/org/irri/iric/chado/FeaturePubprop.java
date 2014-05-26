package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeaturePubprop generated by hbm2java
 */
public class FeaturePubprop implements java.io.Serializable {

	private int featurePubpropId;
	private FeaturePub featurePub;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public FeaturePubprop() {
	}

	public FeaturePubprop(int featurePubpropId, FeaturePub featurePub,
			Cvterm cvterm, int rank) {
		this.featurePubpropId = featurePubpropId;
		this.featurePub = featurePub;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public FeaturePubprop(int featurePubpropId, FeaturePub featurePub,
			Cvterm cvterm, String value, int rank) {
		this.featurePubpropId = featurePubpropId;
		this.featurePub = featurePub;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getFeaturePubpropId() {
		return this.featurePubpropId;
	}

	public void setFeaturePubpropId(int featurePubpropId) {
		this.featurePubpropId = featurePubpropId;
	}

	public FeaturePub getFeaturePub() {
		return this.featurePub;
	}

	public void setFeaturePub(FeaturePub featurePub) {
		this.featurePub = featurePub;
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
