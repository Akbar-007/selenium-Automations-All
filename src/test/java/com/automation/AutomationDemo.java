package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("a.mdakbar2016@gmail.com");
	
		driver.findElement(By.id("enterimg")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("mohamed");
	
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("akbar");
	
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"))
				.sendKeys("20/1 pudupet");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("a.mdakbar2016@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8012950127");

		driver.findElement(By.name("radiooptions")).click();

		driver.findElement(By.id("checkbox1")).click();

		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("English")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//select[@ng-model='Skill']")).sendKeys("C");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@ng-model='country']")).click();

//				WebElement state = driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
//				state.sendKeys("India");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",country);
		Select s = new Select(country);
		s.selectByVisibleText("India");
	
		driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).sendKeys("1999");

		
		
		
	}


	}


