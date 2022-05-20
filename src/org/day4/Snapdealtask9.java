package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealtask9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement clksel = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		clksel.sendKeys("Ear buds");
		
		WebElement clksrch = driver.findElement(By.xpath("//div[@class='searchAutoSuggstn']"));
		clksrch.click();
		
		WebElement clksel1 = driver.findElement(By.xpath("//p[@title='pTron Bassbuds Jade Ear Buds Wireless With Mic Headphones/Earphones Black']"));
		clksel1.click();
		
		
		
	}

}
