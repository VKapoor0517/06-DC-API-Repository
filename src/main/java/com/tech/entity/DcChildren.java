package com.tech.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DcChildren {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer childrenId;
	private Integer caseNumber;
	private Date childrenDob;
	private Integer childrenSsn;

	public Integer getChildrenId() {
		return childrenId;
	}

	public void setChildrenId(Integer childrenId) {
		this.childrenId = childrenId;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Date getChildrenDob() {
		return childrenDob;
	}

	public void setChildrenDob(Date childrenDob) {
		this.childrenDob = childrenDob;
	}

	public Integer getChildrenSsn() {
		return childrenSsn;
	}

	public void setChildrenSsn(Integer childrenSsn) {
		this.childrenSsn = childrenSsn;
	}

	public DcChildren(Integer childrenId, Integer caseNumber, Date childrenDob, Integer childrenSsn) {
		super();
		this.childrenId = childrenId;
		this.caseNumber = caseNumber;
		this.childrenDob = childrenDob;
		this.childrenSsn = childrenSsn;
	}

	public DcChildren() {
		// TODO Auto-generated constructor stub
	}
}
