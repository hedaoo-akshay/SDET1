package practiseOfDataDrivenFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AbRFE {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("F:\\KCSM6\\Automation\\Data\\InputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet gs = wb.getSheet("sheet1");
		Row ro = gs.getRow(4);
		Cell ce = ro.getCell(1);
		String sv = ce.getStringCellValue();
		System.out.println(sv);
	}

}
