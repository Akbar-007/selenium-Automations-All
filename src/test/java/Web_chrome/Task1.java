package Web_chrome;

//import java.awt.desktop.QuitEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
//		WebElement username = ch.findElement(By.cssSelector("input[name='email']"));
//		username.sendKeys("8012950127");
//		
//		Thread.sleep(2000);
//		WebElement pswd = ch.findElement(By.xpath("//input[@id='pass']")); 
//		pswd.sendKeys("123");
//		
//		WebElement log = ch.findElement(By.xpath("//button[@id='loginbutton']"));
//		log.click();
		
		
		Thread.sleep(2000);
//		ch.quit();
		
		ch.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(1000);
		ch.navigate().back();
		
		Thread.sleep(2000);
		ch.navigate().forward();
		
	}

}
