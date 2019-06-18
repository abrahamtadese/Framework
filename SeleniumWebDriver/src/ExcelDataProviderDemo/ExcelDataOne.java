package ExcelDataProviderDemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataOne {
	

	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	
	
	public ExcelDataOne(String excelPath) {
		
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

}
