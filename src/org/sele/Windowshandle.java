package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		btn.click();
		WebElement srch = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		srch.sendKeys("mobiles",Keys.ENTER);
		WebElement phn = driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Metallic Blue, 64 GB)']"));
		Actions action = new Actions(driver);
		action.contextClick(phn).perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String prnt = driver.getWindowHandle();
		System.out.println(prnt);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String string : all) {
			if(!(prnt.equals(string))) {
				driver.switchTo().window(string);
		}
		}
		WebElement clk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"));
		clk.click();
		System.out.println("done");
	}

}
