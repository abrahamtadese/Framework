package ExcelDataProviderDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataTwo {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	
	// constructor
	public ExcelDataTwo(String excelPath) {
		
		try {
			File a = new File(excelPath);
			
			FileInputStream b = new FileInputStream(a);
			
			wb = new XSSFWorkbook(b);
			
			
		
		} catch (Exception e) {
			
		System.out.println(e.getMessage());
		
		}
		
	}
	
	public String getData(int sheetnum, int row,int colunm) {
		
		sheet =	wb.getSheetAt(sheetnum);
		
	String data = sheet.getRow(row).getCell(colunm).getStringCellValue();
	
	return data;
	
	}
	
	
	public int getRowCount(int sheetIndex) {
		
	int row =	wb.getSheetAt(sheetIndex).getLastRowNum();
		
		row=row+1;
		
		return row;
			
		
	}

}
