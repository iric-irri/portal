package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Library generated by hbm2java
 */
public class Library implements java.io.Serializable {

	private int libraryId;
	private Organism organism;
	private Cvterm cvterm;
	private String name;
	private String uniquename;
	private int isObsolete;
	private Date timeaccessioned;
	private Date timelastmodified;
	private Set libraryprops = new HashSet(0);
	private Set libraryDbxrefs = new HashSet(0);
	private Set librarySynonyms = new HashSet(0);
	private Set libraryFeatures = new HashSet(0);
	private Set cellLineLibraries = new HashSet(0);
	private Set libraryPubs = new HashSet(0);
	private Set libraryCvterms = new HashSet(0);

	public Library() {
	}

	public Library(int libraryId, Organism organism, Cvterm cvterm,
			String uniquename, int isObsolete, Date timeaccessioned,
			Date timelastmodified) {
		this.libraryId = libraryId;
		this.organism = organism;
		this.cvterm = cvterm;
		this.uniquename = uniquename;
		this.isObsolete = isObsolete;
		this.timeaccessioned = timeaccessioned;
		this.timelastmodified = timelastmodified;
	}

	public Library(int libraryId, Organism organism, Cvterm cvterm,
			String name, String uniquename, int isObsolete,
			Date timeaccessioned, Date timelastmodified, Set libraryprops,
			Set libraryDbxrefs, Set librarySynonyms, Set libraryFeatures,
			Set cellLineLibraries, Set libraryPubs, Set libraryCvterms) {
		this.libraryId = libraryId;
		this.organism = organism;
		this.cvterm = cvterm;
		this.name = name;
		this.uniquename = uniquename;
		this.isObsolete = isObsolete;
		this.timeaccessioned = timeaccessioned;
		this.timelastmodified = timelastmodified;
		this.libraryprops = libraryprops;
		this.libraryDbxrefs = libraryDbxrefs;
		this.librarySynonyms = librarySynonyms;
		this.libraryFeatures = libraryFeatures;
		this.cellLineLibraries = cellLineLibraries;
		this.libraryPubs = libraryPubs;
		this.libraryCvterms = libraryCvterms;
	}

	public int getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public Organism getOrganism() {
		return this.organism;
	}

	public void setOrganism(Organism organism) {
		this.organism = organism;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniquename() {
		return this.uniquename;
	}

	public void setUniquename(String uniquename) {
		this.uniquename = uniquename;
	}

	public int getIsObsolete() {
		return this.isObsolete;
	}

	public void setIsObsolete(int isObsolete) {
		this.isObsolete = isObsolete;
	}

	public Date getTimeaccessioned() {
		return this.timeaccessioned;
	}

	public void setTimeaccessioned(Date timeaccessioned) {
		this.timeaccessioned = timeaccessioned;
	}

	public Date getTimelastmodified() {
		return this.timelastmodified;
	}

	public void setTimelastmodified(Date timelastmodified) {
		this.timelastmodified = timelastmodified;
	}

	public Set getLibraryprops() {
		return this.libraryprops;
	}

	public void setLibraryprops(Set libraryprops) {
		this.libraryprops = libraryprops;
	}

	public Set getLibraryDbxrefs() {
		return this.libraryDbxrefs;
	}

	public void setLibraryDbxrefs(Set libraryDbxrefs) {
		this.libraryDbxrefs = libraryDbxrefs;
	}

	public Set getLibrarySynonyms() {
		return this.librarySynonyms;
	}

	public void setLibrarySynonyms(Set librarySynonyms) {
		this.librarySynonyms = librarySynonyms;
	}

	public Set getLibraryFeatures() {
		return this.libraryFeatures;
	}

	public void setLibraryFeatures(Set libraryFeatures) {
		this.libraryFeatures = libraryFeatures;
	}

	public Set getCellLineLibraries() {
		return this.cellLineLibraries;
	}

	public void setCellLineLibraries(Set cellLineLibraries) {
		this.cellLineLibraries = cellLineLibraries;
	}

	public Set getLibraryPubs() {
		return this.libraryPubs;
	}

	public void setLibraryPubs(Set libraryPubs) {
		this.libraryPubs = libraryPubs;
	}

	public Set getLibraryCvterms() {
		return this.libraryCvterms;
	}

	public void setLibraryCvterms(Set libraryCvterms) {
		this.libraryCvterms = libraryCvterms;
	}

}