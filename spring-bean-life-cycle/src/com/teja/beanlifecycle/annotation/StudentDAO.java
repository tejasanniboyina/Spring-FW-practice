package com.teja.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.*;

public class StudentDAO {
	private String driver;
	private String username ;
	private String password;
	
	Connection connection = null;
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private String url ;
	

	public void createConnection() throws ClassNotFoundException, SQLException{
		// loadDriver
				Class.forName(driver);

				// getConnection
				 connection = DriverManager.getConnection(url, username, password);

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
	
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("Select * from esnew.hostelstudentinfo");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			double fee = rs.getDouble(3);
			String type = rs.getString(4);
			System.out.println(id + " " + name + " " + fee + " " + type);

		}
		closeConnection();
	
	}

	public void deleteStudentRecord(int id,Connection connection) throws ClassNotFoundException, SQLException {
		
		createConnection();
		Statement statement = connection.createStatement();

		statement.executeUpdate("delete from esnew.hostelstudentinfo where id= " + id);

		System.out.println("Record deleted with id " + id);

		closeConnection();
		
		
		

	}
	
	public void closeConnection() throws SQLException {
		connection.close();
	}
}
