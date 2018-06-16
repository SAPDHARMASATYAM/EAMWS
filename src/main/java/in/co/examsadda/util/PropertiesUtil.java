package in.co.examsadda.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class PropertiesUtil {
	@Autowired
	static	Properties properties = new Properties();
	public static Properties getProperties() {
		 System.out.println("Inside PropGetter getProperties");
		try {
			properties.load(new FileInputStream(new File("E:\\Exams Adda Work Space\\AES\\src\\main\\resources\\solution.properties")));
			//properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("solution.properties"));
			System.out.println("properties ::"+properties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	public static String getProperty(String propertyName) {
		return properties.getProperty(propertyName); 
	}
}
