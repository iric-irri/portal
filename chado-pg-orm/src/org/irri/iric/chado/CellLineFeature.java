package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CellLineFeature generated by hbm2java
 */
public class CellLineFeature implements java.io.Serializable {

	private int cellLineFeatureId;
	private Pub pub;
	private Feature feature;
	private CellLine cellLine;

	public CellLineFeature() {
	}

	public CellLineFeature(int cellLineFeatureId, Pub pub, Feature feature,
			CellLine cellLine) {
		this.cellLineFeatureId = cellLineFeatureId;
		this.pub = pub;
		this.feature = feature;
		this.cellLine = cellLine;
	}

	public int getCellLineFeatureId() {
		return this.cellLineFeatureId;
	}

	public void setCellLineFeatureId(int cellLineFeatureId) {
		this.cellLineFeatureId = cellLineFeatureId;
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

	public CellLine getCellLine() {
		return this.cellLine;
	}

	public void setCellLine(CellLine cellLine) {
		this.cellLine = cellLine;
	}

}
