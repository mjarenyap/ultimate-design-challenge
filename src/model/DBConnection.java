package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private String	driverName	= "com.mysql.jdbc.Driver";// change
	private String	url			= "jdbc:mysql://localhost:3306/";// change
	/* Database is not in the machine */
	private String	database	= "udc";// change
	private String	username	= "root";// change
	private String	password	= "1234";// change
	private Connection con;
	
	public Connection getConnection() {
		try {
			con = DriverManager
					.getConnection(getUrl() + getDatabase() + "?useSSL=false", getUsername(), getPassword());
			System.out.println("DBConnection::Connection SUCCESS");
			return con;
		} catch (Exception ex) {
			System.out.println("Exception Caught::Unable to connect to " + getUrl() + getDatabase());
		}
		return null;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
	public void close() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}