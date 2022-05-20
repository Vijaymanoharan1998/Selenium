package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstask3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement intqusclk = driver.findElement(By.id("heading20"));
		intqusclk.click();
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		Actions action = new Actions(driver);
	    action.contextClick(clk).perform();
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
