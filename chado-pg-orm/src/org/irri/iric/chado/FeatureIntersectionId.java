package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeatureIntersectionId generated by hbm2java
 */
public class FeatureIntersectionId implements java.io.Serializable {

	private Integer subjectId;
	private Integer objectId;
	private Integer srcfeatureId;
	private Short subjectStrand;
	private Short objectStrand;
	private Integer fmin;
	private Integer fmax;

	public FeatureIntersectionId() {
	}

	public FeatureIntersectionId(Integer subjectId, Integer objectId,
			Integer srcfeatureId, Short subjectStrand, Short objectStrand,
			Integer fmin, Integer fmax) {
		this.subjectId = subjectId;
		this.objectId = objectId;
		this.srcfeatureId = srcfeatureId;
		this.subjectStrand = subjectStrand;
		this.objectStrand = objectStrand;
		this.fmin = fmin;
		this.fmax = fmax;
	}

	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public Integer getSrcfeatureId() {
		return this.srcfeatureId;
	}

	public void setSrcfeatureId(Integer srcfeatureId) {
		this.srcfeatureId = srcfeatureId;
	}

	public Short getSubjectStrand() {
		return this.subjectStrand;
	}

	public void setSubjectStrand(Short subjectStrand) {
		this.subjectStrand = subjectStrand;
	}

	public Short getObjectStrand() {
		return this.objectStrand;
	}

	public void setObjectStrand(Short objectStrand) {
		this.objectStrand = objectStrand;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FeatureIntersectionId))
			return false;
		FeatureIntersectionId castOther = (FeatureIntersectionId) other;

		return ((this.getSubjectId() == castOther.getSubjectId()) || (this
				.getSubjectId() != null && castOther.getSubjectId() != null && this
				.getSubjectId().equals(castOther.getSubjectId())))
				&& ((this.getObjectId() == castOther.getObjectId()) || (this
						.getObjectId() != null
						&& castOther.getObjectId() != null && this
						.getObjectId().equals(castOther.getObjectId())))
				&& ((this.getSrcfeatureId() == castOther.getSrcfeatureId()) || (this
						.getSrcfeatureId() != null
						&& castOther.getSrcfeatureId() != null && this
						.getSrcfeatureId().equals(castOther.getSrcfeatureId())))
				&& ((this.getSubjectStrand() == castOther.getSubjectStrand()) || (this
						.getSubjectStrand() != null
						&& castOther.getSubjectStrand() != null && this
						.getSubjectStrand()
						.equals(castOther.getSubjectStrand())))
				&& ((this.getObjectStrand() == castOther.getObjectStrand()) || (this
						.getObjectStrand() != null
						&& castOther.getObjectStrand() != null && this
						.getObjectStrand().equals(castOther.getObjectStrand())))
				&& ((this.getFmin() == castOther.getFmin()) || (this.getFmin() != null
						&& castOther.getFmin() != null && this.getFmin()
						.equals(castOther.getFmin())))
				&& ((this.getFmax() == castOther.getFmax()) || (this.getFmax() != null
						&& castOther.getFmax() != null && this.getFmax()
						.equals(castOther.getFmax())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		result = 37 * result
				+ (getObjectId() == null ? 0 : this.getObjectId().hashCode());
		result = 37
				* result
				+ (getSrcfeatureId() == null ? 0 : this.getSrcfeatureId()
						.hashCode());
		result = 37
				* result
				+ (getSubjectStrand() == null ? 0 : this.getSubjectStrand()
						.hashCode());
		result = 37
				* result
				+ (getObjectStrand() == null ? 0 : this.getObjectStrand()
						.hashCode());
		result = 37 * result
				+ (getFmin() == null ? 0 : this.getFmin().hashCode());
		result = 37 * result
				+ (getFmax() == null ? 0 : this.getFmax().hashCode());
		return result;
	}

}