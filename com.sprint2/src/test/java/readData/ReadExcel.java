package readData;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ReadExcel {
	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			//Object[][] testdata = null;
			//Getting the Relative path for excel from Source Excel folder
			String filePath = System.getProperty("user.dir")+"//Excel//TestData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			System.out.println(testData);
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
}	
	/*public static void main(String[] args) throws Exception {
	Read obj = new Read();
	obj.readExcel(0,0);
	}*/









// package readData;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.junit.Test;
//
//@SuppressWarnings("unused")
//public class ReadExcelSheet {
//
//	@Test
//	public void dataRead() throws Exception {
//		
//		 
//		String filePath = System.getProperty("user.dir")+"//Excel//TestData.xlsx";
//		FileInputStream fis = new FileInputStream(filePath);
//		XSSFWorkbook xsf = new XSSFWorkbook(fis);
//		XSSFSheet sheet = xsf.getSheetAt(0);
//		String entry = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(entry);
//		String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(entry1);
//		 
//		xsf.close();
//}
//}