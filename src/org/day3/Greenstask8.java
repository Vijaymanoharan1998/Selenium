package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstask8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement intqus = driver.findElement(By.xpath("//div[@id='heading20']"));
		intqus.click();
		
		WebElement clksrch = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		clksrch.click();
		
		
		
	}

}
