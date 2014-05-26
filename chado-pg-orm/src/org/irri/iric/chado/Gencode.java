package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Gencode generated by hbm2java
 */
public class Gencode implements java.io.Serializable {

	private int gencodeId;
	private String organismstr;
	private Set gencodeCodonAas = new HashSet(0);
	private Set gencodeStartcodons = new HashSet(0);

	public Gencode() {
	}

	public Gencode(int gencodeId, String organismstr) {
		this.gencodeId = gencodeId;
		this.organismstr = organismstr;
	}

	public Gencode(int gencodeId, String organismstr, Set gencodeCodonAas,
			Set gencodeStartcodons) {
		this.gencodeId = gencodeId;
		this.organismstr = organismstr;
		this.gencodeCodonAas = gencodeCodonAas;
		this.gencodeStartcodons = gencodeStartcodons;
	}

	public int getGencodeId() {
		return this.gencodeId;
	}

	public void setGencodeId(int gencodeId) {
		this.gencodeId = gencodeId;
	}

	public String getOrganismstr() {
		return this.organismstr;
	}

	public void setOrganismstr(String organismstr) {
		this.organismstr = organismstr;
	}

	public Set getGencodeCodonAas() {
		return this.gencodeCodonAas;
	}

	public void setGencodeCodonAas(Set gencodeCodonAas) {
		this.gencodeCodonAas = gencodeCodonAas;
	}

	public Set getGencodeStartcodons() {
		return this.gencodeStartcodons;
	}

	public void setGencodeStartcodons(Set gencodeStartcodons) {
		this.gencodeStartcodons = gencodeStartcodons;
	}

}
