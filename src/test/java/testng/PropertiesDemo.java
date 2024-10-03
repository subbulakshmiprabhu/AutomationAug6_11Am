package testng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println(System.getProperty("user.dir"));
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
	}

}
