package automationExcercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functionalLibs.ResuableFun;
import utilities.GenericMethods;
import webpages.contactuswebpages;

public class contactus extends GenericMethods 
{
	@Test
		public void method() throws InterruptedException {
			GenericMethods genericMethods = new GenericMethods();
			ResuableFun reuse=new ResuableFun();
			contactuswebpages regWeb = PageFactory.initElements(driver, contactuswebpages.class);

			System.out.println("application started");

			if (regWeb.Home_page.isDisplayed()) 
			{
				genericMethods.click(regWeb.contact_formbtn);
				if(regWeb.get_intouch.isDisplayed())
				{
					genericMethods.input(regWeb.name,"virat","Name");
					genericMethods.input(regWeb.Email,"Kohilbatsman718@gmail.com","Email");
					genericMethods.input(regWeb.subject,"Logout functionality","Subject");
					genericMethods.input(regWeb.ur_msg,"Taking long-time to load","Message");
					genericMethods.click(regWeb.submit_btn);
					
					reuse.switchToAlert_accept();
					//driver.switchTo().alert().accept();


					
					if(regWeb.succcess_msg.isDisplayed())
					{
						genericMethods.click(regWeb.Home_btn);
						if(regWeb.home_page.isDisplayed())
						{
							System.out.println("submitted the contactus form");
				}
				
			}
		
				}
			}
	}
}

				
				
				
				
				
			
				
				
				
					
					
						
						