package XLchecking;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rowcellcount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// XLSX path
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
//To read workbook
		FileInputStream fs = new FileInputStream(file1);
		// Obj creation for Workbook

		Workbook ws = new XSSFWorkbook(fs);
		// selecting sheet from all sheets
		Sheet sheet1 = ws.getSheet("Empdata");
		int noofrows = sheet1.getPhysicalNumberOfRows();
		System.out.println("No of Rows:" + noofrows);

		// cell is getting from row

		Row rows = sheet1.getRow(1);
		System.out.println(rows);
		int noofcells = rows.getPhysicalNumberOfCells();
		System.out.println("no of cells are:" + noofcells);

	}

}
