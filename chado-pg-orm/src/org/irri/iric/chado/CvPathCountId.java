package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CvPathCountId generated by hbm2java
 */
public class CvPathCountId implements java.io.Serializable {

	private String cvName;
	private String relationName;
	private String relationCvName;
	private Long numPaths;

	public CvPathCountId() {
	}

	public CvPathCountId(String cvName, String relationName,
			String relationCvName, Long numPaths) {
		this.cvName = cvName;
		this.relationName = relationName;
		this.relationCvName = relationCvName;
		this.numPaths = numPaths;
	}

	public String getCvName() {
		return this.cvName;
	}

	public void setCvName(String cvName) {
		this.cvName = cvName;
	}

	public String getRelationName() {
		return this.relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRelationCvName() {
		return this.relationCvName;
	}

	public void setRelationCvName(String relationCvName) {
		this.relationCvName = relationCvName;
	}

	public Long getNumPaths() {
		return this.numPaths;
	}

	public void setNumPaths(Long numPaths) {
		this.numPaths = numPaths;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CvPathCountId))
			return false;
		CvPathCountId castOther = (CvPathCountId) other;

		return ((this.getCvName() == castOther.getCvName()) || (this
				.getCvName() != null && castOther.getCvName() != null && this
				.getCvName().equals(castOther.getCvName())))
				&& ((this.getRelationName() == castOther.getRelationName()) || (this
						.getRelationName() != null
						&& castOther.getRelationName() != null && this
						.getRelationName().equals(castOther.getRelationName())))
				&& ((this.getRelationCvName() == castOther.getRelationCvName()) || (this
						.getRelationCvName() != null
						&& castOther.getRelationCvName() != null && this
						.getRelationCvName().equals(
								castOther.getRelationCvName())))
				&& ((this.getNumPaths() == castOther.getNumPaths()) || (this
						.getNumPaths() != null
						&& castOther.getNumPaths() != null && this
						.getNumPaths().equals(castOther.getNumPaths())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCvName() == null ? 0 : this.getCvName().hashCode());
		result = 37
				* result
				+ (getRelationName() == null ? 0 : this.getRelationName()
						.hashCode());
		result = 37
				* result
				+ (getRelationCvName() == null ? 0 : this.getRelationCvName()
						.hashCode());
		result = 37 * result
				+ (getNumPaths() == null ? 0 : this.getNumPaths().hashCode());
		return result;
	}

}