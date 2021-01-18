package com.FantasySpin.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read 
{
	public static int lastRown;
	static String d;
	public String read(int a)
	{
		try 
		{
			File src=new File("C:\\Users\\KarthiSharmi\\Desktop\\codings\\Reim.xlsx");
			FileInputStream fi=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet s=wb.getSheet("Sheet2");
			lastRown=s.getLastRowNum();
			XSSFRow row=s.getRow(a);
			XSSFCell cel=row.getCell(5);
			
				return cel.getStringCellValue();
				
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
				return "No Matched Data Found";
			}
	}
}
