package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagOfTestNG {
	
	@Test(priority = 1)
	public void run()
	{
		Reporter.log("run method", true);
	}
	
	@Test(priority = 2, enabled = false)
	public void bun()
	{
		Reporter.log("bun method", true);
	}

	@Test(priority = 3, invocationCount= 10)
	public void gun()
	{
		Reporter.log("gun method", true);
	}
}
