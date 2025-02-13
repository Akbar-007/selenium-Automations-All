package Web_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class voters {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='container-tab-inactive-details']")).click();
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("stateID"));
		state.sendKeys("Tamilnadu");
	}

}
