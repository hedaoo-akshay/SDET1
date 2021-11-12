package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableAssignment{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(10000);
		List<WebElement> alltrs=driver.findElements(By.xpath("//tr[@class='taskRow']"));
		System.out.println("Total No of TaskRows: "+ alltrs.size());
//		
//		WebElement taskRow1= driver.findElement(By.xpath("//div[text()='3D modelling']/ancestor::tr[@class='taskRow']"));
//		List<WebElement> d= taskRow1.findElements(By.tagName("td"));
//		System.out.println(d.size());
//		
		List<WebElement> title= driver.findElements(By.xpath("//td[@class='names']//div[@class='title']"));
		for(int i=0; i<title.size();i++)
		{
		System.out.println(title.get(i).getText());
		}
		
//	    WebElement box	= driver.findElement(By.xpath("//div[@class='tasksTable scrollToTopButtonShifted']"));
		
		JavascriptExecutor js= (JavascriptExecutor)alltrs;
		js.executeScript("window.scrollBy(0,200)");
				

	}

}

