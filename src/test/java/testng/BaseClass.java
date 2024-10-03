package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser"})
	
	public void setUp(String browsername) {
		
		switch(browsername) {
		
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default :
			System.out.println("Enter proper browser name.");
		
		}
		//return driver;
		
	}
	
	@Test
	public void openLink() {
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		
		String expectedTitle = "Facebook – log in or sign up";
		
		System.out.println("Thread id is" + Thread.currentThread().getId());
		
		Assert.assertEquals(actual, expectedTitle);
	}
	

}
