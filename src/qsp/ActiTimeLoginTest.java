package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//enter URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Verify Login page
		String expectedTitle= "actiTIME - Login";
		String actualTitle= driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login Page is Displayed, PASS");
		}
		else
		{
			System.out.println("Login Page is NOT Displayed,FAIL");
		}
		
		Thread.sleep(2000);
		
		//enter valid username into username text box
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//enter valid password into password textbox
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		Thread.sleep(2000);
		
	//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		 WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.titleContains("Enter"));
		//verification of homepage
		
		String expectedHomePg= "actiTIME - Enter Time-Track";
		String actualHomePg= driver.getTitle();
		System.out.println(actualHomePg);
		
		if(actualHomePg.equals(expectedHomePg))
		{
			System.out.println("Home Page is Displayed, PASS");
		}
		else
		{
			System.out.println("Home Page is NOT Displayed, FAIL");
		}
		
		

	}

}
