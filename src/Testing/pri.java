package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class pri 
{
	@Test(priority=1,invocationCount=1)
	public void google() {
		System.out.println("google");
	}
	@Test(priority=3,invocationCount=3)
	public void chutki() {
		System.out.println("chutki");
	}
	@Test(priority=2,invocationCount=2)
	public void sikha() {
		System.out.println("sikha");
	}
	
}
