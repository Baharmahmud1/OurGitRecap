package neotech_review_selenium_class_05;

import java.net.http.WebSocket;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.openqa.selenium.By;

import neotech_selenium_class_utils1.CommonMethods;

public class uploadExample extends CommonMethods {

	//https://neotech.vercel.app/fileUpload
	//C:\Users\bahar\eclipse-workspace\SeleniumBahar\screenshots\HRM_dashBoard.png
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUp();
		
		String filePath=System.getProperty("user.dir") + "\\screenshots\\HRM_dashBoard.png";


				
				
				
				
		driver.findElement(By.id("image_file")).sendKeys(filePath);
	wait(2);
		
		click(driver.findElement(By.id("btnUpload")));
		
		
		waitForClickability(driver.findElement(By.xpath("//div[@class='ContactUs']")));
		
		wait(3);
		
		String expectedMessage="File uploaded successfully!";
			
		String actualMessage=driver.findElement(By.xpath("//div[@class='ContactUs']")).getText();
		
		String fileName="";
		
		if (actualMessage.equals(expectedMessage)) {
			
			System.out.println("Test Passed");
			fileName="passed/FileUpload.png";
		}
		
		else {
			System.out.println("Test failed");
			fileName="Failed/FileUpload.png";
		}
		
		
		takeScreenShot(fileName);
	
		tearDown();
		
		
		
	}

}
