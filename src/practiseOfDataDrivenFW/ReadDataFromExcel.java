package practiseOfDataDrivenFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		//Open the file in read mode
		FileInputStream fis = new FileInputStream("./data/InputData.xlsx");
		//take a control of file
		Workbook wb = WorkbookFactory.create(fis);
//		//Go to particular sheet
//		Sheet sh = wb.getSheet("sheet1");
//		//go to particular row
//		 Row r=sh.getRow(3);
//		 //go to particular cell
//		 Cell c = r.getCell(1);
//		 //Get cell value
//		 String cv = c.getStringCellValue();
//		 //print it
//		 System.out.println(cv);
		
//		System.out.println(wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue());
		
		for (int i=0;i<=9;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.println(wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue());	
		}
		}
	}

}
