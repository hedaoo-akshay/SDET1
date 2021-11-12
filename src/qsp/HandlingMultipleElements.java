package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/HTML/multiple.html");
		
		List<WebElement> allLinksAddr=driver.findElements(By.tagName("a"));
		
		//count the number of links
		
		int noofLinks = allLinksAddr.size();
		
		System.out.println("No.of Links: " + noofLinks );
		
		for(int i=0; i<=allLinksAddr.size()-1; i++)
		{
//		 WebElement onelinkAddr=allLinksAddr.get(i);
//		 String text= onelinkAddr.getText();
//		 System.out.println(text);
//		 
		 System.out.println(allLinksAddr.get(i).getText());
		 
		 //click on last link
		 allLinksAddr.get(allLinksAddr.size()-1).click();
		}

	}

}
