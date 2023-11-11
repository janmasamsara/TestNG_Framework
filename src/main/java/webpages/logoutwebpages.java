package webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class logoutwebpages
{

	@FindBy(how = How.XPATH, using = "//a[contains(text(), \"Home\")]")
	public WebElement Home_page;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),\" Signup / Login\")]")
	public WebElement signup_btn;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),\"New User Signup!\")]")
	public WebElement new_user_signup;

	@FindBy(how = How.XPATH, using = "//input[@name=\"name\"]")
	public WebElement Username;
	
	@FindBy(how = How.XPATH, using = "//section[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	public WebElement Email_addr;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Signup')]")
	public WebElement sign_btn;
	@FindBy(how = How.XPATH, using="//b[contains(text(),\"Enter Account Information\")]")
	public WebElement enter_accountinfo;
	@FindBy(how = How.XPATH, using="//input[@id=\"id_gender2\"]")
	public WebElement Title;
	@FindBy(how = How.XPATH, using="//input[@id=\"password\"]")
	public WebElement password;
	/*
	@FindBy(how = How.XPATH, using="//select[@id=\"days\"]")
	public WebElement DOB_day;
	@FindBy(how = How.XPATH, using="//select[@id=\"months\"]")
	 public WebElement DOB_month;
	 @FindBy(how=How.XPATH,using="//select[@id=\"years\"]")
	 public WebElement DOB_year;
	*/
	 @FindBy(how=How.XPATH,using="//label[contains(text(),\"Sign up for our newsletter!\")]")
	 public WebElement checkbox1;
	 @FindBy(how=How.XPATH,using="//label[contains(text(),\"Receive special offers from our partners!\")]")
	 public WebElement checkbox2;
	 @FindBy(how=How.XPATH,using="//input[@id=\"first_name\"]")
	 public WebElement first_name;
	 @FindBy(how=How.XPATH,using="//input[@id=\"last_name\"]")
	 public WebElement last_name;
	 @FindBy(how=How.XPATH,using="//input[@id=\"company\"]")
	 public  WebElement company;
	 @FindBy(how=How.XPATH,using="//input[@id=\"address1\"]")
	 public WebElement address1;
	 @FindBy(how=How.XPATH,using="//input[@id=\"address2\"]")
	 public WebElement address2;
	 @FindBy(how=How.XPATH,using="//select[@id=\"country\"]")
	 public WebElement country;
	 @FindBy(how=How.XPATH,using=("//input[@id=\"state\"]"))
	 public WebElement state; 
	 @FindBy(how=How.XPATH,using=("//input[@id=\"city\"]"))
	 public WebElement city; 
	 @FindBy(how=How.XPATH,using=("//input[@id=\"zipcode\"]"))
	 public WebElement zipcode;
	 @FindBy(how=How.XPATH,using=("//input[@id=\"mobile_number\"]"))
	public WebElement mobile_no;
	 @FindBy(how=How.XPATH,using=("//button[contains(text(),\"Create Account\")]"))
	 public WebElement createAcc_btn;
	 @FindBy(how=How.XPATH,using="//b[contains(text(),\"Account Created!\")]")
	 public WebElement accountcreate_msg;
	 @FindBy(how=How.XPATH,using=("//a[contains(text(),\"Continue\")]"))
	 public WebElement continue_btn;
	@FindBy(how=How.XPATH,using=("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"))
	public WebElement logout_btn;
	
	@FindBy(how=How.XPATH,using=("/html/body/section/div/div/div[1]/div/form/input[2]"))
	public WebElement Email_add;
	@FindBy(how=How.XPATH,using=("//input[@name=\"password\"]"))
	public WebElement pwd;
	@FindBy(how=How.XPATH,using=("//button[contains(text(),\"Login\")]"))
	public WebElement login_btn;
	@FindBy(how=How.XPATH,using=("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a"))
	public WebElement logged_username;
	@FindBy(how=How.XPATH,using=("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"))
	public WebElement logout_btn1;
	@FindBy(how=How.XPATH,using=("//h2[contains(text(),\"Login to your account\")]"))
	public WebElement login_page;
}