package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fliptask11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtusername.sendKeys("8680825976");
		String text = txtusername.getAttribute("value");
		System.out.println(text);
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtpassword.sendKeys("hjh@123");
		String text1 = txtpassword.getAttribute("value");
		System.out.println(text1);
		
//		WebElement clklgin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		clklgin.click();
	}

}
