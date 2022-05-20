package org.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement down = driver.findElement(By.xpath("//a[text()='RPA']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		
		File file = new File("F:\\Screenshots\\screen.png");
		FileUtils.copyFile(screenshotAs, file);
		
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)",clk);
		
		File screenshotAs2 = screen.getScreenshotAs(OutputType.FILE);
		
		File file1 = new File("F:\\\\Screenshots\\\\screen1.png");
		
		FileUtils.copyFile(screenshotAs2, file1);
		
		
		
		
		
	}

}
