package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelData(String fileName) throws IOException {
		
		//to get into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//to get into the right sheet using name
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//to get into the right sheet using index
		XSSFSheet sheet = wb.getSheetAt(0);
		
		// to find the number of rows (exclude the first row)
		int rowCount = sheet.getLastRowNum();
		
		//to find the number rows including the first row
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		//declare 2d array
		String[][] data = new String[rowCount][cellCount];
	
		
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] =cellValue;
				
				//System.out.println(data[i-1][j]);
				//System.out.println(cellValue);
			}
				//System.out.println();
			
		}
		
		/*
		 * //to get into the right row XSSFRow row = sheet.getRow(1);
		 * 
		 * //to get into the cell XSSFCell cell = row.getCell(0);
		 * 
		 * //to read data from a cell String company = cell.getStringCellValue();
		 * 
		 * System.out.println(company);
		 */
		
		
		wb.close();
		
		return data;
		
	}

}
