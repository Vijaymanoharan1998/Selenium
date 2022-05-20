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

public class Task3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/ ");
		WebElement srch = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		srch.sendKeys("iphones 7");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement phn = driver.findElement(By.xpath("//p[text()='Shining Stars White Soft Silicon Cases For Apple iPhone 7 - ChromeCase Pack of 1']"));
		Actions action = new Actions(driver);
		action.contextClick(phn).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String prntwin = driver.getWindowHandle();
		System.out.println(prntwin);
		Set<String> cldwin = driver.getWindowHandles();
		System.out.println(cldwin);
		
		for (String string : cldwin) {
			if(!(prntwin==string)) {
				driver.switchTo().window(string);
			}
		}
		WebElement buy = driver.findElement(By.xpath("//div[@class='col-xs-6 btn btn-xl rippleWhite buyLink buyNow marR15  ']"));
		buy.click();
	}
}

