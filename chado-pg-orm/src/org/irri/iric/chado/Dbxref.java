package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Dbxref generated by hbm2java
 */
public class Dbxref implements java.io.Serializable {

	private int dbxrefId;
	private String version;
	private Db db;
	private String accession;
	private String description;
	private Set featureCvtermDbxrefs = new HashSet(0);
	private Set biomaterialDbxrefs = new HashSet(0);
	private Set biomaterials = new HashSet(0);
	private Set phylotrees = new HashSet(0);
	private Set studies = new HashSet(0);
	private Set organismDbxrefs = new HashSet(0);
	private Set phylonodeDbxrefs = new HashSet(0);
	private Set cvtermDbxrefs = new HashSet(0);
	private Set elements = new HashSet(0);
	private Set featureDbxrefs = new HashSet(0);
	private Set features = new HashSet(0);
	private Set arraydesigns = new HashSet(0);
	private Set pubDbxrefs = new HashSet(0);
	private Set stocks = new HashSet(0);
	private Set cellLineDbxrefs = new HashSet(0);
	private Set cvterms = new HashSet(0);
	private Set libraryDbxrefs = new HashSet(0);
	private Set stockDbxrefs = new HashSet(0);
	private Set ndExperimentDbxrefs = new HashSet(0);
	private Set protocols = new HashSet(0);
	private Set assays = new HashSet(0);
	private Set ndExperimentStockDbxrefs = new HashSet(0);
	private Set dbxrefprops = new HashSet(0);

	public Dbxref() {
	}

	public Dbxref(int dbxrefId, Db db, String accession) {
		this.dbxrefId = dbxrefId;
		this.db = db;
		this.accession = accession;
	}

	public Dbxref(int dbxrefId, Db db, String accession, String description,
			Set featureCvtermDbxrefs, Set biomaterialDbxrefs, Set biomaterials,
			Set phylotrees, Set studies, Set organismDbxrefs,
			Set phylonodeDbxrefs, Set cvtermDbxrefs, Set elements,
			Set featureDbxrefs, Set features, Set arraydesigns, Set pubDbxrefs,
			Set stocks, Set cellLineDbxrefs, Set cvterms, Set libraryDbxrefs,
			Set stockDbxrefs, Set ndExperimentDbxrefs, Set protocols,
			Set assays, Set ndExperimentStockDbxrefs, Set dbxrefprops) {
		this.dbxrefId = dbxrefId;
		this.db = db;
		this.accession = accession;
		this.description = description;
		this.featureCvtermDbxrefs = featureCvtermDbxrefs;
		this.biomaterialDbxrefs = biomaterialDbxrefs;
		this.biomaterials = biomaterials;
		this.phylotrees = phylotrees;
		this.studies = studies;
		this.organismDbxrefs = organismDbxrefs;
		this.phylonodeDbxrefs = phylonodeDbxrefs;
		this.cvtermDbxrefs = cvtermDbxrefs;
		this.elements = elements;
		this.featureDbxrefs = featureDbxrefs;
		this.features = features;
		this.arraydesigns = arraydesigns;
		this.pubDbxrefs = pubDbxrefs;
		this.stocks = stocks;
		this.cellLineDbxrefs = cellLineDbxrefs;
		this.cvterms = cvterms;
		this.libraryDbxrefs = libraryDbxrefs;
		this.stockDbxrefs = stockDbxrefs;
		this.ndExperimentDbxrefs = ndExperimentDbxrefs;
		this.protocols = protocols;
		this.assays = assays;
		this.ndExperimentStockDbxrefs = ndExperimentStockDbxrefs;
		this.dbxrefprops = dbxrefprops;
	}

	public int getDbxrefId() {
		return this.dbxrefId;
	}

	public void setDbxrefId(int dbxrefId) {
		this.dbxrefId = dbxrefId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Db getDb() {
		return this.db;
	}

	public void setDb(Db db) {
		this.db = db;
	}

	public String getAccession() {
		return this.accession;
	}

	public void setAccession(String accession) {
		this.accession = accession;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getFeatureCvtermDbxrefs() {
		return this.featureCvtermDbxrefs;
	}

	public void setFeatureCvtermDbxrefs(Set featureCvtermDbxrefs) {
		this.featureCvtermDbxrefs = featureCvtermDbxrefs;
	}

	public Set getBiomaterialDbxrefs() {
		return this.biomaterialDbxrefs;
	}

	public void setBiomaterialDbxrefs(Set biomaterialDbxrefs) {
		this.biomaterialDbxrefs = biomaterialDbxrefs;
	}

	public Set getBiomaterials() {
		return this.biomaterials;
	}

	public void setBiomaterials(Set biomaterials) {
		this.biomaterials = biomaterials;
	}

	public Set getPhylotrees() {
		return this.phylotrees;
	}

	public void setPhylotrees(Set phylotrees) {
		this.phylotrees = phylotrees;
	}

	public Set getStudies() {
		return this.studies;
	}

	public void setStudies(Set studies) {
		this.studies = studies;
	}

	public Set getOrganismDbxrefs() {
		return this.organismDbxrefs;
	}

	public void setOrganismDbxrefs(Set organismDbxrefs) {
		this.organismDbxrefs = organismDbxrefs;
	}

	public Set getPhylonodeDbxrefs() {
		return this.phylonodeDbxrefs;
	}

	public void setPhylonodeDbxrefs(Set phylonodeDbxrefs) {
		this.phylonodeDbxrefs = phylonodeDbxrefs;
	}

	public Set getCvtermDbxrefs() {
		return this.cvtermDbxrefs;
	}

	public void setCvtermDbxrefs(Set cvtermDbxrefs) {
		this.cvtermDbxrefs = cvtermDbxrefs;
	}

	public Set getElements() {
		return this.elements;
	}

	public void setElements(Set elements) {
		this.elements = elements;
	}

	public Set getFeatureDbxrefs() {
		return this.featureDbxrefs;
	}

	public void setFeatureDbxrefs(Set featureDbxrefs) {
		this.featureDbxrefs = featureDbxrefs;
	}

	public Set getFeatures() {
		return this.features;
	}

	public void setFeatures(Set features) {
		this.features = features;
	}

	public Set getArraydesigns() {
		return this.arraydesigns;
	}

	public void setArraydesigns(Set arraydesigns) {
		this.arraydesigns = arraydesigns;
	}

	public Set getPubDbxrefs() {
		return this.pubDbxrefs;
	}

	public void setPubDbxrefs(Set pubDbxrefs) {
		this.pubDbxrefs = pubDbxrefs;
	}

	public Set getStocks() {
		return this.stocks;
	}

	public void setStocks(Set stocks) {
		this.stocks = stocks;
	}

	public Set getCellLineDbxrefs() {
		return this.cellLineDbxrefs;
	}

	public void setCellLineDbxrefs(Set cellLineDbxrefs) {
		this.cellLineDbxrefs = cellLineDbxrefs;
	}

	public Set getCvterms() {
		return this.cvterms;
	}

	public void setCvterms(Set cvterms) {
		this.cvterms = cvterms;
	}

	public Set getLibraryDbxrefs() {
		return this.libraryDbxrefs;
	}

	public void setLibraryDbxrefs(Set libraryDbxrefs) {
		this.libraryDbxrefs = libraryDbxrefs;
	}

	public Set getStockDbxrefs() {
		return this.stockDbxrefs;
	}

	public void setStockDbxrefs(Set stockDbxrefs) {
		this.stockDbxrefs = stockDbxrefs;
	}

	public Set getNdExperimentDbxrefs() {
		return this.ndExperimentDbxrefs;
	}

	public void setNdExperimentDbxrefs(Set ndExperimentDbxrefs) {
		this.ndExperimentDbxrefs = ndExperimentDbxrefs;
	}

	public Set getProtocols() {
		return this.protocols;
	}

	public void setProtocols(Set protocols) {
		this.protocols = protocols;
	}

	public Set getAssays() {
		return this.assays;
	}

	public void setAssays(Set assays) {
		this.assays = assays;
	}

	public Set getNdExperimentStockDbxrefs() {
		return this.ndExperimentStockDbxrefs;
	}

	public void setNdExperimentStockDbxrefs(Set ndExperimentStockDbxrefs) {
		this.ndExperimentStockDbxrefs = ndExperimentStockDbxrefs;
	}

	public Set getDbxrefprops() {
		return this.dbxrefprops;
	}

	public void setDbxrefprops(Set dbxrefprops) {
		this.dbxrefprops = dbxrefprops;
	}

}
