package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class googleWebpages {
	
	
	@FindBy(how=How.XPATH,using="//textarea[@name=\"q\"]")
	public WebElement searchbox;
	
	
	

}
