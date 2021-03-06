package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CellLineDbxref generated by hbm2java
 */
public class CellLineDbxref implements java.io.Serializable {

	private int cellLineDbxrefId;
	private Dbxref dbxref;
	private CellLine cellLine;
	private boolean isCurrent;

	public CellLineDbxref() {
	}

	public CellLineDbxref(int cellLineDbxrefId, Dbxref dbxref,
			CellLine cellLine, boolean isCurrent) {
		this.cellLineDbxrefId = cellLineDbxrefId;
		this.dbxref = dbxref;
		this.cellLine = cellLine;
		this.isCurrent = isCurrent;
	}

	public int getCellLineDbxrefId() {
		return this.cellLineDbxrefId;
	}

	public void setCellLineDbxrefId(int cellLineDbxrefId) {
		this.cellLineDbxrefId = cellLineDbxrefId;
	}

	public Dbxref getDbxref() {
		return this.dbxref;
	}

	public void setDbxref(Dbxref dbxref) {
		this.dbxref = dbxref;
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

}
