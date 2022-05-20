package org.sele;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
	     List<WebElement> tag = driver.findElements(By.tagName("a"));
	     int size = tag.size();
	     System.out.println(size);
	     for (WebElement x : tag) {
	    	 String att = x.getAttribute("href");
	    	 if(att!=null) {
	    		 URL u = new URL(att);
	    		 URLConnection url = u.openConnection();
	    		 HttpsURLConnection hp = (HttpsURLConnection) url;
	    		 int rc = hp.getResponseCode();
	    		 if(rc>=400) {
	    			 System.out.println(att);
	    		 }
	    	 }
		}
	}
}
