package com.automation;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsTest {
	//JavascriptExecutor normal method.
	//webElement method and actions class method are not working then we go for JavascriptExecutor.
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		WebElement txtloanintrest = driver.findElement(By.id("loaninterest"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value=13.7", txtloanintrest);
		
	}

}
