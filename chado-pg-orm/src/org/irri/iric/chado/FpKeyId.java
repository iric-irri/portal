package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * FpKeyId generated by hbm2java
 */
public class FpKeyId implements java.io.Serializable {

	private Integer featureId;
	private String pkey;
	private String value;

	public FpKeyId() {
	}

	public FpKeyId(Integer featureId, String pkey, String value) {
		this.featureId = featureId;
		this.pkey = pkey;
		this.value = value;
	}

	public Integer getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
	}

	public String getPkey() {
		return this.pkey;
	}

	public void setPkey(String pkey) {
		this.pkey = pkey;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FpKeyId))
			return false;
		FpKeyId castOther = (FpKeyId) other;

		return ((this.getFeatureId() == castOther.getFeatureId()) || (this
				.getFeatureId() != null && castOther.getFeatureId() != null && this
				.getFeatureId().equals(castOther.getFeatureId())))
				&& ((this.getPkey() == castOther.getPkey()) || (this.getPkey() != null
						&& castOther.getPkey() != null && this.getPkey()
						.equals(castOther.getPkey())))
				&& ((this.getValue() == castOther.getValue()) || (this
						.getValue() != null && castOther.getValue() != null && this
						.getValue().equals(castOther.getValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFeatureId() == null ? 0 : this.getFeatureId().hashCode());
		result = 37 * result
				+ (getPkey() == null ? 0 : this.getPkey().hashCode());
		result = 37 * result
				+ (getValue() == null ? 0 : this.getValue().hashCode());
		return result;
	}

}
