package qsp;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	public static void DynamicTable(WebDriver driver, int colNum) {
		driver.get("file:///F:/HTML/Dynamicwebtable.html");
		List<WebElement> col= driver.findElements(By.xpath("//table[@id='t1']//tr[*]//td["+colNum+"]"));
		System.out.println(col.size());
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("file:///F:/HTML/webtable.html");
//		List<WebElement> alltrs=driver.findElements(By.tagName("tr"));
//		System.out.println("No. of Rows in Webtable: "+ alltrs.size());
//		
//		WebElement table1 =driver.findElement(By.id("t1"));
//		List<WebElement> tb1rows=table1.findElements(By.tagName("tr"));
//		System.out.println("No. of Rows in Table 1: "+ tb1rows.size());
//		
//		WebElement table2 =driver.findElement(By.xpath("//table[@id='t2']//tr[3]"));
//		List<WebElement> td3= table2.findElements(By.tagName("td"));
//		System.out.println("No. of data present in Row 3 of Table 2: "+ td3.size());

		DynamicTable(driver, 4);
	}

}
