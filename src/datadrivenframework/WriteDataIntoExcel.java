package datadrivenframework;

import java.io.FileInputStream;

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
			//Take control of that file
			Workbook wb=WorkbookFactory.create(fis);
			//go to that particular sheet
			Sheet sh = wb.getSheet("Sheet1");
			//Go to that particular Row
			Row r = sh.getRow(6);
			//Keep the cell ready for writing purpose
			Cell c = r.createCell(2);
			//Provide data
			c.setCellValue("Raghav Sir");
			
			//open file in write mode
			FileOutputStream fos = new FileOutputStream("./Data/InputData.xlsx");
			//save the changes made in the file
			wb.write(fos);
			//print it
			System.out.println("Done");

	}

}
