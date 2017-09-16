package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.icertis.webautomation.utils.ExcelManager;

public class ExcelManager 
{
	
	
	static XSSFSheet sheet_global;
	static XSSFWorkbook wbook;
	public static String FILE_PATH = "C:\\Users\\ankita\\git\\Guru\\Guru\\src\\test\\java\\ExcelWorkbook\\TopSecrete.xlsx";	
	
	public static String read_sheet(String filename_path,int sno,int r,int c)
	{
		 try
		 {
		         FileInputStream file = new FileInputStream(new File (filename_path));
		         XSSFWorkbook workbook = new XSSFWorkbook(file);
		         XSSFSheet sheet = workbook.getSheetAt(sno);
		         return sheet.getRow(r).getCell(c).toString();
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
			 return null;
		 }
         
	}

}