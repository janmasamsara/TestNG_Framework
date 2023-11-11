package webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class contactuswebpages {
	@FindBy(how = How.XPATH, using = "//a[contains(text(), \"Home\")]")
	public WebElement Home_page;
	@FindBy(how = How.XPATH, using ="//a[contains(text(),\" Contact us\")]")
	public WebElement contact_formbtn;
	@FindBy(how = How.XPATH, using =("//h2[contains(text(),\"Get In Touch\")]"))
	public WebElement get_intouch;
	@FindBy(how = How.XPATH, using =("//input[@name=\"name\"]"))
	public WebElement name;
	@FindBy(how = How.XPATH, using =("//input[@name=\"email\"]"))
	public WebElement Email;
	@FindBy(how = How.XPATH, using =("//input[@name=\"subject\"]"))
	public WebElement subject;
	@FindBy(how = How.XPATH, using =("//textarea[@name=\"message\"]"))
	public WebElement ur_msg;
	@FindBy(how = How.XPATH, using ="//input[@name=\"submit\"]")
	public WebElement submit_btn;
	@FindBy(how = How.XPATH, using =("/html/body/div[1]/div[2]/div[1]/div/div[2]"))
	public WebElement succcess_msg;
	@FindBy(how = How.XPATH, using =("/html/body/div[1]/div[2]/div[1]/div/div[3]/a"))
	public WebElement Home_btn;
	@FindBy(how = How.XPATH, using =("/html/body/header/div/div/div/div[2]/div/ul/li[1]/a"))
	public WebElement home_page;
	}