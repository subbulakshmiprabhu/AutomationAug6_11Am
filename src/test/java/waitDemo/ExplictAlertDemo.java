package waitDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.BaseClass;

public class ExplictAlertDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
	}
}
