package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * Magedocumentation generated by hbm2java
 */
public class Magedocumentation implements java.io.Serializable {

	private int magedocumentationId;
	private Tableinfo tableinfo;
	private Mageml mageml;
	private int rowId;
	private String mageidentifier;

	public Magedocumentation() {
	}

	public Magedocumentation(int magedocumentationId, Tableinfo tableinfo,
			Mageml mageml, int rowId, String mageidentifier) {
		this.magedocumentationId = magedocumentationId;
		this.tableinfo = tableinfo;
		this.mageml = mageml;
		this.rowId = rowId;
		this.mageidentifier = mageidentifier;
	}

	public int getMagedocumentationId() {
		return this.magedocumentationId;
	}

	public void setMagedocumentationId(int magedocumentationId) {
		this.magedocumentationId = magedocumentationId;
	}

	public Tableinfo getTableinfo() {
		return this.tableinfo;
	}

	public void setTableinfo(Tableinfo tableinfo) {
		this.tableinfo = tableinfo;
	}

	public Mageml getMageml() {
		return this.mageml;
	}

	public void setMageml(Mageml mageml) {
		this.mageml = mageml;
	}

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getMageidentifier() {
		return this.mageidentifier;
	}

	public void setMageidentifier(String mageidentifier) {
		this.mageidentifier = mageidentifier;
	}

}
