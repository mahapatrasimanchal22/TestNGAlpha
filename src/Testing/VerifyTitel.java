package Testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitel {

	@Test
	
	public void verif()
	{
		WebDriver op=new FirefoxDriver();
		op.get("https://demo.actitime.com/login.do");
		String expectedTitle=op.getTitle();
		String actualTitle=op.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		
		Reporter.log("rinki",true);
		
	}
	
	
}
