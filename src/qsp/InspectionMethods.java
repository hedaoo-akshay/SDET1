package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InspectionMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
//		driver.get("file:///F:/HTML/index.html");
//		on the browser find the element with tagname as 'a'
//		WebElement linkAddress = driver.findElement(By.tagName("a"));
//		//on the address perform click action
//		linkAddress.click();
		
		//on the browser find the element with id
//				WebElement linkAddress = driver.findElement(By.id("i1"));
			//	on the address perform click action
//				linkAddress.click();
		
		//on the browser find the element with name
//		driver.findElement(By.name("n1")).click();
		
		//on the browser find the element with class name
//		driver.findElement(By.className("c1")).click();
		
		//on the browser find the element with
//		driver.findElement(By.linkText("Googly")).click();
		
//		on the browser find the element by giving partial link
//		driver.findElement(By.partialLinkText("Go")).click();
		
		//on the browser find the element by CssSelector
		
		//driver.findElement(By.cssSelector("a[value='v1']")).click();
			
		driver.get("https://www.google.com");
		//on the browser to find element with xpath
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
			
	}

	
}
