package webpages;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class add_prodcartwebpages 
{
	@FindBy(how = How.XPATH, using ="//a[contains(text(), \"Home\")]") 
	public WebElement Home_page;
	@FindBy(how = How.XPATH, using =("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"))
	public WebElement product_btn;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]"))
	//Actions action=new Actions(driver);
	public WebElement mousehover_product1;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"))
	public WebElement addcart1_btn;
	@FindBy(how = How.XPATH, using ="//button[contains(text(),\"Continue Shopping\")]")
	public WebElement continue_btn;
	@FindBy(how = How.XPATH, using ="/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]")
	public WebElement mousehover_product2;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a"))
	public WebElement addcart2_btn;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a/u"))
	public WebElement viewcart_btn;
	@FindBy(how = How.XPATH, using =("//table[@id=\"cart_info_table\"]/tbody/tr"))
	public WebElement products_count;
		//List<WebElement> products_count=driver.findElements
	@FindBy(how = How.XPATH, using =("//table[@id=\"cart_info_table\"]/tbody/tr/td[@class='cart_price']"))
	public WebElement	produts_details;	
		
	

}
