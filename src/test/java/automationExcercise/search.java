package automationExcercise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functionalLibs.ResuableFun;
import utilities.GenericMethods;
import webpages.searchwebpages;

public class search extends GenericMethods  {
	@Test
	public void method() throws InterruptedException {
		GenericMethods genericMethods = new GenericMethods();
		//ResuableFun reuse=new ResuableFun();
		searchwebpages regWeb = PageFactory.initElements(driver,searchwebpages.class);
		System.out.println("application started");
		if (regWeb.Home_page.isDisplayed())
		{
			genericMethods.click(regWeb.product_btn);
			genericMethods.input(regWeb.product_btn1,"Winter Top","search");
			genericMethods.elementToBeClickable(regWeb.search_bar);
			genericMethods.click(regWeb.search_bar);
			
			if(regWeb.searched_prod.isDisplayed())
			{
				
				if(regWeb.product_list.isDisplayed())
				{
					System.out.println("Related search product is displayed");
				}
				
				}
			}
	}
}

