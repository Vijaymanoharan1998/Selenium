package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		int size = frame.size();
		System.out.println(size);
//		driver.switchTo().frame(0);
		WebElement frm = driver.findElement(By.xpath("/html/frameset/frameset/frame"));
		driver.switchTo().frame(frm);
		WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		login.sendKeys("vijay885");
	}

}
