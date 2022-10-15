package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.DcEducation;

@Repository
public interface DcEducationRepo extends JpaRepository<DcEducation, Integer>{

}
