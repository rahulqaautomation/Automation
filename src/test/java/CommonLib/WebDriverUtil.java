package CommonLib;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
	WebDriver driver=null;
	Logger logger = new Logger(null);

	
	public void LunchBrowser() {
	String BrName = "Chrome";
	
	
	if(BrName =="Chrome") {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	else if (BrName=="IE")
	{
		
		
		
	}
		else if (BrName=="ff") {
			
		}
	}
	
	public void SetTextboxValue(WebElement Weobj, String TextValue) {
		try {
			Weobj.sendKeys(TextValue);
			
		}catch(Exception e) {
			
		}
		
	}
	
	
	
}
