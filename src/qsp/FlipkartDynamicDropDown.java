package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//	 WebDriver driver=new FirefoxDriver();
	 driver.navigate().to("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebElement dda= driver.findElement(By.xpath("//input[@name='q']"));
	 dda.sendKeys("Laptops");
	 Thread.sleep(3000);
	 dda.sendKeys(Keys.DOWN);
	 dda.sendKeys(Keys.ENTER);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebElement range= driver.findElement(By.xpath("//div[@class='_2b0bUo']/descendant::div[@class='_3uDYxP']/descendant::option[@value='50000']"));
	 range.click();
	 
	 Thread.sleep(3000);
	 WebElement processor= driver.findElement(By.xpath("//div[text()='Core i3']"));
	 processor.click();
	 
	 Thread.sleep(3000);
	 WebElement brandlist= driver.findElement(By.xpath("//div[text()='Brand']"));
	 brandlist.click();
	 
	 Thread.sleep(3000);
	 WebElement brand=driver.findElement(By.xpath("//div[text()='DELL']"));
	 brand.click();
	 
	 Thread.sleep(5000);
	 List<WebElement> prices=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	 for(int i=0;i<=prices.size()-1;i++)
	 {
		 
		 System.out.println(prices.get(i).getText());
	 } 
	}

}
