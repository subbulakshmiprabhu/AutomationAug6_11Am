package waitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.BaseClass;

public class ExplicitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
         WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
		
		
		
	}

}
