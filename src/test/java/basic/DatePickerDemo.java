package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		WebElement input = driver.findElement(By.id("datepicker"));
		input.sendKeys("11/04/2024");
		
		
		//mm//dd/yyyy
		
		String mon = "May";
		String yr = "2027";
		String date = "11";
		
		while(true) {
		
		String month = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		
		String year = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
		
		
		if(mon.equals(month) && yr.equals(year)) {
		break;
		}
		
		WebElement next = driver.findElement(By.xpath("//span[text() = 'Next']"));
		next.click();
		
		}
		
		
		// select the date
		
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tr//td/a"));
		
		
		for(WebElement dateElement : allDates) {
			String dateStr = dateElement.getText();
			if(dateStr.equals(date)) {
				dateElement.click();
			}
		}
		
	}

}
