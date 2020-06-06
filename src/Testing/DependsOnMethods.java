package Testing;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	public WebDriver driver;
	
	@Test
	public void openbrowser()	
	{
		//Assert.fail();
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		System.out.println("open now");
	}
	
	@Test(dependsOnMethods="openbrowser") 
	public void enterURL() 
	{
		try {
			driver.get("https://demo.actitime.com/login.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("login");
	}
}
