package com.pknu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	PreparedStatement pstmt;		// An object that represents a precompiled SQL statement.
	
	public void test() {
		try {
			// ��Ÿ�ӽ� Ŭ������ �޸𸮿� �ø��� ��� : reflection > OracleDriver.class loading > return Instance
			Class.forName("oracle.jdbc.driver.OracleDriver");	// �ܺο� �ִ� jar������ Ŭ������ ����ϱ� ����.
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection conn = DriverManager.getConnection(url, "hr", "1234");	// Parameter: url, user, password
			pstmt = conn.prepareStatement("select * from employees");			// ������ ����
			// select��: executeQuery()
			// insert, update, delete��: execueteUpdate()
			ResultSet resultSet = pstmt.executeQuery();

			while(resultSet.next()) {
				String firstName = resultSet.getString("first_name");	// Parameter: String columnLabel
				// columnIndex�� 1���� ������.
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
