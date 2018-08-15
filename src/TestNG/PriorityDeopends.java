package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityDeopends {
	
	@Test(priority=0)
	public void T1()
	{
		Reporter.log("Inside T1");
		//Assert.fail("Failed T1");
	}
	@Test(priority=3, dependsOnMethods="T1")
	public void T2()
	{
		Reporter.log("Inside T4");
	}
	@Test(priority=1)
	public void T3()
	{
		Reporter.log("Inside T2");
	}
	@Test(priority=2)
	public void T4()
	{
		Reporter.log("Inside T3");
	}
	

}
