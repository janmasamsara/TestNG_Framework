package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.amazonwebpages;

public class AmazonTestcase extends GenericMethods{
	
	@Test
	public void Amazon()
	{
		GenericMethods gm=new GenericMethods();
		
		amazonwebpages ow=PageFactory.initElements(driver,amazonwebpages.class);
		
		gm.click(ow.userId);
	}

}
