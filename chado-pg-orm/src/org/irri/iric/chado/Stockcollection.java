package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Stockcollection generated by hbm2java
 */
public class Stockcollection implements java.io.Serializable {

	private int stockcollectionId;
	private Contact contact;
	private Cvterm cvterm;
	private String name;
	private String uniquename;
	private Set stockcollectionStocks = new HashSet(0);
	private Set stockcollectionprops = new HashSet(0);

	public Stockcollection() {
	}

	public Stockcollection(int stockcollectionId, Cvterm cvterm,
			String uniquename) {
		this.stockcollectionId = stockcollectionId;
		this.cvterm = cvterm;
		this.uniquename = uniquename;
	}

	public Stockcollection(int stockcollectionId, Contact contact,
			Cvterm cvterm, String name, String uniquename,
			Set stockcollectionStocks, Set stockcollectionprops) {
		this.stockcollectionId = stockcollectionId;
		this.contact = contact;
		this.cvterm = cvterm;
		this.name = name;
		this.uniquename = uniquename;
		this.stockcollectionStocks = stockcollectionStocks;
		this.stockcollectionprops = stockcollectionprops;
	}

	public int getStockcollectionId() {
		return this.stockcollectionId;
	}

	public void setStockcollectionId(int stockcollectionId) {
		this.stockcollectionId = stockcollectionId;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
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

	public Set getStockcollectionStocks() {
		return this.stockcollectionStocks;
	}

	public void setStockcollectionStocks(Set stockcollectionStocks) {
		this.stockcollectionStocks = stockcollectionStocks;
	}

	public Set getStockcollectionprops() {
		return this.stockcollectionprops;
	}

	public void setStockcollectionprops(Set stockcollectionprops) {
		this.stockcollectionprops = stockcollectionprops;
	}

}
