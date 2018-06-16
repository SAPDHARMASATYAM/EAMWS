package in.co.examsadda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataSource {
	static Connection connection=null;
	static Properties properties;
	
	
	public static Connection getConnection() throws Exception {
		System.out.println("Inside getConnection method");
		String driverClass;
		String url=null;
		String useName=null;
		String password=null;
		
		try {
			properties = PropertiesUtil.getProperties();
			driverClass = properties.getProperty("jdbc.DriverClass");
			url = properties.getProperty("jdbc.URL");
			useName = properties.getProperty("jdbc.UserName");
			password = properties.getProperty("jdbc.password");
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, useName, password);
		} catch (Exception e) {
			throw e;
		}
		
		return connection;
	}
}
