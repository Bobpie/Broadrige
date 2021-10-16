package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
public static String[][] getData(String excelFilePath) throws IOException {
	// To Read an excel file  XSSFWorkbook -> Class
	XSSFWorkbook book = new XSSFWorkbook(excelFilePath);
	// To Read a particular sheet from the excel file
	XSSFSheet sheet = book.getSheetAt(0);
	// To find the total number of rows available in the sheet
	int rowCount = sheet.getLastRowNum();
	System.out.println("Row Count: "+rowCount);
	// To find the number of columns available in a row
	XSSFRow firstRow = sheet.getRow(0);
	short colCount = firstRow.getLastCellNum();
	System.out.println("Col Count: "+colCount);
	
	// Create a two dimensional array to store the data that we read
	String[][] data = new String[rowCount][colCount];
	
	// Iterate over the rows and columns
	for (int i = 1; i <= rowCount; i++) {
		// Reading Each Row out of the sheet
		XSSFRow eachRow = sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			// Reading each cell out of the rows
			XSSFCell eachCell = eachRow.getCell(j);
			String cellData = eachCell.getStringCellValue();
			// Adding Data to the 2D array
			data[i-1][j] = cellData;
			System.out.print(cellData+"  ");
		}
		System.out.println();
	}
	book.close();
	return data;
}
}
