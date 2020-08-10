package com.pratham.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pratham.model.SSAEntityMaster;

@Repository
public interface SSAEntyMasterRepository extends CrudRepository<SSAEntityMaster, Long> {
	
	public SSAEntityMaster findByStateAndSsn(String state,Long ssn);

}
