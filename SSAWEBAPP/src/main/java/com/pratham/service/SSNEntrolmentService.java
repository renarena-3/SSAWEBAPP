package com.pratham.service;

import com.pratham.model.SSAEntityMaster;

public interface SSNEntrolmentService {
	
	public Object findAllStates();
	
	public Long regForSsn(SSAEntityMaster entity);
	
	public SSAEntityMaster findByStateAndSnn(String state,Long ssn);

}
