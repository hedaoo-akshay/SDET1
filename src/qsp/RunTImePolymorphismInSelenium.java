package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunTImePolymorphismInSelenium {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Browser name: 1.Google Chrome 2.FireFox ");
		int browser=s.nextInt();
		
		WebDriver driver = null;
		
		if(browser == 1) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(browser == 2) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	     driver=new FirefoxDriver();
		}
		else {
			System.out.println("Enter correct value");
		}
		
		
		driver.close();
	}

}
