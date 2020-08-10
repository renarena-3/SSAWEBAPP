package com.pratham.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pratham.model.SSAEntityMaster;
import com.pratham.repository.SSAEntyMasterRepository;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private SSAEntyMasterRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		SSAEntityMaster sem=new SSAEntityMaster();
		sem.setFirstname("Shiva");
		sem.setLastname("Rena");
		//sem.setCityzenid(cityzenid);
		//sem.setDob("03071997");
		sem.setState("TEL");
		SSAEntityMaster savedEntity = repo.save(sem);
		System.out.println("savedEntity "+savedEntity);
	}

}
