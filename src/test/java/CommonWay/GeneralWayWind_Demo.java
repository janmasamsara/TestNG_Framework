package CommonWay;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GeneralWayWind_Demo {
	
	@Test
	public void test() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./myDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// browser open
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent_win_Id=driver.getWindowHandle();
		
		System.out.println("Parent Window id:"+ parent_win_Id);
		
		WebElement top_deals=driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]"));
		top_deals.click();
		
		Set<String> windows_list=driver.getWindowHandles();
		
		Iterator<String> itr=windows_list.iterator();
		
		while(itr.hasNext())
		{
			String child_wind_id=itr.next();
			
			if(!parent_win_Id.equalsIgnoreCase(child_wind_id)) {
				
				driver.switchTo().window(child_wind_id);
				Thread.sleep(5000);
				
				WebElement search_textbox=driver.findElement(By.xpath("//input[@id=\"search-field\"]"));
				search_textbox.sendKeys("Wheat");
				
			}
		}
		
		
	}

}
