package qsp;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupsAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement calender=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']"));
		Point loc=calender.getLocation();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+ loc);
		calender.click();
		driver.findElement(By.xpath("//*[local-name()='svg' and @class='c-pointer c-secondary-500']")).click();
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[local-name()='svg' and @data-testid='rightArrow']"));
		next.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Dec')]//div[text()='28']")).click();
//		driver.findElement(By.xpath("//div[contains(@aria-label,'Nov')]//div[text()='28']")).click();

	}

}
