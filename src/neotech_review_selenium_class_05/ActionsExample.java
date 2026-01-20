package neotech_review_selenium_class_05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import neotech_selenium_class_utils1.CommonMethods;

public class ActionsExample extends CommonMethods {
//http://webdriveruniversity.com/Actions/index.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUp();
		
		wait(3);
		Actions act= new Actions(driver);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
	
		
		//act.dragAndDrop(draggable, droppable).perform();
		
		
		act.clickAndHold(draggable).pause(2000).moveToElement(droppable).pause(2000).release().perform();
		
		wait(0);
		
	//-------DOUBLE CLICK--------------------------------------------------------
		
		WebElement doubleClickButton=driver.findElement(By.id("double-click"));
		
		act.doubleClick(doubleClickButton).perform();
		
		//-------MOUSE HOVER--------------------------------------------------------
		
		List<WebElement> hover=driver.findElements(By.xpath("//button[@class='dropbtn']"));
		
		for (WebElement webElement : hover) {
			act.moveToElement(webElement).pause(2).perform();
			wait(3);
		}
		
		
		WebElement div=driver.findElement(By.id("click-box"));
		act.clickAndHold(div).pause(5000).release().pause(2000).clickAndHold(div).pause(2000).release().perform();
		
		wait(2);
		
		wait(3);
		tearDown();
		
		
		
		
	}

}
