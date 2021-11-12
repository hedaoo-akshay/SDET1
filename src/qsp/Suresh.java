package qsp;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suresh {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\KCSM6\\Automation\\Drivers\\geckodriver.exe");
		
	WebDriver d = new FirefoxDriver();
	
	d.get("https://www.flipkart.com/");
	
	//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
    d.findElement(By.xpath("//button[text()='✕']")).click();
	
    d.findElement(By.xpath("//span[text()='Cart']")).click();
    
    WebDriverWait wait= new WebDriverWait(d, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login")));
    
    d.findElement(By.xpath("//a[text()='Login']")).click();
    
    
	
	
	
    
	
	}

}
