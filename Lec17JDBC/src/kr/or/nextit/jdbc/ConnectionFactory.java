package kr.or.nextit.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	String driver;
	String url;
	String user;
	String password;
	int maxTotal;
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	public static ConnectionFactory getInstance() {
		if(instance == null) {
			instance = new ConnectionFactory();
			
		}
		return instance;
	}
	
	public ConnectionFactory() {
		
		try {
			
			Properties prop = new Properties();
			
			prop.load(new FileInputStream("src/db.properties"));
			
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			
			if(prop.getProperty("maxTotal") != null) {
				maxTotal = Integer.parseInt(prop.getProperty("maxTotal"));
			}
			// JDBC 드라이버 로딩.
			Class.forName(driver);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
		public Connection getConnection() throws SQLException{
			
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		}
		
		public int getmaxTotal() {
			return maxTotal;
		}
	}
