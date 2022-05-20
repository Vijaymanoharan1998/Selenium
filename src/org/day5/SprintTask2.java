package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sprint.com");
		Thread.sleep(4000);
		//click cache files
		WebElement clkx = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
		clkx.click();
		WebElement clkx1 = driver.findElement(By.xpath("//button[@class='phx-button phx-button--primary']"));
		clkx1.click();
		//select phone&devices 
		WebElement ph = driver.findElement(By.xpath("//li[@class='unav-headerNav__item'][2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ph).perform();
		//click 5g mobiles
		WebElement pn5g = driver.findElement(By.xpath("//a[@data-analytics-navigation-name='Phones & devices|5G phones']"));
		pn5g.click();
		//get text
		WebElement gtxt = driver.findElement(By.id("digital-footer-bottom-link-bottom-9"));
		String text = gtxt.getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
