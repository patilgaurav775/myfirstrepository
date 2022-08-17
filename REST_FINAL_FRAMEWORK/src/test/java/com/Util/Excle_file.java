package com.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excle_file {
	 private static XSSFWorkbook workbook;
	 private static XSSFSheet sheet;
	 private static CellType cell;
	
	
	public Excle_file(String filepath, String name) {
		FileInputStream file;
		try {
			file = new FileInputStream(filepath);
			workbook=new XSSFWorkbook(file);
			sheet=workbook.getSheet(name);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public  Object[][] readexcle(int rowstart, String testname) throws Exception{
		
		 Object[][] data=null;
		  int lastrow =sheet.getPhysicalNumberOfRows();
		  
		  int lastcell=sheet.getRow(0).getLastCellNum();
		  data=new Object[lastrow-1][lastcell];
		  
		 System.out.println("last row "+ lastrow); 
		  System.out.println("last cell "+ lastcell);
		 System.out.println(getstrval(rowstart,0));
		  
		 if (testname.equalsIgnoreCase(getstrval(rowstart,0))) {
		 int ci=0;
		  for (int a=rowstart;a<lastrow;a++,ci++) { 
			  
				 int cj=0;
		for (int b=0;b<lastcell;b++,cj++) {
			
			cell=sheet.getRow(a).getCell(b).getCellType();
		  
			switch(cell) {
			case STRING : data[ci][cj]=getstrval(a,b); break;
			case NUMERIC:data[ci][cj]= getNurval(a,b); break;
			
			}
		}
		}
		  		 
		  }
		 else {
			  throw new Exception ("test name not specified");
		 }
		  
		  return data;
		  
	}
		  
		  
		  
		  public String getstrval(int i,int j) {
			  String str=sheet.getRow(i).getCell(j).getStringCellValue();
			  return str;
		  }
		  public Double getNurval(int i,int j) {
			  double Nur=sheet.getRow(i).getCell(j).getNumericCellValue();
			  return Nur;
		  }
		  
		  
		  
		  
		  public static void creatdata(int row,String filepath,String placeid) {
			  XSSFWorkbook workbook=new XSSFWorkbook();
			 XSSFSheet sheet =workbook.getSheetAt(1);
			 
			  sheet.createRow(row);
			  sheet.getRow(row).createCell(0).setCellValue(placeid);
			  
			  File file=new File(filepath);
			  try {
				FileOutputStream output=new FileOutputStream(file);
				workbook.write(output);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			  
		  }
		  
		  
}
