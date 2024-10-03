package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windowshandling {
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		input.sendKeys("selenium");
		input.sendKeys(Keys.ENTER);
		
		List<WebElement> alltags = driver.findElements(By.xpath("//div[@id ='Wikipedia1_wikipedia-search-results']//a"));
		
		for(WebElement tag:alltags) {
			tag.click();
		}
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		
	/*	for(String handleId:windowHandles) {
			if(!handleId.equals(windowHandle)) { // if  window is not a parent
			driver.switchTo().window(handleId);
			String title = driver.getTitle();
			System.out.println(title);
			}
			
		}*/
		
		//To handle elements in a particular tab
	/*	for(String handleId:windowHandles) {
			if(!handleId.equals(windowHandle)) { 
			driver.switchTo().window(handleId);
			String title = driver.getTitle();
			//System.out.println(title);
			
			if(title.equals("Selenium - Wikipedia")) {
				
				System.out.println(title);
			}
			}
			
		}*/
		
		
		//convert set to list for index based access
		
		List<String> handleList = new ArrayList<>(windowHandles);
		
		for(int i = 0 ; i<handleList.size(); i++) {
			String id = handleList.get(i);
			
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}

		
		//String string = handleList.get(3);
		
		
		
	}

}
