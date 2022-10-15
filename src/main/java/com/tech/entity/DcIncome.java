package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DcIncome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incomeId;
	private Integer caseNumber;
	private Integer empIncome;
	private Integer propertyIncome;

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Integer getEmpIncome() {
		return empIncome;
	}

	public void setEmpIncome(Integer empIncome) {
		this.empIncome = empIncome;
	}

	public Integer getPropertyIncome() {
		return propertyIncome;
	}

	public void setPropertyIncome(Integer propertyIncome) {
		this.propertyIncome = propertyIncome;
	}

	public DcIncome(Integer incomeId, Integer caseNumber, Integer empIncome, Integer propertyIncome) {
		super();
		this.incomeId = incomeId;
		this.caseNumber = caseNumber;
		this.empIncome = empIncome;
		this.propertyIncome = propertyIncome;
	}

	public DcIncome() {
		// TODO Auto-generated constructor stub
	}
}
