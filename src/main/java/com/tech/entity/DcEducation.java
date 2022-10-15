package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DcEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eduId;
	private Integer caseNumber;
	private String highestQual;
	private Integer gradYear;

	public Integer getEduId() {
		return eduId;
	}

	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getHighestQual() {
		return highestQual;
	}

	public void setHighestQual(String highestQual) {
		this.highestQual = highestQual;
	}

	public Integer getGradYear() {
		return gradYear;
	}

	public void setGradYear(Integer gradYear) {
		this.gradYear = gradYear;
	}

	public DcEducation(Integer eduId, Integer caseNumber, String highestQual, Integer gradYear) {
		super();
		this.eduId = eduId;
		this.caseNumber = caseNumber;
		this.highestQual = highestQual;
		this.gradYear = gradYear;
	}

	public DcEducation() {
		// TODO Auto-generated constructor stub
	}
}
