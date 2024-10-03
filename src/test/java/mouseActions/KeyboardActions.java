package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class KeyboardActions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		
		Actions act = new Actions(driver);		
		
		// act.moveToElement(email).click().sendKeys("selenium").perform();
		
		act.sendKeys(email, "selenium").perform();
		//act.sendKeys("selenium").perform();
		
		//Select the text CTRL+a
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//copy the text ctrl+c
		
		
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//press tab key
		act.sendKeys(Keys.TAB).perform();
		
		//ctrl+v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").sendKeys(Keys.NULL).perform();
		
		//System.out.println(password.getAttribute("value"));
		
		
		//double tab and press enter key
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		
		
		
	
	}

}
