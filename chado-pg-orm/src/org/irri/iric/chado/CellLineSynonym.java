package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CellLineSynonym generated by hbm2java
 */
public class CellLineSynonym implements java.io.Serializable {

	private int cellLineSynonymId;
	private Pub pub;
	private Synonym synonym;
	private CellLine cellLine;
	private boolean isCurrent;
	private boolean isInternal;

	public CellLineSynonym() {
	}

	public CellLineSynonym(int cellLineSynonymId, Pub pub, Synonym synonym,
			CellLine cellLine, boolean isCurrent, boolean isInternal) {
		this.cellLineSynonymId = cellLineSynonymId;
		this.pub = pub;
		this.synonym = synonym;
		this.cellLine = cellLine;
		this.isCurrent = isCurrent;
		this.isInternal = isInternal;
	}

	public int getCellLineSynonymId() {
		return this.cellLineSynonymId;
	}

	public void setCellLineSynonymId(int cellLineSynonymId) {
		this.cellLineSynonymId = cellLineSynonymId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Synonym getSynonym() {
		return this.synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}

	public CellLine getCellLine() {
		return this.cellLine;
	}

	public void setCellLine(CellLine cellLine) {
		this.cellLine = cellLine;
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
