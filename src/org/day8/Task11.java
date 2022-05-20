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
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement clk = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clk.click();
		
		WebElement clk1 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(clk1).perform();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		
		File file = new File("F:\\\\Screenshots\\\\screenshot.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
	}

}
