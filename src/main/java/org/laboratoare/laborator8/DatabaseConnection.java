package org.laboratoare.laborator8;

import java.sql.*;

public class DatabaseConnection {

	static Connection conn = null;

	private DatabaseConnection() {

	}

	public static Connection getDatabaseConnection() {
		try {

			if (conn == null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "dba", "sql");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}