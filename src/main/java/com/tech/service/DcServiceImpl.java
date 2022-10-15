package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.binding.Plans;
import com.tech.entity.DcChildren;
import com.tech.entity.DcEducation;
import com.tech.entity.DcIncome;
import com.tech.repository.DcCaseRepo;

@Service
public class DcServiceImpl implements DcService {

	@Autowired
	private DcCaseRepo repo;
	
	@Override
	public List<Plans> getAllPlans() {
		List<Plans> plan = repo.getAllPlans();
		
		return plan;
	}

	@Override
	public boolean verifyApplication(Integer caseNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveIncomeDetails(DcIncome dcIncome) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveEducationDetails(DcEducation dcEdu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveChildrenDetails(List<DcChildren> children) {
		// TODO Auto-generated method stub

	}

}
