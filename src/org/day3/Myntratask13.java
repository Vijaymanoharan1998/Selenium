package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntratask13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtphno.sendKeys("5689875235");
		
		WebElement clkcnt = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		clkcnt.click();
	}

}
