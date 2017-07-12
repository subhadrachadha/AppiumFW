package com.gmp.pages.util;

public class DataUtils {

	
	public static Object[][] getData(String sheetName, Xls_ReaderGMP xls){
	
		int colStartRowNum=0;
		//calculate total cols
		int cols=0;
		while(!xls.getExcelData(sheetName, colStartRowNum,cols).equals("###")){
			cols++;
		}
		Object[][] data = new Object[xls.getRowCount(sheetName)][cols];
		//read the data
		
		for(int rNum=1;rNum<=xls.getRowCount(sheetName);rNum++){
			for(int cNum=0;cNum<cols;cNum++){
				data[rNum-1][cNum]=xls.getExcelData(sheetName, rNum, cNum);
			}
		}
		return data;
		
	}
	
}
