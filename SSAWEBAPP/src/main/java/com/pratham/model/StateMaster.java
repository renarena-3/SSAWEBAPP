package com.pratham.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="state_master")
@Entity
@Data
public class StateMaster {
	
	@Id
	@Column(name="STATE_ID")
	private Integer stateid;
	
	@Column(name="STATE_NAME")
	private String statename;

}
