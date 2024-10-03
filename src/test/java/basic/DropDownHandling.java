package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(dropdown);
		
		//s.selectByIndex(2);
		s.selectByValue("3");
		s.selectByVisibleText("Pine Apple");
		
	//	s.getAllSelectedOptions()
		System.out.println(s.getFirstSelectedOption().getText());
		
		WebElement dropdown2 = driver.findElement(By.id("superheros"));
		Select  s1= new Select(dropdown2);
		
		s1.selectByIndex(1);
		s1.selectByValue("bt");
		s1.selectByVisibleText("Marvelman");
		
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		
		System.out.println(allSelectedOptions.size());
		
		for(WebElement option:allSelectedOptions) {
			
			System.out.println(option.getText());
			
		}
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		
		List<WebElement> options = s1.getOptions();
		
		
		for(WebElement option:options) {
			
			System.out.println(option.getText());
			
		}
		
		
		s1.deselectAll();
		
		System.out.println(s.isMultiple());
		System.out.println(s1.isMultiple());

		
		
	}

}
