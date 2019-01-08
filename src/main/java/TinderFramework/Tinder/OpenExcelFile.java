package TinderFramework.Tinder;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenExcelFile {

	public static void readFromExcel(String file) throws Exception {
		try {
			XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
			// C:\Users\ghallabs\Documents\TestDataTinder.xlsx
			XSSFSheet myExcelSheet = myExcelBook.getSheet("TestDataTinder.xlsx");
			XSSFRow row = myExcelSheet.getRow(0);

			if (row.getCell(0).getCellType() != null) {
				String name = row.getCell(0).getStringCellValue();
				System.out.println(name);
			}

			if (row.getCell(1).getCellType() != null) {
				String pass = row.getCell(0).getStringCellValue();
				System.out.println(pass);
			}
		} catch (Exception e) {
			throw (e);
		}
		Thread.sleep(2000);

	}

}
