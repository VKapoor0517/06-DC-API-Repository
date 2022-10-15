package com.tech.service;

import java.util.List;

import com.tech.binding.Plans;
import com.tech.entity.DcChildren;
import com.tech.entity.DcEducation;
import com.tech.entity.DcIncome;

public interface DcService {

	public List<Plans> getAllPlans();
	public boolean verifyApplication(Integer caseNumber);
	public void saveIncomeDetails(DcIncome dcIncome);
	public void saveEducationDetails(DcEducation dcEdu);
	public void saveChildrenDetails(List<DcChildren> children);
}
