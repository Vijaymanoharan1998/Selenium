package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(country);
		List<WebElement> cntry = select.getOptions();
		for (int i = 0; i < cntry.size(); i++) {
			WebElement cntry1 = cntry.get(i);
			String text = cntry1.getText();
			System.out.println(text);
			
		}
		
	}

}
