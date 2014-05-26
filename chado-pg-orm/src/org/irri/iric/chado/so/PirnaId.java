package org.irri.iric.chado.so;

// Generated 05 26, 14 1:32:25 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PirnaId generated by hbm2java
 */
public class PirnaId implements java.io.Serializable {

	private Integer pirnaId;
	private Integer featureId;
	private Integer dbxrefId;
	private Integer organismId;
	private String name;
	private String uniquename;
	private String residues;
	private Integer seqlen;
	private String md5checksum;
	private Integer typeId;
	private Boolean isAnalysis;
	private Boolean isObsolete;
	private Date timeaccessioned;
	private Date timelastmodified;

	public PirnaId() {
	}

	public PirnaId(Integer pirnaId, Integer featureId, Integer dbxrefId,
			Integer organismId, String name, String uniquename,
			String residues, Integer seqlen, String md5checksum,
			Integer typeId, Boolean isAnalysis, Boolean isObsolete,
			Date timeaccessioned, Date timelastmodified) {
		this.pirnaId = pirnaId;
		this.featureId = featureId;
		this.dbxrefId = dbxrefId;
		this.organismId = organismId;
		this.name = name;
		this.uniquename = uniquename;
		this.residues = residues;
		this.seqlen = seqlen;
		this.md5checksum = md5checksum;
		this.typeId = typeId;
		this.isAnalysis = isAnalysis;
		this.isObsolete = isObsolete;
		this.timeaccessioned = timeaccessioned;
		this.timelastmodified = timelastmodified;
	}

	public Integer getPirnaId() {
		return this.pirnaId;
	}

	public void setPirnaId(Integer pirnaId) {
		this.pirnaId = pirnaId;
	}

	public Integer getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
	}

	public Integer getDbxrefId() {
		return this.dbxrefId;
	}

	public void setDbxrefId(Integer dbxrefId) {
		this.dbxrefId = dbxrefId;
	}

	public Integer getOrganismId() {
		return this.organismId;
	}

	public void setOrganismId(Integer organismId) {
		this.organismId = organismId;
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

	public String getResidues() {
		return this.residues;
	}

	public void setResidues(String residues) {
		this.residues = residues;
	}

	public Integer getSeqlen() {
		return this.seqlen;
	}

	public void setSeqlen(Integer seqlen) {
		this.seqlen = seqlen;
	}

	public String getMd5checksum() {
		return this.md5checksum;
	}

	public void setMd5checksum(String md5checksum) {
		this.md5checksum = md5checksum;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Boolean getIsAnalysis() {
		return this.isAnalysis;
	}

	public void setIsAnalysis(Boolean isAnalysis) {
		this.isAnalysis = isAnalysis;
	}

	public Boolean getIsObsolete() {
		return this.isObsolete;
	}

	public void setIsObsolete(Boolean isObsolete) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PirnaId))
			return false;
		PirnaId castOther = (PirnaId) other;

		return ((this.getPirnaId() == castOther.getPirnaId()) || (this
				.getPirnaId() != null && castOther.getPirnaId() != null && this
				.getPirnaId().equals(castOther.getPirnaId())))
				&& ((this.getFeatureId() == castOther.getFeatureId()) || (this
						.getFeatureId() != null
						&& castOther.getFeatureId() != null && this
						.getFeatureId().equals(castOther.getFeatureId())))
				&& ((this.getDbxrefId() == castOther.getDbxrefId()) || (this
						.getDbxrefId() != null
						&& castOther.getDbxrefId() != null && this
						.getDbxrefId().equals(castOther.getDbxrefId())))
				&& ((this.getOrganismId() == castOther.getOrganismId()) || (this
						.getOrganismId() != null
						&& castOther.getOrganismId() != null && this
						.getOrganismId().equals(castOther.getOrganismId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getUniquename() == castOther.getUniquename()) || (this
						.getUniquename() != null
						&& castOther.getUniquename() != null && this
						.getUniquename().equals(castOther.getUniquename())))
				&& ((this.getResidues() == castOther.getResidues()) || (this
						.getResidues() != null
						&& castOther.getResidues() != null && this
						.getResidues().equals(castOther.getResidues())))
				&& ((this.getSeqlen() == castOther.getSeqlen()) || (this
						.getSeqlen() != null && castOther.getSeqlen() != null && this
						.getSeqlen().equals(castOther.getSeqlen())))
				&& ((this.getMd5checksum() == castOther.getMd5checksum()) || (this
						.getMd5checksum() != null
						&& castOther.getMd5checksum() != null && this
						.getMd5checksum().equals(castOther.getMd5checksum())))
				&& ((this.getTypeId() == castOther.getTypeId()) || (this
						.getTypeId() != null && castOther.getTypeId() != null && this
						.getTypeId().equals(castOther.getTypeId())))
				&& ((this.getIsAnalysis() == castOther.getIsAnalysis()) || (this
						.getIsAnalysis() != null
						&& castOther.getIsAnalysis() != null && this
						.getIsAnalysis().equals(castOther.getIsAnalysis())))
				&& ((this.getIsObsolete() == castOther.getIsObsolete()) || (this
						.getIsObsolete() != null
						&& castOther.getIsObsolete() != null && this
						.getIsObsolete().equals(castOther.getIsObsolete())))
				&& ((this.getTimeaccessioned() == castOther
						.getTimeaccessioned()) || (this.getTimeaccessioned() != null
						&& castOther.getTimeaccessioned() != null && this
						.getTimeaccessioned().equals(
								castOther.getTimeaccessioned())))
				&& ((this.getTimelastmodified() == castOther
						.getTimelastmodified()) || (this.getTimelastmodified() != null
						&& castOther.getTimelastmodified() != null && this
						.getTimelastmodified().equals(
								castOther.getTimelastmodified())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPirnaId() == null ? 0 : this.getPirnaId().hashCode());
		result = 37 * result
				+ (getFeatureId() == null ? 0 : this.getFeatureId().hashCode());
		result = 37 * result
				+ (getDbxrefId() == null ? 0 : this.getDbxrefId().hashCode());
		result = 37
				* result
				+ (getOrganismId() == null ? 0 : this.getOrganismId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37
				* result
				+ (getUniquename() == null ? 0 : this.getUniquename()
						.hashCode());
		result = 37 * result
				+ (getResidues() == null ? 0 : this.getResidues().hashCode());
		result = 37 * result
				+ (getSeqlen() == null ? 0 : this.getSeqlen().hashCode());
		result = 37
				* result
				+ (getMd5checksum() == null ? 0 : this.getMd5checksum()
						.hashCode());
		result = 37 * result
				+ (getTypeId() == null ? 0 : this.getTypeId().hashCode());
		result = 37
				* result
				+ (getIsAnalysis() == null ? 0 : this.getIsAnalysis()
						.hashCode());
		result = 37
				* result
				+ (getIsObsolete() == null ? 0 : this.getIsObsolete()
						.hashCode());
		result = 37
				* result
				+ (getTimeaccessioned() == null ? 0 : this.getTimeaccessioned()
						.hashCode());
		result = 37
				* result
				+ (getTimelastmodified() == null ? 0 : this
						.getTimelastmodified().hashCode());
		return result;
	}

}
