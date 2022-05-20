package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement fromlocation = driver.findElement(By.id("src"));
		fromlocation.sendKeys("chennai");
		
		WebElement tolocation = driver.findElement(By.id("dest"));
		tolocation.sendKeys("Salem");
		
	}

}
