package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * IntronlocViewId generated by hbm2java
 */
public class IntronlocViewId implements java.io.Serializable {

	private Integer exon1Id;
	private Integer exon2Id;
	private Integer fmin;
	private Integer fmax;
	private Short strand;
	private Integer srcfeatureId;

	public IntronlocViewId() {
	}

	public IntronlocViewId(Integer exon1Id, Integer exon2Id, Integer fmin,
			Integer fmax, Short strand, Integer srcfeatureId) {
		this.exon1Id = exon1Id;
		this.exon2Id = exon2Id;
		this.fmin = fmin;
		this.fmax = fmax;
		this.strand = strand;
		this.srcfeatureId = srcfeatureId;
	}

	public Integer getExon1Id() {
		return this.exon1Id;
	}

	public void setExon1Id(Integer exon1Id) {
		this.exon1Id = exon1Id;
	}

	public Integer getExon2Id() {
		return this.exon2Id;
	}

	public void setExon2Id(Integer exon2Id) {
		this.exon2Id = exon2Id;
	}

	public Integer getFmin() {
		return this.fmin;
	}

	public void setFmin(Integer fmin) {
		this.fmin = fmin;
	}

	public Integer getFmax() {
		return this.fmax;
	}

	public void setFmax(Integer fmax) {
		this.fmax = fmax;
	}

	public Short getStrand() {
		return this.strand;
	}

	public void setStrand(Short strand) {
		this.strand = strand;
	}

	public Integer getSrcfeatureId() {
		return this.srcfeatureId;
	}

	public void setSrcfeatureId(Integer srcfeatureId) {
		this.srcfeatureId = srcfeatureId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IntronlocViewId))
			return false;
		IntronlocViewId castOther = (IntronlocViewId) other;

		return ((this.getExon1Id() == castOther.getExon1Id()) || (this
				.getExon1Id() != null && castOther.getExon1Id() != null && this
				.getExon1Id().equals(castOther.getExon1Id())))
				&& ((this.getExon2Id() == castOther.getExon2Id()) || (this
						.getExon2Id() != null && castOther.getExon2Id() != null && this
						.getExon2Id().equals(castOther.getExon2Id())))
				&& ((this.getFmin() == castOther.getFmin()) || (this.getFmin() != null
						&& castOther.getFmin() != null && this.getFmin()
						.equals(castOther.getFmin())))
				&& ((this.getFmax() == castOther.getFmax()) || (this.getFmax() != null
						&& castOther.getFmax() != null && this.getFmax()
						.equals(castOther.getFmax())))
				&& ((this.getStrand() == castOther.getStrand()) || (this
						.getStrand() != null && castOther.getStrand() != null && this
						.getStrand().equals(castOther.getStrand())))
				&& ((this.getSrcfeatureId() == castOther.getSrcfeatureId()) || (this
						.getSrcfeatureId() != null
						&& castOther.getSrcfeatureId() != null && this
						.getSrcfeatureId().equals(castOther.getSrcfeatureId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExon1Id() == null ? 0 : this.getExon1Id().hashCode());
		result = 37 * result
				+ (getExon2Id() == null ? 0 : this.getExon2Id().hashCode());
		result = 37 * result
				+ (getFmin() == null ? 0 : this.getFmin().hashCode());
		result = 37 * result
				+ (getFmax() == null ? 0 : this.getFmax().hashCode());
		result = 37 * result
				+ (getStrand() == null ? 0 : this.getStrand().hashCode());
		result = 37
				* result
				+ (getSrcfeatureId() == null ? 0 : this.getSrcfeatureId()
						.hashCode());
		return result;
	}

}
