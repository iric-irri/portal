package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

/**
 * LibrarypropPub generated by hbm2java
 */
public class LibrarypropPub implements java.io.Serializable {

	private int librarypropPubId;
	private Pub pub;
	private Libraryprop libraryprop;

	public LibrarypropPub() {
	}

	public LibrarypropPub(int librarypropPubId, Pub pub, Libraryprop libraryprop) {
		this.librarypropPubId = librarypropPubId;
		this.pub = pub;
		this.libraryprop = libraryprop;
	}

	public int getLibrarypropPubId() {
		return this.librarypropPubId;
	}

	public void setLibrarypropPubId(int librarypropPubId) {
		this.librarypropPubId = librarypropPubId;
	}

	public Pub getPub() {
		return this.pub;
	}

	public void setPub(Pub pub) {
		this.pub = pub;
	}

	public Libraryprop getLibraryprop() {
		return this.libraryprop;
	}

	public void setLibraryprop(Libraryprop libraryprop) {
		this.libraryprop = libraryprop;
	}

}