package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLoginWithParameters {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority =2)
	@Parameters({"username", "password"})
	public void login(String name, String word) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(word);
		driver.findElement(By.name("login")).click();
	}
	@Test(priority = 1)
	public void checkTitle() {
	
		String expectedTitle= "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		//driver.close();
	}

}
