package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * NdExperimentStockDbxref generated by hbm2java
 */
public class NdExperimentStockDbxref implements java.io.Serializable {

	private int ndExperimentStockDbxrefId;
	private NdExperimentStock ndExperimentStock;
	private Dbxref dbxref;

	public NdExperimentStockDbxref() {
	}

	public NdExperimentStockDbxref(int ndExperimentStockDbxrefId,
			NdExperimentStock ndExperimentStock, Dbxref dbxref) {
		this.ndExperimentStockDbxrefId = ndExperimentStockDbxrefId;
		this.ndExperimentStock = ndExperimentStock;
		this.dbxref = dbxref;
	}

	public int getNdExperimentStockDbxrefId() {
		return this.ndExperimentStockDbxrefId;
	}

	public void setNdExperimentStockDbxrefId(int ndExperimentStockDbxrefId) {
		this.ndExperimentStockDbxrefId = ndExperimentStockDbxrefId;
	}

	public NdExperimentStock getNdExperimentStock() {
		return this.ndExperimentStock;
	}

	public void setNdExperimentStock(NdExperimentStock ndExperimentStock) {
		this.ndExperimentStock = ndExperimentStock;
	}

	public Dbxref getDbxref() {
		return this.dbxref;
	}

	public void setDbxref(Dbxref dbxref) {
		this.dbxref = dbxref;
	}

}
