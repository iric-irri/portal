package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeatureExpressionprop generated by hbm2java
 */
public class FeatureExpressionprop implements java.io.Serializable {

	private int featureExpressionpropId;
	private FeatureExpression featureExpression;
	private Cvterm cvterm;
	private String value;
	private int rank;

	public FeatureExpressionprop() {
	}

	public FeatureExpressionprop(int featureExpressionpropId,
			FeatureExpression featureExpression, Cvterm cvterm, int rank) {
		this.featureExpressionpropId = featureExpressionpropId;
		this.featureExpression = featureExpression;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public FeatureExpressionprop(int featureExpressionpropId,
			FeatureExpression featureExpression, Cvterm cvterm, String value,
			int rank) {
		this.featureExpressionpropId = featureExpressionpropId;
		this.featureExpression = featureExpression;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
	}

	public int getFeatureExpressionpropId() {
		return this.featureExpressionpropId;
	}

	public void setFeatureExpressionpropId(int featureExpressionpropId) {
		this.featureExpressionpropId = featureExpressionpropId;
	}

	public FeatureExpression getFeatureExpression() {
		return this.featureExpression;
	}

	public void setFeatureExpression(FeatureExpression featureExpression) {
		this.featureExpression = featureExpression;
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