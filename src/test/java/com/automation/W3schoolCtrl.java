package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3schoolCtrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple"); 
		driver.switchTo().frame("iframeResult");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		WebElement optVolvo = driver.findElement(By.xpath("//option[@value='volvo']"));
		action.click(optVolvo).perform();
		WebElement optAudi = driver.findElement(By.xpath("//option[@value='audi']"));
		action.click(optAudi).perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000); 
	}

}
