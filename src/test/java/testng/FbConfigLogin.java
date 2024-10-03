package testng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbConfigLogin {
	@Test
	
	public void setUp() throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		
		
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("login")).click();
	}

}
