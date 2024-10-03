package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtn {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male = driver.findElement(By.id("male"));
		male.click();
		
		
	//	WebElement sunday = driver.findElement(By.id("sunday"));
		//sunday.click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input'  and @type = 'checkbox']"));
		
		
		for( WebElement checkbox:checkboxes) {
			
			String idValue = checkbox.getAttribute("id");
			if(idValue.equals("sunday") ||  idValue.equals("saturday")) {
			
			checkbox.click();
			
			}
			
			boolean selected = checkbox.isSelected();
			System.out.println(selected);
			
		}
	}

}
