package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryDemo {
	@FindBy(id = "email")
	public static WebElement username;
	
	@FindBy (id ="pass")
	public static WebElement password;
	
	@FindBy(name = "login")
	public static WebElement login;
	@Test
	public void setUp() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, PageFactoryDemo.class);
		
		username.sendKeys("selenium");
		password.sendKeys("123");
		login.click();
		
		
		
		
	}

}
