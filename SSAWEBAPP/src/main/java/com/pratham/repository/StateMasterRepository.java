package com.pratham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratham.model.StateMaster;

@Repository
public interface StateMasterRepository extends JpaRepository<StateMaster, Integer> {
	

	

}
