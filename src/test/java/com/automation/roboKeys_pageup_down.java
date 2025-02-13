package com.automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class roboKeys_pageup_down {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Logic");
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		
//		action.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(2000);
		
//		action.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(2000);
//		

//		till end and till up
       Actions action = new Actions(driver);
       action.sendKeys(Keys.END).perform();
       
       Thread.sleep(2000);
       
       action.sendKeys(Keys.HOME).perform();
       Thread.sleep(2000);
	}

}
