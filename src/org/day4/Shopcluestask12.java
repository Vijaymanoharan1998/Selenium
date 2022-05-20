package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopcluestask12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement srch = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		srch.sendKeys("headphones");
		
		WebElement clkbtn = driver.findElement(By.xpath("//input[@onclick='searchTrigger()']"));
		clkbtn.click();
		
		WebElement clkbtn1 = driver.findElement(By.xpath("//img[@id='det_img_151748829']"));
		clkbtn1.click();
		
		
		
		
		
		
	}
}
