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

public class Task12 {

	public static <JavaScriptExecutor> void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement srch = driver.findElement(By.xpath("//input[@name='keyword'][1]"));
		srch.sendKeys("hp");
		
		WebElement clk = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		clk.click();
		
		TakesScreenshot scrn = (TakesScreenshot)driver;
		File screenshotAs = scrn.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File file = new File("F:\\Screenshots\\screenshot.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
		
		
		
		
	}

}
