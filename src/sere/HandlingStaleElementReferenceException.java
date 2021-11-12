package sere;



import hybrid_datadriven_keywordDriven.BaseTest;

public class HandlingStaleElementReferenceException extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage();
		driver.navigate().refresh();
//		lp.getUntb().sendKeys("admin");
		lp.typeUn("admin");

	}

}
