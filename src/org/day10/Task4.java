package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.homedepot.com/");
		WebElement srch = driver.findElement(By.id("headerSearch"));
		srch.sendKeys("celling fan");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fan = driver.findElement(By.xpath("//a[@title='Ceiling Fans']"));
		Actions action = new Actions(driver);
		action.contextClick(fan).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String prnt = driver.getWindowHandle();
		Set<String> cld = driver.getWindowHandles();
		for (String string : cld) {
			if(!(prnt==string)) {
				driver.switchTo().window(string);
			}			
		}
		WebElement clk = driver.findElement(By.xpath("//input[@placeholder='yourname@email.com']"));
        clk.sendKeys("ramv3912");
		
		
	}

}
