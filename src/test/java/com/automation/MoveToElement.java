package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dtdc.in/");
		Thread.sleep(5000);
		WebElement lnksolution = driver.findElement(By.xpath("//li/a[contains(text(),'Solutions')][1]"));
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(lnksolution).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Industry Solutions')]")).click();
		Thread.sleep(2000);
//		driver.close();	
	}

}
