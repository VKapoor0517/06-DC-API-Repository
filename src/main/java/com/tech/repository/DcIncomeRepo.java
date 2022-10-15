package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.DcIncome;

@Repository
public interface DcIncomeRepo extends JpaRepository<DcIncome, Integer>{

}
