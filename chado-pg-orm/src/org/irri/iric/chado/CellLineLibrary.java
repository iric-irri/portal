package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CellLineLibrary generated by hbm2java
 */
public class CellLineLibrary implements java.io.Serializable {

	private int cellLineLibraryId;
	private Pub pub;
	private Library library;
	private CellLine cellLine;

	public CellLineLibrary() {
	}

	public CellLineLibrary(int cellLineLibraryId, Pub pub, Library library,
			CellLine cellLine) {
		this.cellLineLibraryId = cellLineLibraryId;
		this.pub = pub;
		this.library = library;
		this.cellLine = cellLine;
	}

	public int getCellLineLibraryId() {
		return this.cellLineLibraryId;
	}

	public void setCellLineLibraryId(int cellLineLibraryId) {
		this.cellLineLibraryId = cellLineLibraryId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Library getLibrary() {
		return this.library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public CellLine getCellLine() {
		return this.cellLine;
	}

	public void setCellLine(CellLine cellLine) {
		this.cellLine = cellLine;
	}

}
