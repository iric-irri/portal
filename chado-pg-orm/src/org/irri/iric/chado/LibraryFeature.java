package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * LibraryFeature generated by hbm2java
 */
public class LibraryFeature implements java.io.Serializable {

	private int libraryFeatureId;
	private Feature feature;
	private Library library;

	public LibraryFeature() {
	}

	public LibraryFeature(int libraryFeatureId, Feature feature, Library library) {
		this.libraryFeatureId = libraryFeatureId;
		this.feature = feature;
		this.library = library;
	}

	public int getLibraryFeatureId() {
		return this.libraryFeatureId;
	}

	public void setLibraryFeatureId(int libraryFeatureId) {
		this.libraryFeatureId = libraryFeatureId;
	}

	public Feature getFeature() {
		return this.feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Library getLibrary() {
		return this.library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

}
