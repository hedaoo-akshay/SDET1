package qsp;

import java.io.File;
import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakingScreenshotAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://yuvadhwaja.in/");
		driver.navigate().to("http://yuvadhwaja.in/");
		driver.findElement(By.xpath("//a[text()='Initiatives']")).click();
		Thread.sleep(5000);
//		List<WebElement> allphotos=driver.findElements(By.xpath("//img[@class='img-fluid rounded mb-4']"));
//		for(int i=0;i<allphotos.size();i++)
//		{
//			WebElement onephoto=allphotos.get(i);
//			File src= onephoto.getScreenshotAs(OutputType.FILE);
//			String add="F:\\KCSM6\\Screenshots\\YuvaDhwajaPhoto"+i+".png";
//			File dest=new File(add);
//			Files.copy(src, dest);
//			
//		}
//		
		//Thru Typecasting
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest= new File("F:\\KCSM6\\Screenshots\\YuvaDhwaja1.jpg");
//		Files.copy(src, dest);
		
//		//Thru Downcasting
//		RemoteWebDriver ds=(RemoteWebDriver)driver;
//		File src =ds.getScreenshotAs(OutputType.FILE);
//		File dest=new File("F:\\KCSM6\\Screenshots\\YuvaDhwaja2.jpg");
//		Files.copy(src, dest);
		
		//thru EventFiringWebDriver class
		EventFiringWebDriver es=new EventFiringWebDriver(driver);
		File src =es.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\KCSM6\\Screenshots\\YuvaDhwaja3.jpg");
		Files.copy(src, dest);
		
	}

}
