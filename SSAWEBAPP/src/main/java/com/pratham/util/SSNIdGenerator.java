package com.pratham.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SSNIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	String suffix="";
	int val=0;
		try {
			Connection con = session.connection();
			Statement stmt = con.createStatement();
			String sql="select next value for ssn_id_seq";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("rs "+rs);
			 if(rs.next()) {
	        	 val=rs.getInt(1);
	              suffix=((val<1)?"SSN00"+val:(val<99)?"SSN0"+val:"SSN"+val);
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return suffix;
	}

	
	
}
