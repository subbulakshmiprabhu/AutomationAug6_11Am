package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class ImplicitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
	}

}
