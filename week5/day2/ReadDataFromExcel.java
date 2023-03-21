package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook wb= new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("total number of rows "+ lastRowNum);
		
		
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("total number of cellnum "+ lastCellNum	);
		
		for (int i = 1; i <=lastRowNum; i++) {
				XSSFRow row = sheet.getRow(i);
				
				for (int j = 0; j <lastCellNum; j++) {
					
					XSSFCell cell = row.getCell(j);
					String data1 = cell.getStringCellValue();
					System.out.println(data1);
					wb.close();
				}
		}
	}

}

