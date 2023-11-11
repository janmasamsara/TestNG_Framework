package CommonWay;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GeneralWayTC {

	@Test
	public void generalTC() throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "./myDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// browser open
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//TestStep2 code
		WebElement searchTxt=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		searchTxt.sendKeys("ber");
		Thread.sleep(5000);
		List<WebElement> prodCount=driver.findElements(By.xpath("//div[@class=\"products\"]/div"));
		int count=prodCount.size();
		System.out.println("total products are :" +count);
		
		List<WebElement> addtocartBtn=driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));
		
		for(WebElement we:addtocartBtn)
		{
			we.click();
		}
		
		WebElement cartBtn=driver.findElement(By.xpath("//img[@alt=\"Cart\"]"));
		cartBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(
				ExpectedConditions.elementToBeClickable
				(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")))
				.click();
		
		WebElement promocode=driver.findElement(By.xpath("//input[@class=\"promoCode\"]"));
		promocode.sendKeys("rahulshettyacademy");
		
		WebElement applyBtn=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
		applyBtn.click();
		
		Thread.sleep(5000);
		
		WebElement successMsg=driver.findElement(By.xpath("//span[@class=\"promoInfo\"]"));
		String message=successMsg.getText();
		System.out.println(message);
		
	}

}
