package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeatureRelationshippropPub generated by hbm2java
 */
public class FeatureRelationshippropPub implements java.io.Serializable {

	private int featureRelationshippropPubId;
	private Pub pub;
	private FeatureRelationshipprop featureRelationshipprop;

	public FeatureRelationshippropPub() {
	}

	public FeatureRelationshippropPub(int featureRelationshippropPubId,
			Pub pub, FeatureRelationshipprop featureRelationshipprop) {
		this.featureRelationshippropPubId = featureRelationshippropPubId;
		this.pub = pub;
		this.featureRelationshipprop = featureRelationshipprop;
	}

	public int getFeatureRelationshippropPubId() {
		return this.featureRelationshippropPubId;
	}

	public void setFeatureRelationshippropPubId(int featureRelationshippropPubId) {
		this.featureRelationshippropPubId = featureRelationshippropPubId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public FeatureRelationshipprop getFeatureRelationshipprop() {
		return this.featureRelationshipprop;
	}

	public void setFeatureRelationshipprop(
			FeatureRelationshipprop featureRelationshipprop) {
		this.featureRelationshipprop = featureRelationshipprop;
	}

}
