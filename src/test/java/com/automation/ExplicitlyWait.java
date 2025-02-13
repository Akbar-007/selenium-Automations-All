package com.automation;

import java.time.Duration;

import javax.print.attribute.standard.PresentationDirection;

import org.apache.hc.core5.http2.protocol.H2RequestValidateHost;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(""))
	}

}
