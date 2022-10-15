package com.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tech.binding.Plans;
import com.tech.entity.DcCases;

@Repository
public interface DcCaseRepo extends JpaRepository<DcCases, Integer> {

	@Query("select a.plan_id as plan_id, a.name as name from plan a left join dc_cases b on a.plan_id != null;")
	List<Plans> getAllPlans();

}
