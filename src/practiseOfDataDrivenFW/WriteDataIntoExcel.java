package practiseOfDataDrivenFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Throwable {
		//open file in read mode
		FileInputStream fis = new FileInputStream("./Data/InputData.xlsx");
		//take control
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
//		Row r = sh.getRow(3);
//		Cell c = r.createCell(2);
//		c.setCellValue("Abhishek");
		
		for(int i=0;i<=9;i++)
		{
			
			sh.getRow(i).createCell(2).setCellValue("Abhishek");
		}
		
		FileOutputStream fos = new FileOutputStream("./Data/InputData.xlsx");
		wb.write(fos);
		System.out.println("Done");
	}

}
