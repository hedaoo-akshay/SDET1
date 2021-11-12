package hybrid_datadriven_keywordDriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		FileLib flib = new FileLib();
		String un=flib.readPropertyData(PROP_PATH, "username");
		String pw=flib.readPropertyData(PROP_PATH, "password");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();

		wlib.waitForTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "homeTitle"),wlib.getPageTitle(), "Home Page");
	}

}