package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test(dataProvider = "crendentials")
	public void login(String name, String word) {
		
		
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(word);
		driver.findElement(By.name("login")).click();

	}
	
	@DataProvider(name = "crendentials")
	public Object[][] data() {
		
		Object[][] arr ={ {"testng@gmail.com", "123"}, {"selenium@gmail.com", "456"}};
		return arr;
		
	}

}
