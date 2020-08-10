package com.pratham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.model.SSAEntityMaster;
import com.pratham.service.SSNEntrolmentService;

@RestController
@RequestMapping(path="/validate")
public class ValidatingSSNController {
	
	@Autowired
	private SSNEntrolmentService ssnEnrollmentService;
	

	@RequestMapping(value="/ssn",method = RequestMethod.GET)
	public ResponseEntity<String> validatedSSN(@RequestParam("statename") String state,@RequestParam("ssn") Long ssn) {
		ResponseEntity<String> response=null;
		String body=null;
		SSAEntityMaster ssaEntityMaster = ssnEnrollmentService.findByStateAndSnn(state, ssn);
		System.out.println("ssaEntityMaster "+ssaEntityMaster);
		if(ssaEntityMaster != null) {
			body =" provided ssn number valid";
			response=new ResponseEntity<String>(body,HttpStatus.FOUND);
		}
		else {
			body="provided ssn number not valid";
			response=new ResponseEntity<String>(body,HttpStatus.FORBIDDEN);
		}
		return response;
	}
	
	
}
