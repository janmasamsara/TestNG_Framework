package functionalLibs;

import org.openqa.selenium.By;
import org.testng.Assert;

import utilities.GenericMethods;

public class ResuableFun extends GenericMethods {	
	
//windows/alert related will be palced	
public  void switchToWindow(String WindowId) {
		
		try {
			driver.switchTo().window(WindowId);
			//driver.switchTo().
		} catch (Exception e) {
			Assert.fail("Unable to Switch the Window "+e.getMessage());
		}
	}
	

public  void switchToAlert_accept() {
	
	try {
		driver.switchTo().alert().accept();
		
		
	} catch (Exception e) {
		Assert.fail("Unable to Switch the Alert "+e.getMessage());
	}
}


public  void switchToAlert_dismiss() {
	
	try {
		driver.switchTo().alert().dismiss();
		
		
	} catch (Exception e) {
		Assert.fail("Unable to Switch the Alert "+e.getMessage());
	}
}

}
