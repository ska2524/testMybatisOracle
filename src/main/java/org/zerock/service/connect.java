package org.zerock.service;

import java.sql.Connection;
import java.sql.DriverManager;

import org.omg.CORBA.PRIVATE_MEMBER;

public class connect {
	
	
	public static void main(String[] args)throws Exception {
		
		String className ="com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://192.168.0.17/sample_db";
		String userName = "bit92";
		String password = "bit92";
		
		
		Class.forName(className);
		
		Connection con = DriverManager.getConnection(url,userName, password);
		
		
		
		
		
	}
}
