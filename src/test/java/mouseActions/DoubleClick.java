package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class DoubleClick {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		WebElement washington = driver.findElement(By.id("box3"));
		
		WebElement us = driver.findElement(By.id("box103"));
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(washington, us).dragAndDrop(rome, italy).build().perform();
	}

}
