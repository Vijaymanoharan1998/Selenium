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

public class Task9 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		WebElement cncl = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cncl.click();
		WebElement srch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		srch.sendKeys("redmi");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		WebElement phn = driver.findElement(By.xpath("//div[text()='REDMI 10 (Pacific Blue, 64 GB)']"));
		Actions action = new Actions(driver);
		action.contextClick(phn).perform();
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
		WebElement rate = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = rate.getText();
		System.out.println(text);
         		
		
		
		
		
	}

}
