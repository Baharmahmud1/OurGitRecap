package neotech_review_selenium_class_05;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import neotech_selenium_class_utils1.CommonMethods;

public class ScreenShotDemo extends CommonMethods {

	//https://www.facebook.com/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUp();
		wait(2);
		
	//	Screenshot of whole page
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("screenshots/FaceBookLogin.png");
		
		try {
			
			Files.copy(source, destination);
			
		} catch (Exception e) {
			System.out.println("Could not save the screenshot");
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------------------------");
		
		
//		Screenshot of a web element (Form)
		
		WebElement form=driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		TakesScreenshot ts2=(TakesScreenshot) form;
		File source2=ts2.getScreenshotAs(OutputType.FILE);
		File destination2=new File("screenshots/FacebookForm.png");
		
		try {
			Files.copy(source2, destination2);
		} catch (Exception e) {

			System.out.println(" Could not be saved!!");
			e.printStackTrace();

			
		}
		
		
		
		tearDown();
		
	}

}
