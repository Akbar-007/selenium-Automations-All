package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickActions {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.tagName("div"));
		
		Thread.sleep(2000);
		
		 Actions action = new Actions(driver);
		 
		 action .doubleClick(element).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();

	}

}
