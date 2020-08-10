package com.pratham.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "SSA_MASTER")
@Data
public class SSAEntityMaster {

	@Id
	/*
	 * @GenericGenerator(name="ssn_id_seq",strategy =
	 * "com.pratham.util.SSNIdGenerator")
	 * 
	 * @GeneratedValue(generator = "ssn_id_seq")
	 */
	@GeneratedValue
	@Column(name = "SSN")
	private Long ssn;
	
	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;
	
	@Column(name = "GENDER")
	private char gender;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name="CREATED_DATE",updatable = false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updateDate;
}
