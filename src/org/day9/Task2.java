package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement ele = driver.findElement(By.id("fruits"));
		Select select = new Select(ele);
		List<WebElement> obj = select.getOptions();
		for (int i = 0; i < obj.size(); i++) {
			WebElement obj1 = obj.get(i);
			String text = obj1.getText();
			System.out.println(text);
			select.selectByVisibleText(text);
		}
		WebElement fstsel = select.getFirstSelectedOption();
		String text = fstsel.getText();
		System.out.println(text);
		
		List<WebElement> ele1 = select.getAllSelectedOptions();
		for (int i = 0; i < ele1.size(); i++) {
			WebElement ele2 = ele1.get(i);
			String attribute = ele2.getAttribute("value");
			System.out.println(attribute);
			
		}
		select.deselectAll();
		
	}

}
