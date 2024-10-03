package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		
	//	Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.findElement(By.id("confirm")).click();
	//	Thread.sleep(5000);
		
		Alert confirmAlert = driver.switchTo().alert();
		
		confirmAlert.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(5000);
		
		Alert promptAlt = driver.switchTo().alert();
		
		
		System.out.println(promptAlt.getText());
		
		promptAlt.sendKeys("selenium");
		
		promptAlt.accept();
		
		
	}

}
