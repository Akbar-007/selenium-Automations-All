package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Luma_Automate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Create an Account")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("mohamed");
		
		driver.findElement(By.id("lastname")).sendKeys("akbar");
		
		driver.findElement(By.id("email_address")).sendKeys("akbar29@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Password@akbar7");
		
		driver.findElement(By.id("password-confirmation")).sendKeys("Password@akbar7");
		
		driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		boolean contain = driver.getPageSource().contains("Contact Information");
		System.out.println("Contact Information text is present:" +contain);
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Cart")).click();
		
//		WebElement text=driver.findElement(By.xpath("//div[@id='minicart-content-wrapper']"));
//		System.out.println(text.getText());
		//contains type
//		WebElement text=driver.findElement(By.xpath("//strong[@class='subtitle empty']"));
//		System.out.println("You have no items in your shopping cart.".contains(text.getText()));
		
//		WebElement text=driver.findElement(By.xpath("//strong[@class='subtitle empty']"));
//		System.out.println(text.getText());
		
		
//		ithu nanea pannathu 
		WebElement c= driver.findElement(By.xpath("(//div[@class='block-content'])[1]"));
		System.out.println(c.getText());
		
		Actions ac= new Actions(driver);
		driver.findElement(By.id("ui-id-4")).click();
		
		WebElement bottom = driver.findElement(By.xpath("(//*[contains(text(),'Bottoms')])[2]"));
		ac.moveToElement(bottom).build().perform();
		
		WebElement shorts = driver.findElement(By.linkText("Shorts"));
		ac.moveToElement(shorts).build().perform();
		
		
		
		
		
		
		
	}

}
