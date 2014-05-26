package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Pubauthor generated by hbm2java
 */
public class Pubauthor implements java.io.Serializable {

	private int pubauthorId;
	private Pub pub;
	private int rank;
	private Boolean editor;
	private String surname;
	private String givennames;
	private String suffix;

	public Pubauthor() {
	}

	public Pubauthor(int pubauthorId, Pub pub, int rank, String surname) {
		this.pubauthorId = pubauthorId;
		this.pub = pub;
		this.rank = rank;
		this.surname = surname;
	}

	public Pubauthor(int pubauthorId, Pub pub, int rank, Boolean editor,
			String surname, String givennames, String suffix) {
		this.pubauthorId = pubauthorId;
		this.pub = pub;
		this.rank = rank;
		this.editor = editor;
		this.surname = surname;
		this.givennames = givennames;
		this.suffix = suffix;
	}

	public int getPubauthorId() {
		return this.pubauthorId;
	}

	public void setPubauthorId(int pubauthorId) {
		this.pubauthorId = pubauthorId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Boolean getEditor() {
		return this.editor;
	}

	public void setEditor(Boolean editor) {
		this.editor = editor;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivennames() {
		return this.givennames;
	}

	public void setGivennames(String givennames) {
		this.givennames = givennames;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}