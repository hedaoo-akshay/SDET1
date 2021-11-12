package datadrivenframework;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLib {
	public String readExcelData(String excelpath, String sheetName, int row, int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return excelvalue;
	}

	public int getRowCount(String excelpath, String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount= wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
	}
	
	public void writeExcelData(String excelpath, String sheetName, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
}
