package com.gmp.pages.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Xls_ReaderGMP {
	public static String filename =Constants.XLS_PATH;
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;

	
	public String getExcelData(String sheetName, int row, int column)  {
		FileInputStream fis;
		Workbook wb;
		Sheet s;
		Row r ;
		String retVal="" ;
		try {
				fis = new FileInputStream(filename);	
				wb = WorkbookFactory.create(fis);
				s = wb.getSheet(sheetName);
			    r = s.getRow(row);
			    retVal = r.getCell(column).getStringCellValue();
				return retVal;
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	
	public int getRowCount(String sheetName) {
		int rowCount=0;
		try {
				FileInputStream fis = new FileInputStream(filename);			
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s = wb.getSheet(sheetName);
				rowCount=s.getLastRowNum();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCount;
		}
	
	public void setExcelData(String sheetName, int row, int column,String data) {
		 try {
				FileInputStream fis = new FileInputStream(filename);		
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s = wb.getSheet(sheetName);
			    Row r = s.getRow(row);
			    r.getCell(column).setCellValue(data);
	            FileOutputStream out = new FileOutputStream(filename);
	            wb.write(out);
	            out.flush();
	            out.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
	}
	
}
