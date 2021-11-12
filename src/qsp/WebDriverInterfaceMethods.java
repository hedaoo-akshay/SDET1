package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInterfaceMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//	    String pageURL = driver.getCurrentUrl();
//		System.out.println(pageURL);
//		if(pageURL.equals("https://www.google.com/"))
//		{
//			System.out.println("Google URL is Entered. PASS");
//		}
//		else
//		{
//			System.out.println("Google URL is Not There. FAIL");
//		}

//		String pgSrc = driver.getPageSource();
//		System.out.println(pgSrc);
//		if(pgSrc.contains("Gmail"))
//		{
//			System.out.println("Gmail Link is Present");
//		}
//		else
//		{
//			System.out.println("Gmail Link is NOT Present.");
//		}
//		
		String Title = driver.getTitle();
		System.out.println(Title);
//		if(Title.equals("Google"))
//		{
//			System.out.println("Google page is Displayed. PASS");
//		}
//		else
//		{
//			System.out.println("Google page is NOT Displayed. FAIL");
//		}
		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(3000);
//		
//		Dimension d= new Dimension(300,400);
//		driver.manage().window().setSize(d);
//		
//		Thread.sleep(3000);
//		Point p=new Point(600,400);
//		driver.manage().window().setPosition(p);
//
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
////	
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
    	Thread.sleep(5000); 
		driver.close();
		
	}

}
