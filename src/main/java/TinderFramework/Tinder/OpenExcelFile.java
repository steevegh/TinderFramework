package TinderFramework.Tinder;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class OpenExcelFile {
	public static XSSFWorkbook xlsfilepath;
	public static XSSFSheet xlsSheetName;
	public static XSSFCell Cell;
	
	public static void openExcelPath(String Path,String SheetName) throws Exception {
		try { 
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\ghallabs\\Documents\\TestDataTinder.xlsx");
		xlsfilepath = new XSSFWorkbook(ExcelFile);
		xlsSheetName =  xlsfilepath.getSheet("Sheet1");
		} catch (Exception e){
			throw (e);
		}
	}
		public static String getCellData(int numberRow, int numberColunm) {
			try {
				Cell = xlsSheetName.getRow(numberRow).getCell(numberColunm);
				String CellData = Cell.getStringCellValue();
				return CellData;
			} catch (Exception e) {
				
			}
				return "";
		}

}
