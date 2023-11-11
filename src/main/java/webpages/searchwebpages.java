package webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class searchwebpages {
	@FindBy(how = How.XPATH, using ="//a[contains(text(), \"Home\")]")
	public WebElement Home_page;
	@FindBy(how = How.XPATH, using =("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"))
	public WebElement product_btn;
	@FindBy(how = How.XPATH, using =("//input[@name=\"search\"]"))
	public WebElement product_btn1;
	@FindBy(how = How.XPATH, using =("//button[@id=\"submit_search\"]"))
	public WebElement search_bar;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/h2"))
	public WebElement searched_prod;
	@FindBy(how = How.XPATH, using =("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]"))
	public WebElement product_list;
		


}
