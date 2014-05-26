package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Expression generated by hbm2java
 */
public class Expression implements java.io.Serializable {

	private int expressionId;
	private String uniquename;
	private String md5checksum;
	private String description;
	private Set expressionprops = new HashSet(0);
	private Set featureExpressions = new HashSet(0);
	private Set expressionImages = new HashSet(0);
	private Set expressionCvterms = new HashSet(0);
	private Set expressionPubs = new HashSet(0);

	public Expression() {
	}

	public Expression(int expressionId, String uniquename) {
		this.expressionId = expressionId;
		this.uniquename = uniquename;
	}

	public Expression(int expressionId, String uniquename, String md5checksum,
			String description, Set expressionprops, Set featureExpressions,
			Set expressionImages, Set expressionCvterms, Set expressionPubs) {
		this.expressionId = expressionId;
		this.uniquename = uniquename;
		this.md5checksum = md5checksum;
		this.description = description;
		this.expressionprops = expressionprops;
		this.featureExpressions = featureExpressions;
		this.expressionImages = expressionImages;
		this.expressionCvterms = expressionCvterms;
		this.expressionPubs = expressionPubs;
	}

	public int getExpressionId() {
		return this.expressionId;
	}

	public void setExpressionId(int expressionId) {
		this.expressionId = expressionId;
	}

	public String getUniquename() {
		return this.uniquename;
	}

	public void setUniquename(String uniquename) {
		this.uniquename = uniquename;
	}

	public String getMd5checksum() {
		return this.md5checksum;
	}

	public void setMd5checksum(String md5checksum) {
		this.md5checksum = md5checksum;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getExpressionprops() {
		return this.expressionprops;
	}

	public void setExpressionprops(Set expressionprops) {
		this.expressionprops = expressionprops;
	}

	public Set getFeatureExpressions() {
		return this.featureExpressions;
	}

	public void setFeatureExpressions(Set featureExpressions) {
		this.featureExpressions = featureExpressions;
	}

	public Set getExpressionImages() {
		return this.expressionImages;
	}

	public void setExpressionImages(Set expressionImages) {
		this.expressionImages = expressionImages;
	}

	public Set getExpressionCvterms() {
		return this.expressionCvterms;
	}

	public void setExpressionCvterms(Set expressionCvterms) {
		this.expressionCvterms = expressionCvterms;
	}

	public Set getExpressionPubs() {
		return this.expressionPubs;
	}

	public void setExpressionPubs(Set expressionPubs) {
		this.expressionPubs = expressionPubs;
	}

}