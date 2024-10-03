package waitDemo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import basic.BaseClass;

public class FluentDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Wait<WebDriver> wait = new FluentWait<>(driver).
				withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(5)).
				ignoring(Exception.class);
		
		
		WebElement username = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				WebElement user = driver.findElement(By.name("username"));
				return user;
			}
		});
		
		username.sendKeys("Admin");
	}

}
