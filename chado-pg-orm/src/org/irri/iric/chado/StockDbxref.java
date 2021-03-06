package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * StockDbxref generated by hbm2java
 */
public class StockDbxref implements java.io.Serializable {

	private int stockDbxrefId;
	private Dbxref dbxref;
	private Stock stock;
	private boolean isCurrent;
	private Set stockDbxrefprops = new HashSet(0);

	public StockDbxref() {
	}

	public StockDbxref(int stockDbxrefId, Dbxref dbxref, Stock stock,
			boolean isCurrent) {
		this.stockDbxrefId = stockDbxrefId;
		this.dbxref = dbxref;
		this.stock = stock;
		this.isCurrent = isCurrent;
	}

	public StockDbxref(int stockDbxrefId, Dbxref dbxref, Stock stock,
			boolean isCurrent, Set stockDbxrefprops) {
		this.stockDbxrefId = stockDbxrefId;
		this.dbxref = dbxref;
		this.stock = stock;
		this.isCurrent = isCurrent;
		this.stockDbxrefprops = stockDbxrefprops;
	}

	public int getStockDbxrefId() {
		return this.stockDbxrefId;
	}

	public void setStockDbxrefId(int stockDbxrefId) {
		this.stockDbxrefId = stockDbxrefId;
	}

	public Dbxref getDbxref() {
		return this.dbxref;
	}

	public void setDbxref(Dbxref dbxref) {
		this.dbxref = dbxref;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public boolean isIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Set getStockDbxrefprops() {
		return this.stockDbxrefprops;
	}

	public void setStockDbxrefprops(Set stockDbxrefprops) {
		this.stockDbxrefprops = stockDbxrefprops;
	}

}
