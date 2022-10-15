package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DcCases {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer caseId;
	private Integer caseNumber;
	private Integer appId;
	private Integer planId;

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public DcCases(Integer caseId, Integer caseNumber, Integer appId, Integer planId) {
		super();
		this.caseId = caseId;
		this.caseNumber = caseNumber;
		this.appId = appId;
		this.planId = planId;
	}

	public DcCases() {
		// TODO Auto-generated constructor stub
	}
}
