package qsp;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) {
		//Open the Browser
		
		//Just create an object of browser class
		
		//set system property
		
		//key means type of the browser
		//value means path of driver exe file
		
		System.setProperty("webdriver.chrome.driver", "F:\\KCSM6\\Automation\\Drivers\\chromedriver.exe");
	    ChromeDriver ch_driver = new ChromeDriver();	
	    ch_driver.close();
	    
		System.setProperty("webdriver.gecko.driver", "F:\\KCSM6\\Automation\\Drivers\\geckodriver.exe");
		FirefoxDriver ff_driver=new FirefoxDriver();
		ff_driver.close();
		
	
		
	}

}
