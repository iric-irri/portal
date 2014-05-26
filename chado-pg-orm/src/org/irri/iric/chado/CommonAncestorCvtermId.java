package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * CommonAncestorCvtermId generated by hbm2java
 */
public class CommonAncestorCvtermId implements java.io.Serializable {

	private Integer cvterm1Id;
	private Integer cvterm2Id;
	private Integer ancestorCvtermId;
	private Integer pathdistance1;
	private Integer pathdistance2;
	private Integer totalPathdistance;

	public CommonAncestorCvtermId() {
	}

	public CommonAncestorCvtermId(Integer cvterm1Id, Integer cvterm2Id,
			Integer ancestorCvtermId, Integer pathdistance1,
			Integer pathdistance2, Integer totalPathdistance) {
		this.cvterm1Id = cvterm1Id;
		this.cvterm2Id = cvterm2Id;
		this.ancestorCvtermId = ancestorCvtermId;
		this.pathdistance1 = pathdistance1;
		this.pathdistance2 = pathdistance2;
		this.totalPathdistance = totalPathdistance;
	}

	public Integer getCvterm1Id() {
		return this.cvterm1Id;
	}

	public void setCvterm1Id(Integer cvterm1Id) {
		this.cvterm1Id = cvterm1Id;
	}

	public Integer getCvterm2Id() {
		return this.cvterm2Id;
	}

	public void setCvterm2Id(Integer cvterm2Id) {
		this.cvterm2Id = cvterm2Id;
	}

	public Integer getAncestorCvtermId() {
		return this.ancestorCvtermId;
	}

	public void setAncestorCvtermId(Integer ancestorCvtermId) {
		this.ancestorCvtermId = ancestorCvtermId;
	}

	public Integer getPathdistance1() {
		return this.pathdistance1;
	}

	public void setPathdistance1(Integer pathdistance1) {
		this.pathdistance1 = pathdistance1;
	}

	public Integer getPathdistance2() {
		return this.pathdistance2;
	}

	public void setPathdistance2(Integer pathdistance2) {
		this.pathdistance2 = pathdistance2;
	}

	public Integer getTotalPathdistance() {
		return this.totalPathdistance;
	}

	public void setTotalPathdistance(Integer totalPathdistance) {
		this.totalPathdistance = totalPathdistance;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommonAncestorCvtermId))
			return false;
		CommonAncestorCvtermId castOther = (CommonAncestorCvtermId) other;

		return ((this.getCvterm1Id() == castOther.getCvterm1Id()) || (this
				.getCvterm1Id() != null && castOther.getCvterm1Id() != null && this
				.getCvterm1Id().equals(castOther.getCvterm1Id())))
				&& ((this.getCvterm2Id() == castOther.getCvterm2Id()) || (this
						.getCvterm2Id() != null
						&& castOther.getCvterm2Id() != null && this
						.getCvterm2Id().equals(castOther.getCvterm2Id())))
				&& ((this.getAncestorCvtermId() == castOther
						.getAncestorCvtermId()) || (this.getAncestorCvtermId() != null
						&& castOther.getAncestorCvtermId() != null && this
						.getAncestorCvtermId().equals(
								castOther.getAncestorCvtermId())))
				&& ((this.getPathdistance1() == castOther.getPathdistance1()) || (this
						.getPathdistance1() != null
						&& castOther.getPathdistance1() != null && this
						.getPathdistance1()
						.equals(castOther.getPathdistance1())))
				&& ((this.getPathdistance2() == castOther.getPathdistance2()) || (this
						.getPathdistance2() != null
						&& castOther.getPathdistance2() != null && this
						.getPathdistance2()
						.equals(castOther.getPathdistance2())))
				&& ((this.getTotalPathdistance() == castOther
						.getTotalPathdistance()) || (this
						.getTotalPathdistance() != null
						&& castOther.getTotalPathdistance() != null && this
						.getTotalPathdistance().equals(
								castOther.getTotalPathdistance())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCvterm1Id() == null ? 0 : this.getCvterm1Id().hashCode());
		result = 37 * result
				+ (getCvterm2Id() == null ? 0 : this.getCvterm2Id().hashCode());
		result = 37
				* result
				+ (getAncestorCvtermId() == null ? 0 : this
						.getAncestorCvtermId().hashCode());
		result = 37
				* result
				+ (getPathdistance1() == null ? 0 : this.getPathdistance1()
						.hashCode());
		result = 37
				* result
				+ (getPathdistance2() == null ? 0 : this.getPathdistance2()
						.hashCode());
		result = 37
				* result
				+ (getTotalPathdistance() == null ? 0 : this
						.getTotalPathdistance().hashCode());
		return result;
	}

}