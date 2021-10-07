package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao {
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root123");
			System.out.println(connection);
			Statement stm= connection.createStatement();
			//int result=stm.executeUpdate("insert into account values(1,'salman','syed',400000)");
			//System.out.println(result );
			
			//int result=stm.executeUpdate("update account set bal=50000 where accno=1");
			//int result=stm.executeUpdate("delete from account where accno =1");
			 ResultSet result=stm.executeQuery("select * from account");
			 while(result.next()) {
				 
				 System.out.println(result.getInt(1));
				 System.out.println(result.getString(2));
				 System.out.println(result.getString(3));
				 System.out.println(result.getInt(4));
			 }
			 connection.close();
			 stm.close();
			result.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
