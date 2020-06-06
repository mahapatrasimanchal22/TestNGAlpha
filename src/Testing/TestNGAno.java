package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAno {
	public WebDriver drive;
	
	@Test
	public void Google() {
		Reporter.log("Google",true);
	}
	@Test
	public void Sikha() {
		Reporter.log("Skha",true);
	}
	@Test
	public void Chutki() {
		Reporter.log("Chutki",true);
	}
	@BeforeMethod
	public void babuni() {
		Reporter.log("babuni",true);
	}
	@BeforeClass
	public void sima() {
		Reporter.log("sima",true);
	}
	@BeforeTest
	public void simanchal() {
		Reporter.log("simanchal",true);
	}
	@BeforeSuite
	public void mahapatra() {
		Reporter.log("mahapatra",true);
	}
	@AfterMethod
	public void sanhok() {
		Reporter.log("sanhok",true);
	}
	@AfterClass
	public void rozhok() {
		Reporter.log("rozhok",true);
	}
	@AfterTest
	public void pochiki() {
		Reporter.log("pochiki",true);
	}
	@AfterSuite
	public void militrybasearea() {
		Reporter.log("militrybasearea",true);
	}
}
