package ExcelExamples;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLoop {

	public static void main(String[] args) throws Exception {
		
		File a = new File("C:\\Excel Sheet Files\\Test Data.xlsx");
		
		FileInputStream b = new FileInputStream(a);
		
		XSSFWorkbook c = new XSSFWorkbook(b);
		
		XSSFSheet sheet =	c.getSheetAt(0);
		
	int rowCount =	sheet.getLastRowNum();

//	System.out.println(rowCount+1); // row count start from 0
	
	for (int i=0; i<=rowCount; i++) {
		
	String data0 =	sheet.getRow(i).getCell(0).getStringCellValue();
	
	System.out.println(data0);
	
//	System.out.println(i+" "+data0);
	
	}
		
		c.close();
		

	}

}
