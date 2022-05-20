package org.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task08 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("motorola");
		
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
	    File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
	    System.out.println(screenshotAs);
	    
	    File file = new File("F:\\Screenshots\\screenshot.png");
	    FileUtils.copyFile(screenshotAs, file);
	    
	    
	    
		
	}
	
	

}
