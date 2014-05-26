package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureExpression generated by hbm2java
 */
public class FeatureExpression implements java.io.Serializable {

	private int featureExpressionId;
	private Pub pub;
	private Feature feature;
	private Expression expression;
	private Set featureExpressionprops = new HashSet(0);

	public FeatureExpression() {
	}

	public FeatureExpression(int featureExpressionId, Pub pub, Feature feature,
			Expression expression) {
		this.featureExpressionId = featureExpressionId;
		this.pub = pub;
		this.feature = feature;
		this.expression = expression;
	}

	public FeatureExpression(int featureExpressionId, Pub pub, Feature feature,
			Expression expression, Set featureExpressionprops) {
		this.featureExpressionId = featureExpressionId;
		this.pub = pub;
		this.feature = feature;
		this.expression = expression;
		this.featureExpressionprops = featureExpressionprops;
	}

	public int getFeatureExpressionId() {
		return this.featureExpressionId;
	}

	public void setFeatureExpressionId(int featureExpressionId) {
		this.featureExpressionId = featureExpressionId;
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

	public Expression getExpression() {
		return this.expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Set getFeatureExpressionprops() {
		return this.featureExpressionprops;
	}

	public void setFeatureExpressionprops(Set featureExpressionprops) {
		this.featureExpressionprops = featureExpressionprops;
	}

}
