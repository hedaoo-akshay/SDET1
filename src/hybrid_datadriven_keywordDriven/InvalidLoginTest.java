package hybrid_datadriven_keywordDriven;

import org.openqa.selenium.By;

public class InvalidLoginTest extends BaseTest {

	public static void main(String[] args) throws Throwable {
	
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		FileLib flib = new FileLib();
		int rc= flib.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=rc;i++)
		{
			String un = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String pw = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(6000);
		}

	}

}
