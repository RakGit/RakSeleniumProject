package TestNG;

import org.testng.annotations.Test;

import AutoIT.AutoITDemo;

public class FirstTestNG {
	
	@Test
	public void T1() throws Exception
	{
		AutoITDemo objAut=new AutoITDemo();
		objAut.driver();
		objAut.fileUpload();
		objAut.getScreenShot();
	
	}
	
	

}
