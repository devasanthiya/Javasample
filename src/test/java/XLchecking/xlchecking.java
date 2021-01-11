package XLchecking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlchecking {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f1);
		Workbook w = new XSSFWorkbook(fs);
		// open particular sheet
		Sheet sheet1 = w.getSheet("name");
		Row r=sheet1.getRow(1);
		Cell cell1=r.getCell(1);
		System.out.println(cell1);
		System.out.println("Done");
		

	}

}
