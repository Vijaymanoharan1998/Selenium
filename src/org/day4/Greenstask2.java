package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement clk = driver.findElement(By.id("home-tab"));
		clk.click();
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text)(),'taken 400+ batches')]"));
		String text = txt.getText();
		System.out.println(text);
		
		
	}

}
