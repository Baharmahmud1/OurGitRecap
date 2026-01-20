package neotech_review_selenium_class_05;

import neotech_selenium_class_utils1.BaseCLass;
import neotech_selenium_class_utils1.CommonMethods;

public class Test1 extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		wait(3);
		

		switchToFrame(0);
		sendText(null, null);
		tearDown();
	}

}
