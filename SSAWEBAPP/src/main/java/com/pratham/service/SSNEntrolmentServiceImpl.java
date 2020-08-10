package com.pratham.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratham.model.SSAEntityMaster;
import com.pratham.repository.SSAEntyMasterRepository;

@Service
public class SSNEntrolmentServiceImpl implements SSNEntrolmentService {

	@Autowired
	private SSAEntyMasterRepository ssaentymasterRepository;

	@Override
	public Object findAllStates() {

		return ssaentymasterRepository.findAll();
	}

	@Override
	public Long regForSsn(SSAEntityMaster entity) {

		SSAEntityMaster savedEntityMaster = ssaentymasterRepository.save(entity);

		if (savedEntityMaster != null) {
			return savedEntityMaster.getSsn();
		}
		return null;
	}
	
	@Override
	public SSAEntityMaster findByStateAndSnn(String state, Long ssn) {
		SSAEntityMaster ssaEntityMaster = ssaentymasterRepository.findByStateAndSsn(state, ssn);
		return ssaEntityMaster;
	}
}
