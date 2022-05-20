package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fliptask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement clklgin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clklgin.click();
		
		WebElement clksel = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		clksel.sendKeys("mobiles");
		
		WebElement clksrch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		clksrch.click();
		
		WebElement clkmbl = driver.findElement(By.xpath("//div[@class='_4rR01T'][1]"));
		clkmbl.click();
		
		
		
		
	}

}
