package com.amazon.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleXSSFReader {
	public static String valueOf;

	public static String singleData(String name, int rowNo, int Cellno) throws IOException {
		File f = new File("C:\\Users\\sriva\\OneDrive\\Desktop\\datadriven.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheet(name);

		Row r = s.getRow(rowNo);

		Cell c = r.getCell(Cellno);

		CellType ce = c.getCellType();
		if (ce.equals(CellType.STRING)) {
			valueOf = c.getStringCellValue();
			// System.out.println(ss);
		} else if (ce.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i = (int) d;
			valueOf = String.valueOf(i);

		}
		return valueOf;
	}

	public static void main(String[] args) throws IOException {
		singleData(valueOf, 0, 0);
	}

}
