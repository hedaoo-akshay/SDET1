package sere;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hybrid_datadriven_keywordDriven.BaseTest;

public class LoginPage {

	//Declaration
	@FindBy(id= "username") private WebElement untb;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//Utilization
	public WebElement getUntb()
	{
		return untb;
	}
	
	public void typeUn(String un)
	{
		untb.sendKeys(un);
	}
	
}
