package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement clkprdt = driver.findElement(By.xpath("//img[@alt='ACs']"));
		clkprdt.click();
		
		
		
		WebElement clksrch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clksrch.click();
		
		
	}

}
