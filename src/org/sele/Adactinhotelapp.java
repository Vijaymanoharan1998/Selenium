package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapp {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
			+ "\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("vijay");

	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("heloo1256");
}
}