package com.connection.JDBCPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPostgresApplication {
	
	public static void main(String args[]) throws SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/bank";
		
		Connection connection =DriverManager.getConnection(url, "postgres", "admin");
		System.out.println("DB Connectoin is successfully create..."+connection);
		
		Statement statementObj = connection.createStatement();
		
		String qry="Select * from account";
		
		ResultSet rsObj = statementObj.executeQuery(qry);
		
		while(rsObj.next()) {
			System.out.println(rsObj.getString(1)+" "+rsObj.getString(2)+" "+rsObj.getString(3));
		}
		
		
	}

}