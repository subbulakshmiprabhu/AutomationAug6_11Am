package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.LoginPage;

public class BaseClass {
	public static WebDriver driver ;
	public static LoginPage loginPage = new LoginPage();
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
