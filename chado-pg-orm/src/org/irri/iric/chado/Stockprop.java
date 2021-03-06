package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Stockprop generated by hbm2java
 */
public class Stockprop implements java.io.Serializable {

	private int stockpropId;
	private Stock stock;
	private Cvterm cvterm;
	private String value;
	private int rank;
	private Set stockpropPubs = new HashSet(0);

	public Stockprop() {
	}

	public Stockprop(int stockpropId, Stock stock, Cvterm cvterm, int rank) {
		this.stockpropId = stockpropId;
		this.stock = stock;
		this.cvterm = cvterm;
		this.rank = rank;
	}

	public Stockprop(int stockpropId, Stock stock, Cvterm cvterm, String value,
			int rank, Set stockpropPubs) {
		this.stockpropId = stockpropId;
		this.stock = stock;
		this.cvterm = cvterm;
		this.value = value;
		this.rank = rank;
		this.stockpropPubs = stockpropPubs;
	}

	public int getStockpropId() {
		return this.stockpropId;
	}

	public void setStockpropId(int stockpropId) {
		this.stockpropId = stockpropId;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Cvterm getCvterm() {
		return this.cvterm;
	}

	public void setCvterm(Cvterm cvterm) {
		this.cvterm = cvterm;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Set getStockpropPubs() {
		return this.stockpropPubs;
	}

	public void setStockpropPubs(Set stockpropPubs) {
		this.stockpropPubs = stockpropPubs;
	}

}
