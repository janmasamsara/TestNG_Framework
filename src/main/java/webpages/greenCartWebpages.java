package webpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class greenCartWebpages {
	
	//page object model...
	
	@FindBy(how=How.XPATH,using="//input[@type=\"search\"]")
	public WebElement product_SearchTxt; 
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'ADD TO CART')]")
	public WebElement add_To_Cart_Btn;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'ADD TO CART')]")
	public List<WebElement> listOfcartElements;

	
	@FindBy(how=How.XPATH,using="//img[@alt=\"Cart\"]")
	public WebElement cartBtn;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	public WebElement proceed_To_Cart_Btn;
	
	@FindBy(how=How.XPATH,using="//input[@class='promoCode']")
	public WebElement promo_code;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Apply')]")
	public WebElement apply_btn;
	
	@FindBy(how=How.XPATH,using="//span[@class=\'promoInfo\']")
	public WebElement success_msg;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Top Deals')]")
	public WebElement top_deals;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"search-field\"]")
	public WebElement search_textbox;
	
	

}
