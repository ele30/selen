package seleniumproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.systeminfo.SystemInfo;
import org.testng.Assert;



public class FirstTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce";
		
		//Assert.assertEquals(actualTitle,expectedTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("passed tc1");
		}else {
			System.out.println("Fail tc1");
		}
		
		WebElement signin=driver.findElement(By.partialLinkText("Get"));
		signin.click();
		
	String actualTitle1=driver.getTitle();
	System.out.println(actualTitle1);
		
		String expectedTitle1="Get started with nopCommerce - nopCommerce";
		
		//Assert.assertEquals(actualTitle,expectedTitle);
		if(actualTitle1.equalsIgnoreCase(expectedTitle1)) {
			System.out.println("passed tc2");
		}else {
			System.out.println("Fail tc2");
		}
		
		driver.quit();
		

	}

}
