package methodDrivenFramework;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	@FindBy(id = "username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath= "//div[text()='Login ']") private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(String pwd) {
		pwtb.sendKeys(pwd);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	public WebElement getUntb() {
		return untb;
	}
	
	public void setUntb(String un) {
		untb.sendKeys(un);
	}
	
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}
}
