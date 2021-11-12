package keywordDrivenFramework;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		//open file in read mode
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		//create an object of properties class
		Properties prop = new Properties();
		//keep the file ready for reading purpose
		prop.load(fis);
		//give the key to get its value
//		String value = prop.getProperty("browser");
		String value=prop.getProperty("browser", "Incorrect Key");
		//print it
		System.out.println(value);
		
	}

}
