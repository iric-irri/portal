package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Acquisition generated by hbm2java
 */
public class Acquisition implements java.io.Serializable {

	private int acquisitionId;
	private Channel channel;
	private Protocol protocol;
	private Assay assay;
	private Date acquisitiondate;
	private String name;
	private String uri;
	private Set acquisitionprops = new HashSet(0);
	private Set acquisitionRelationshipsForSubjectId = new HashSet(0);
	private Set quantifications = new HashSet(0);
	private Set acquisitionRelationshipsForObjectId = new HashSet(0);

	public Acquisition() {
	}

	public Acquisition(int acquisitionId, Assay assay) {
		this.acquisitionId = acquisitionId;
		this.assay = assay;
	}

	public Acquisition(int acquisitionId, Channel channel, Protocol protocol,
			Assay assay, Date acquisitiondate, String name, String uri,
			Set acquisitionprops, Set acquisitionRelationshipsForSubjectId,
			Set quantifications, Set acquisitionRelationshipsForObjectId) {
		this.acquisitionId = acquisitionId;
		this.channel = channel;
		this.protocol = protocol;
		this.assay = assay;
		this.acquisitiondate = acquisitiondate;
		this.name = name;
		this.uri = uri;
		this.acquisitionprops = acquisitionprops;
		this.acquisitionRelationshipsForSubjectId = acquisitionRelationshipsForSubjectId;
		this.quantifications = quantifications;
		this.acquisitionRelationshipsForObjectId = acquisitionRelationshipsForObjectId;
	}

	public int getAcquisitionId() {
		return this.acquisitionId;
	}

	public void setAcquisitionId(int acquisitionId) {
		this.acquisitionId = acquisitionId;
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Protocol getProtocol() {
		return this.protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public Assay getAssay() {
		return this.assay;
	}

	public void setAssay(Assay assay) {
		this.assay = assay;
	}

	public Date getAcquisitiondate() {
		return this.acquisitiondate;
	}

	public void setAcquisitiondate(Date acquisitiondate) {
		this.acquisitiondate = acquisitiondate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Set getAcquisitionprops() {
		return this.acquisitionprops;
	}

	public void setAcquisitionprops(Set acquisitionprops) {
		this.acquisitionprops = acquisitionprops;
	}

	public Set getAcquisitionRelationshipsForSubjectId() {
		return this.acquisitionRelationshipsForSubjectId;
	}

	public void setAcquisitionRelationshipsForSubjectId(
			Set acquisitionRelationshipsForSubjectId) {
		this.acquisitionRelationshipsForSubjectId = acquisitionRelationshipsForSubjectId;
	}

	public Set getQuantifications() {
		return this.quantifications;
	}

	public void setQuantifications(Set quantifications) {
		this.quantifications = quantifications;
	}

	public Set getAcquisitionRelationshipsForObjectId() {
		return this.acquisitionRelationshipsForObjectId;
	}

	public void setAcquisitionRelationshipsForObjectId(
			Set acquisitionRelationshipsForObjectId) {
		this.acquisitionRelationshipsForObjectId = acquisitionRelationshipsForObjectId;
	}

}
