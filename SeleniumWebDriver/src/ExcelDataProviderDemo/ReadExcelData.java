package ExcelDataProviderDemo;

public class ReadExcelData {

	public static void main(String[] args) {
		
		
 ExcelDataTwo excel = new ExcelDataTwo("C:\\\\Excel Sheet Files\\\\Test Data.xlsx");
				
 System.out.println(excel.getData(0, 0, 0));

	}

}
