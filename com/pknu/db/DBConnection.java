package com.pknu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	PreparedStatement pstmt;		// An object that represents a precompiled SQL statement.
	
	public void test() {
		try {
			// 런타임시 클래스를 메모리에 올리는 방법 : reflection > OracleDriver.class loading > return Instance
			Class.forName("oracle.jdbc.driver.OracleDriver");	// 외부에 있는 jar파일의 클래스를 사용하기 위함.
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection conn = DriverManager.getConnection(url, "hr", "1234");	// Parameter: url, user, password
			pstmt = conn.prepareStatement("select * from employees");			// 쿼리문 심음
			// select문: executeQuery()
			// insert, update, delete문: execueteUpdate()
			ResultSet resultSet = pstmt.executeQuery();

			while(resultSet.next()) {
				String firstName = resultSet.getString("first_name");	// Parameter: String columnLabel
				// columnIndex는 1부터 시작함.
				String lastName = resultSet.getString(3);					// Parameter: Int columnIndex
				System.out.print(firstName+" "+lastName);
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();
		dbc.test();
	}
}
