package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * StockcollectionStock generated by hbm2java
 */
public class StockcollectionStock implements java.io.Serializable {

	private int stockcollectionStockId;
	private Stockcollection stockcollection;
	private Stock stock;

	public StockcollectionStock() {
	}

	public StockcollectionStock(int stockcollectionStockId,
			Stockcollection stockcollection, Stock stock) {
		this.stockcollectionStockId = stockcollectionStockId;
		this.stockcollection = stockcollection;
		this.stock = stock;
	}

	public int getStockcollectionStockId() {
		return this.stockcollectionStockId;
	}

	public void setStockcollectionStockId(int stockcollectionStockId) {
		this.stockcollectionStockId = stockcollectionStockId;
	}

	public Stockcollection getStockcollection() {
		return this.stockcollection;
	}

	public void setStockcollection(Stockcollection stockcollection) {
		this.stockcollection = stockcollection;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}