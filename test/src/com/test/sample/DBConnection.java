package com.test.sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DBConnection 
{

	Driver driver = new oracle.jdbc.driver.OracleDriver();
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userName = "system";
	String password = "system";
	
	List<Integer> list = new ArrayList<Integer>();
	public void m1()
	
	{
		try {
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established successfully"+con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.add(1);
		list.add(1+2);
		list.add(14);
		list.add(18);
		list.add(19);
		list.add(111);
		
		Iterator<Integer> result = list.iterator();
		while(result.hasNext())
		{
			System.out.println(result.next());
		}
	}
	public static void main(String[] args) {
		DBConnection obj = new DBConnection();
		obj.m1();
	}
	}

