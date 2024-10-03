package basic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessDemo {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--headless");
		
		//options.setHeadless(true)

		//options.addArguments("incognito");
		//options.addArguments("start-maximized");
		
		List<String> l = new ArrayList<>();
		l.add("incognito");
		l.add("start-maximized");
		l.add("--disable-notifications");
		
		options.addArguments(l);
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
