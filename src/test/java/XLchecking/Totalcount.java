package XLchecking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Totalcount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(file1);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheetAt = wb.getSheetAt(1);
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			//System.out.println(row);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell1=row.getCell(j);
				System.out.println(cell1);
			}
		}
		

	}

}
