package Tests;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static FileInputStream fis = null ;
public static FileInputStream getFileInputStream() {
	
	
	String FilePath = System.getProperty("user.dir") + "/src/test/java/data/SaraTask.xlsx";
	File srcFile = new File(FilePath);
	try {
		fis = new FileInputStream(srcFile);
	} catch (FileNotFoundException e) {
		
		System.out.println("Test data file not found, terminating process: check file path of test data");
		System.exit(0);
	}
	return fis;
	
}

public Object [][] getExcelData(String sheetName) throws IOException{
	
	
fis = getFileInputStream();

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);

int TotalNumberOfRows = sheet.getLastRowNum();
//int TotalNumberOfCols = 1 ;
int TotalNumberOfCols = sheet.getRow(0).getLastCellNum() ;
//String [][] ArrayExcelData = new String [TotalNumberOfRows][TotalNumberOfCols];
String [][] ArrayExcelData = new String [TotalNumberOfRows-1][TotalNumberOfCols];
for (int i = 1; i < TotalNumberOfRows; i++)
{for (int j = 0; j < TotalNumberOfCols; j++) {
	XSSFRow row = sheet.getRow(i);
	//ArrayExcelData[i][j] = row.getCell(j).toString();
	ArrayExcelData[i-1][j] = row.getCell(j).toString();
	
}

	
}

wb.close();
return ArrayExcelData;
}

}




