package CheckPoint;

import java.io.IOException;

import org.testng.annotations.Test;



public class CallingExcelCell {
	
	
	void readexcel_dat() throws IOException
	{
	ExcelRead er =new ExcelRead();

	 String User_name = er.readExcel(1,0,".\\Data\\ReadLogin.xlsx","Sheet1");
	 System.out.println("Username read from the excel:-"+User_name);
	}

}
