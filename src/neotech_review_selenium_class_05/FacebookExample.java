package neotech_review_selenium_class_05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import neotech_selenium_class_utils1.CommonMethods;

public class FacebookExample {

	final static String url="https://www.facebook.com/" ;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.setBrowserVersion("128");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get(url);
		
		driver.manage().window().maximize();
		//driver.manage().
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver.findElement(By.id("email")).sendKeys("neotechrocks@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Neotech@123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		CommonMethods.click(driver.findElement(By.xpath("//span[text()='neotech Smith']")));
		CommonMethods.wait(2);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for (int i = 0; i <= 15; i++) {
			js.executeScript("window.scroll(0,250)");
			Thread.sleep(2000);
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
