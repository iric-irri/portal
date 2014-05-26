package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FeaturesetMeetsId generated by hbm2java
 */
public class FeaturesetMeetsId implements java.io.Serializable {

	private Integer subjectId;
	private Integer objectId;

	public FeaturesetMeetsId() {
	}

	public FeaturesetMeetsId(Integer subjectId, Integer objectId) {
		this.subjectId = subjectId;
		this.objectId = objectId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FeaturesetMeetsId))
			return false;
		FeaturesetMeetsId castOther = (FeaturesetMeetsId) other;

		return ((this.getSubjectId() == castOther.getSubjectId()) || (this
				.getSubjectId() != null && castOther.getSubjectId() != null && this
				.getSubjectId().equals(castOther.getSubjectId())))
				&& ((this.getObjectId() == castOther.getObjectId()) || (this
						.getObjectId() != null
						&& castOther.getObjectId() != null && this
						.getObjectId().equals(castOther.getObjectId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		result = 37 * result
				+ (getObjectId() == null ? 0 : this.getObjectId().hashCode());
		return result;
	}

}
