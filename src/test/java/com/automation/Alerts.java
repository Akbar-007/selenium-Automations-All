package com.automation;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
 		alert.sendKeys("akbar");
		alert.accept();
		
		
		
	
		
		
		
		
	}

}
