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

public class Task2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.com/");
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("iphone x");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement clk = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Silver - GSM Unlocked (Renewed Premium)']"));
        Actions action = new Actions(driver);
        action.contextClick(clk).perform();
        
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String prntwin = driver.getWindowHandle();
		System.out.println(prntwin);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		for (String string : allwin) {
			if(!(prntwin==string)) {
				driver.switchTo().window(string);
			}
		}
			}
		}
		
	
