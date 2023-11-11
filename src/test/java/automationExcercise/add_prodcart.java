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
import webpages.add_prodcartwebpages;

public class add_prodcart extends GenericMethods 
{
			@Test
			public void method() throws InterruptedException {
				GenericMethods genericMethods = new GenericMethods();
				//ResuableFun reuse=new ResuableFun();
				add_prodcartwebpages regWeb = PageFactory.initElements(driver,add_prodcartwebpages.class);
				System.out.println("application started");
				if (regWeb.Home_page.isDisplayed())
				{
					genericMethods.click(regWeb.product_btn);
					Actions action=new Actions(driver);
					genericMethods.elementToBeClickable(regWeb.mousehover_product1);
					action.moveToElement(regWeb.mousehover_product1).build().perform();
					/*
					WebElement mousehover_product1=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]"));
					action.moveToElement(mousehover_product1).build().perform();
					*/
					genericMethods.elementToBeClickable(regWeb.addcart1_btn);
					genericMethods.click(regWeb.addcart1_btn);
					genericMethods.click(regWeb.continue_btn);
					action.moveToElement(regWeb.mousehover_product2).build().perform();
					
					/*
					WebElement mousehover_product2=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]"));
					action.moveToElement(mousehover_product2).build().perform();
					*/
					genericMethods.elementToBeClickable(regWeb.addcart2_btn);
					genericMethods.click(regWeb.addcart2_btn);
					genericMethods.click(regWeb.viewcart_btn);
					genericMethods.getAttributeValue(regWeb.products_count);
					
					/*
					List<WebElement> products_count=driver.findElements
							(By.xpath("//table[@id=\"cart_info_table\"]/tbody/tr"));
					int count = products_count.size();
					System.out.println("total products are :" + count);
			       
					Thread.sleep(1000);
					List<WebElement> produts_details=driver.findElements
							(By.xpath("//table[@id=\"cart_info_table\"]/tbody/tr/td[@class='cart_price']"));
					
					for(WebElement we :produts_details) {
						System.out.println(we.getText());
					}
					*/
				}

}
}