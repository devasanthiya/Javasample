package XLchecking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xmlbeans.SimpleValue;

public class Allcellvalues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl = new File(
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\Mavenprog\\XLdata\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(fl);
		Workbook wb = new XSSFWorkbook(fs);

		Sheet s1 = wb.getSheet("Empdata");
		// System.out.println(s1);

		for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {

			Row row1 = s1.getRow(i);
			for(int j=0;j<row1.getPhysicalNumberOfCells();j++)
			{
				Cell cell1=row1.getCell(j);
				int cellType = cell1.getCellType();
				String Value = "";
				if(cellType==0)
				{
					Value=cell1.getStringCellValue();
					//System.out.println(Value);
				}
				else if(DateUtil.isCellDateFormatted(cell1))
				{
					Date d = cell1.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd//MM//yyy");
					//System.out.println(s);
					Value=s.format(d);
				}
				else
				{
					double dd = cell1.getNumericCellValue();
					long l=(long)dd;
					Value=String.valueOf(l);
				}
				System.out.println(Value);
				
				}
			}
			

		}

	}


