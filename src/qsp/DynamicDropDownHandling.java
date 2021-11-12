package qsp;



import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(6000);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> dda =driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		System.out.println(dda.size());
		
		for(int i=0; i<=dda.size()-1; i++)
		{
		System.out.println(dda.get(i).getText());
		 
		}
		
		for(int i=0; i<=dda.size()-1; i++)
		{
			if(dda.get(i).getText().equals("qspiders reviews"))
			{
				dda.get(i).click();
			}		
	 
		}
	
	}

}
