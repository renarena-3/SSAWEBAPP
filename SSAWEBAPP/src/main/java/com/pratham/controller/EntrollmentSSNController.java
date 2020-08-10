package com.pratham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.model.SSAEntityMaster;
import com.pratham.service.SSNEntrolmentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/ssn") //
public class EntrollmentSSNController {

	@Autowired
	private SSNEntrolmentService ssnentrolmentService;

	/**
	 * findAllStates() method
	 * 
	 * Purpose:to fetch all states for dropdown field
	 * 
	 * Created On:07/August/2020
	 * 
	 * Modified On:
	 * 
	 * @return Object
	 */
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public Object findAllStates() {
		Object findAllStates = ssnentrolmentService.findAllStates();
		return findAllStates;
	}

	/**
	 * regForSnn() method.
	 * 
	 * Purpose: to generate ssn number for citigens.
	 * 
	 * reated On: 07/AUGUST/2020
	 * 
	 * Modified On:
	 * 
	 * @param custoInfo
	 * 
	 * @return SSN
	 */
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public Long regForSnn(@RequestBody SSAEntityMaster custoInfo) {
		System.out.println("custoInfo " + custoInfo);
		Long ssn = (Long) ssnentrolmentService.regForSsn(custoInfo);
		System.out.println("ssn " + ssn);
		return ssn;

	}

}
