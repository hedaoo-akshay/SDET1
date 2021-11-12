package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment1 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//img[@alt='HYD']")).click();	
		driver.findElement(By.id("4")).click();
		WebElement search=driver.findElement(By.xpath("//input[@class='sc-bqjOQT bEsook']"));
		search.sendKeys("Love Story");
		Thread.sleep(4000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//h4[text()='Crew']"));
		Point loc1=element.getLocation();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc1);
		Thread.sleep(4000);
		WebElement screenshot= driver.findElement(By.xpath("//a[@href='https://in.bookmyshow.com/person/sekhar-kammula/18779']"));
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\KCSM6\\Screenshots\\Director.png");
		Files.copy(src, dest);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='31.9K reviews']")).click();
		Thread.sleep(4000);
		List<WebElement> allreviews = driver.findElements(By.xpath("//h5[@class='style__HashTags-sc-r6zm4d-13 bqZRwe']"));
		System.out.println("No.of reviews on WebPage: "+ allreviews.size());
		for(int i=0;i<allreviews.size();i++)
		{
			String review=allreviews.get(i).getText();
			System.out.println(review);
		}
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Trailers (3)']")).click();
		WebElement tr=driver.findElement(By.xpath("//img[@src='https://img.youtube.com/vi/WZUH2QTB-yw/0.jpg']"));
		Point loc3=tr.getLocation();
		js.executeScript("window.scrollBy"+loc3);
		driver.findElement(By.xpath("(//div[@class='style__LazyContainer-sc-eykeme-0 cNWjsv'])[1]")).click();
	}

}
