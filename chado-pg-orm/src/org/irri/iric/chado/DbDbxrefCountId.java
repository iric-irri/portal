package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * DbDbxrefCountId generated by hbm2java
 */
public class DbDbxrefCountId implements java.io.Serializable {

	private String name;
	private Long numDbxrefs;

	public DbDbxrefCountId() {
	}

	public DbDbxrefCountId(String name, Long numDbxrefs) {
		this.name = name;
		this.numDbxrefs = numDbxrefs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumDbxrefs() {
		return this.numDbxrefs;
	}

	public void setNumDbxrefs(Long numDbxrefs) {
		this.numDbxrefs = numDbxrefs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DbDbxrefCountId))
			return false;
		DbDbxrefCountId castOther = (DbDbxrefCountId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getNumDbxrefs() == castOther.getNumDbxrefs()) || (this
						.getNumDbxrefs() != null
						&& castOther.getNumDbxrefs() != null && this
						.getNumDbxrefs().equals(castOther.getNumDbxrefs())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37
				* result
				+ (getNumDbxrefs() == null ? 0 : this.getNumDbxrefs()
						.hashCode());
		return result;
	}

}
