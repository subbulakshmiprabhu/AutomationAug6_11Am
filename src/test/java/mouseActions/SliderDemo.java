package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class SliderDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min = driver.findElement(By.xpath("(//span[@class = 'ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		WebElement max= driver.findElement(By.xpath("(//span[@class = 'ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		
		
		Point minLocation = min.getLocation();
		System.out.println(minLocation);
		Point maxLocation = max.getLocation();
		System.out.println(maxLocation);
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min, 100, 250).perform();
		act.dragAndDropBy(max, -100, 250).perform();
		System.out.println(max.getLocation());
		
	}

}
