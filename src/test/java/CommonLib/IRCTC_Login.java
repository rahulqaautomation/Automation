package CommonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_Login {
	
	
public static void main (String [] args) {
	
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ersan\\OneDrive\\Desktop\\Files\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

boolean b=false;
do {
String TextStr=driver.findElement(By.xpath("//a[@aria-label='Click here for Alerts']/following-sibling::span")).getText();

b=TextStr.startsWith("12:25", 13);

}while(b==false);

driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();


}
}
