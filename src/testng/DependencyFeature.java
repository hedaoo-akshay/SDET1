package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {
	@Test(priority = 2)
	public void register1()
	{
		Reporter.log("Registered Successfully", true);
	}
	
	@Test(priority = 2)
	public void register2()
	{
		Assert.fail();
		Reporter.log("Registered Successfully", true);
	}
	
	@Test(priority = 3, dependsOnMethods= {"register1", "register2"})
	public void delet()
	{
		Reporter.log("Deleted Successfully", true);
	}
	

}
