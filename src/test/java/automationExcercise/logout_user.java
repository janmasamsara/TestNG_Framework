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
import webpages.loginwebpages;
import webpages.logoutwebpages;

public class logout_user extends GenericMethods {
	@Test
	public void method() throws InterruptedException {
		GenericMethods genericMethods = new GenericMethods();
		//ResuableFun reuse=new ResuableFun();
		//object creation
		logoutwebpages regWeb = PageFactory.initElements(driver, logoutwebpages.class);
		System.out.println("application started");
		if (regWeb.Home_page.isDisplayed()) {
			genericMethods.click(regWeb.signup_btn);
			if (regWeb.new_user_signup.isDisplayed()) {
				// passing data through parameters Annotation,generate .xml file
				genericMethods.input(regWeb.Username,"virat","username");
				genericMethods.input(regWeb.Email_addr,"viratanu185@gmail.com","emailAddress");
				//waiting period method,there itself we have click inside
				elementToBeClickable(regWeb.sign_btn);
				genericMethods.click(regWeb.sign_btn);
				
				/*
				String parentWinID=driver.getWindowHandle();
				reuse.switchToWindow(parentWinID);
				*/
				if(regWeb.enter_accountinfo.isDisplayed())
				{	
					elementToBeClickable(regWeb.enter_accountinfo);
					
					genericMethods.click(regWeb.Title);
					genericMethods.input(regWeb.password,"January@32","Password");
					/*
					genericMethods.selectVisibleText(regWeb.DOB_day,"5","Day");
					genericMethods.selectVisibleText(regWeb.DOB_month,"1","Month");
					genericMethods.selectVisibleText(regWeb.DOB_year,"1993","Year");
					*/
					genericMethods.click(regWeb.checkbox1);
					genericMethods.click(regWeb.checkbox2);
					genericMethods.input(regWeb.first_name,"Virat","First_name");
					genericMethods.input(regWeb.last_name,"kohil","Last_name");
					genericMethods.input(regWeb.company,"ICC","Company");
					genericMethods.input(regWeb.address1,"V.N.R garden street","Address1");
					genericMethods.input(regWeb.address2,"8-4-1A","Address2");
					genericMethods.selectVisibleText(regWeb.country,"India","Country");
					genericMethods.input(regWeb.state,"AndhraPradesh","State");
					genericMethods.input(regWeb.city,"Nellore","City");
					genericMethods.input(regWeb.zipcode,"524137","ZipCode");
					genericMethods.input(regWeb.mobile_no,"949312365","Mobile_number");
					genericMethods.click(regWeb.createAcc_btn);
					if(regWeb.accountcreate_msg.isDisplayed())
					{
						genericMethods.click(regWeb.continue_btn);
						elementToBeClickable(regWeb.logout_btn);
						genericMethods.click(regWeb.logout_btn);
						
							genericMethods.input(regWeb.Email_add,"viratanu185@gmail.com","emailAddress");
							genericMethods.input(regWeb.pwd,"January@32","PassworD");
							genericMethods.click(regWeb.login_btn);
						if(regWeb.logged_username.isDisplayed())
							{
							genericMethods.click(regWeb.logout_btn1);
							if(regWeb.login_page.isDisplayed())
								{
									System.out.println("user is navigated to Login page ");
								}
							}
						}
					}
				}
				
			}
}
	

		}
				

