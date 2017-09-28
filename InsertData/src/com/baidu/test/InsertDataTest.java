package com.baidu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class InsertDataTest implements Runnable {

	@Override
	public void run() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testRedis", "root", "root");
			String sql = "insert into test values(?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			for (long i = 0; i < 300000; i++) {
				prepareStatement.setString(1, null);
				prepareStatement.setString(2, UUID.randomUUID().toString());
				prepareStatement.execute();
			}
			prepareStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
