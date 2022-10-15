package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.DcChildren;

@Repository
public interface DcChlidrenRepo extends JpaRepository<DcChildren, Integer>{

}
