package main.com.oracleDB.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ServiceUtil {
	static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Success!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##APPLE", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
