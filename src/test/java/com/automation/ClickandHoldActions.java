package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		 WebElement source =  driver.findElement(By.id("draggable"));
		 WebElement dust = driver.findElement(By.id("droppable"));
		
		 
		 Actions action = new Actions(driver);
//		 action.clickAndHold(source).perform();
//		 action.release(dust).perform();
		 action.clickAndHold(source).release(dust).perform();
		 
		 Thread.sleep(4000);
		 driver.quit();
		 
	}

}
