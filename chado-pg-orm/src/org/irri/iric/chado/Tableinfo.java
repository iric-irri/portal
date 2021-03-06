package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tableinfo generated by hbm2java
 */
public class Tableinfo implements java.io.Serializable {

	private int tableinfoId;
	private String name;
	private String primaryKeyColumn;
	private int isView;
	private Integer viewOnTableId;
	private Integer superclassTableId;
	private int isUpdateable;
	private Date modificationDate;
	private Set magedocumentations = new HashSet(0);
	private Set controls = new HashSet(0);

	public Tableinfo() {
	}

	public Tableinfo(int tableinfoId, String name, int isView,
			int isUpdateable, Date modificationDate) {
		this.tableinfoId = tableinfoId;
		this.name = name;
		this.isView = isView;
		this.isUpdateable = isUpdateable;
		this.modificationDate = modificationDate;
	}

	public Tableinfo(int tableinfoId, String name, String primaryKeyColumn,
			int isView, Integer viewOnTableId, Integer superclassTableId,
			int isUpdateable, Date modificationDate, Set magedocumentations,
			Set controls) {
		this.tableinfoId = tableinfoId;
		this.name = name;
		this.primaryKeyColumn = primaryKeyColumn;
		this.isView = isView;
		this.viewOnTableId = viewOnTableId;
		this.superclassTableId = superclassTableId;
		this.isUpdateable = isUpdateable;
		this.modificationDate = modificationDate;
		this.magedocumentations = magedocumentations;
		this.controls = controls;
	}

	public int getTableinfoId() {
		return this.tableinfoId;
	}

	public void setTableinfoId(int tableinfoId) {
		this.tableinfoId = tableinfoId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryKeyColumn() {
		return this.primaryKeyColumn;
	}

	public void setPrimaryKeyColumn(String primaryKeyColumn) {
		this.primaryKeyColumn = primaryKeyColumn;
	}

	public int getIsView() {
		return this.isView;
	}

	public void setIsView(int isView) {
		this.isView = isView;
	}

	public Integer getViewOnTableId() {
		return this.viewOnTableId;
	}

	public void setViewOnTableId(Integer viewOnTableId) {
		this.viewOnTableId = viewOnTableId;
	}

	public Integer getSuperclassTableId() {
		return this.superclassTableId;
	}

	public void setSuperclassTableId(Integer superclassTableId) {
		this.superclassTableId = superclassTableId;
	}

	public int getIsUpdateable() {
		return this.isUpdateable;
	}

	public void setIsUpdateable(int isUpdateable) {
		this.isUpdateable = isUpdateable;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public Set getMagedocumentations() {
		return this.magedocumentations;
	}

	public void setMagedocumentations(Set magedocumentations) {
		this.magedocumentations = magedocumentations;
	}

	public Set getControls() {
		return this.controls;
	}

	public void setControls(Set controls) {
		this.controls = controls;
	}

}
