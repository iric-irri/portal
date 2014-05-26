package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * NdGeolocation generated by hbm2java
 */
public class NdGeolocation implements java.io.Serializable {

	private int ndGeolocationId;
	private String description;
	private Float latitude;
	private Float longitude;
	private String geodeticDatum;
	private Float altitude;
	private Set ndGeolocationprops = new HashSet(0);
	private Set ndExperiments = new HashSet(0);

	public NdGeolocation() {
	}

	public NdGeolocation(int ndGeolocationId) {
		this.ndGeolocationId = ndGeolocationId;
	}

	public NdGeolocation(int ndGeolocationId, String description,
			Float latitude, Float longitude, String geodeticDatum,
			Float altitude, Set ndGeolocationprops, Set ndExperiments) {
		this.ndGeolocationId = ndGeolocationId;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.geodeticDatum = geodeticDatum;
		this.altitude = altitude;
		this.ndGeolocationprops = ndGeolocationprops;
		this.ndExperiments = ndExperiments;
	}

	public int getNdGeolocationId() {
		return this.ndGeolocationId;
	}

	public void setNdGeolocationId(int ndGeolocationId) {
		this.ndGeolocationId = ndGeolocationId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public String getGeodeticDatum() {
		return this.geodeticDatum;
	}

	public void setGeodeticDatum(String geodeticDatum) {
		this.geodeticDatum = geodeticDatum;
	}

	public Float getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}

	public Set getNdGeolocationprops() {
		return this.ndGeolocationprops;
	}

	public void setNdGeolocationprops(Set ndGeolocationprops) {
		this.ndGeolocationprops = ndGeolocationprops;
	}

	public Set getNdExperiments() {
		return this.ndExperiments;
	}

	public void setNdExperiments(Set ndExperiments) {
		this.ndExperiments = ndExperiments;
	}

}
