package CheckPoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public String readExcel(int row,int col, String fileName,String sheetName) throws IOException{
			   
		    File file =    new File(fileName);

		    FileInputStream inputStream = new FileInputStream(file);
			 
		    @SuppressWarnings("resource")
			XSSFWorkbook ExcelWBook = new XSSFWorkbook(inputStream);  //apche dependency as below
		   
		    XSSFSheet excelSheet = ExcelWBook.getSheet(sheetName);   //apche dependency  as below
		   return excelSheet.getRow(row).getCell(col).getStringCellValue().toString();
      
	 }

}
/*
 <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>3.6</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>3.6</version>
</dependency>
 */
