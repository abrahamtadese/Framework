package ExcelExamples;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File a = new File("C:\\Excel Sheet Files\\Test Data.xlsx");
		
		FileInputStream b = new FileInputStream(a);
		
		XSSFWorkbook c = new XSSFWorkbook(b);
		
	XSSFSheet sheet =	c.getSheetAt(0);
	
	String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(data0);
	
	String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(data1);
	
	c.close(); // to avoid memory leak

	}

}
