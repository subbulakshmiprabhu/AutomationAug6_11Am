package basic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebDriverWait mywait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("PIM");
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']")).click();
		//List<WebElement> rows = driver.findElements(By.xpath("//div[@role='row']"));
		
	//	driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-dash oxd-checkbox-input-icon']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class = 'oxd-icon bi-dash oxd-checkbox-input-icon']")));
		element.click();
		
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class = 'oxd-table-card-cell-checkbox']//input"));
//		
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}



	}

}