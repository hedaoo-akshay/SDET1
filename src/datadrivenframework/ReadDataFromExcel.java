package datadrivenframework;





import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
	//open file in read mode
FileInputStream fis = new FileInputStream("F:\\KCSM6\\Automation\\Data\\FreedomFighter.xlsx");
	//Take control of that file
	Workbook wb=WorkbookFactory.create(fis);
	//go to that particular sheet
	Sheet sh = wb.getSheet("Sheet1");
	//Go to that particular Row
	Row r = sh.getRow(9);
	//go to that particular cell
	Cell c = r.getCell(1);
	//capture the string value present inside it
	String xlval = c.getStringCellValue();
	//print it
	System.out.println(xlval);
	
//	FileInputStream fis = new FileInputStream("./data/FreedomFighter.xlsx");
//	Workbook wb=WorkbookFactory.create(fis);
//	System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue());
	
	
	}

}
