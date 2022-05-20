package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com/");
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clk.click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		List<WebElement> mnth = select.getOptions();
		for (int i = 0; i < mnth.size(); i++) {
			WebElement mnth1 = mnth.get(i);
			String text = mnth1.getText();
			System.out.println(text);
			
		}

	}

}
