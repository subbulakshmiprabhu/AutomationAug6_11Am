package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class HandlnigLinks {
	
	public static void main(String[] args) {
		int sum = 0;
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.softwaretestingmaterial.com/");
		List<WebElement> atags = driver.findElements(By.tagName("a"));
		
		for(WebElement tag:atags) {
			
			String link = tag.getAttribute("href");
			int status =BaseClass.brokenLinkChecker(link);
			sum += status;
		}
		
		System.out.println("boken link count ::"+sum);
		
	}
	
	
	
}
