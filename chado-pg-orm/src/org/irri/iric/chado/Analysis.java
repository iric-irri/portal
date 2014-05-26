package org.irri.iric.chado;

// Generated 05 26, 14 1:29:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Analysis generated by hbm2java
 */
public class Analysis implements java.io.Serializable {

	private int analysisId;
	private String name;
	private String description;
	private String program;
	private String programversion;
	private String algorithm;
	private String sourcename;
	private String sourceversion;
	private String sourceuri;
	private Date timeexecuted;
	private Set analysisprops = new HashSet(0);
	private Set quantifications = new HashSet(0);
	private Set phylotrees = new HashSet(0);
	private Set analysisfeatures = new HashSet(0);

	public Analysis() {
	}

	public Analysis(int analysisId, String program, String programversion,
			Date timeexecuted) {
		this.analysisId = analysisId;
		this.program = program;
		this.programversion = programversion;
		this.timeexecuted = timeexecuted;
	}

	public Analysis(int analysisId, String name, String description,
			String program, String programversion, String algorithm,
			String sourcename, String sourceversion, String sourceuri,
			Date timeexecuted, Set analysisprops, Set quantifications,
			Set phylotrees, Set analysisfeatures) {
		this.analysisId = analysisId;
		this.name = name;
		this.description = description;
		this.program = program;
		this.programversion = programversion;
		this.algorithm = algorithm;
		this.sourcename = sourcename;
		this.sourceversion = sourceversion;
		this.sourceuri = sourceuri;
		this.timeexecuted = timeexecuted;
		this.analysisprops = analysisprops;
		this.quantifications = quantifications;
		this.phylotrees = phylotrees;
		this.analysisfeatures = analysisfeatures;
	}

	public int getAnalysisId() {
		return this.analysisId;
	}

	public void setAnalysisId(int analysisId) {
		this.analysisId = analysisId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getProgramversion() {
		return this.programversion;
	}

	public void setProgramversion(String programversion) {
		this.programversion = programversion;
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getSourcename() {
		return this.sourcename;
	}

	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}

	public String getSourceversion() {
		return this.sourceversion;
	}

	public void setSourceversion(String sourceversion) {
		this.sourceversion = sourceversion;
	}

	public String getSourceuri() {
		return this.sourceuri;
	}

	public void setSourceuri(String sourceuri) {
		this.sourceuri = sourceuri;
	}

	public Date getTimeexecuted() {
		return this.timeexecuted;
	}

	public void setTimeexecuted(Date timeexecuted) {
		this.timeexecuted = timeexecuted;
	}

	public Set getAnalysisprops() {
		return this.analysisprops;
	}

	public void setAnalysisprops(Set analysisprops) {
		this.analysisprops = analysisprops;
	}

	public Set getQuantifications() {
		return this.quantifications;
	}

	public void setQuantifications(Set quantifications) {
		this.quantifications = quantifications;
	}

	public Set getPhylotrees() {
		return this.phylotrees;
	}

	public void setPhylotrees(Set phylotrees) {
		this.phylotrees = phylotrees;
	}

	public Set getAnalysisfeatures() {
		return this.analysisfeatures;
	}

	public void setAnalysisfeatures(Set analysisfeatures) {
		this.analysisfeatures = analysisfeatures;
	}

}
