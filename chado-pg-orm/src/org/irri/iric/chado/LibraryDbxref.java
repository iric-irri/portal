package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * LibraryDbxref generated by hbm2java
 */
public class LibraryDbxref implements java.io.Serializable {

	private int libraryDbxrefId;
	private Dbxref dbxref;
	private Library library;
	private boolean isCurrent;

	public LibraryDbxref() {
	}

	public LibraryDbxref(int libraryDbxrefId, Dbxref dbxref, Library library,
			boolean isCurrent) {
		this.libraryDbxrefId = libraryDbxrefId;
		this.dbxref = dbxref;
		this.library = library;
		this.isCurrent = isCurrent;
	}

	public int getLibraryDbxrefId() {
		return this.libraryDbxrefId;
	}

	public void setLibraryDbxrefId(int libraryDbxrefId) {
		this.libraryDbxrefId = libraryDbxrefId;
	}

	public Dbxref getDbxref() {
		return this.dbxref;
	}

	public void setDbxref(Dbxref dbxref) {
		this.dbxref = dbxref;
	}

	public Library getLibrary() {
		return this.library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public boolean isIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

}