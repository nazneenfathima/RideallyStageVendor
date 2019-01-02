package com.RideallyStageVendor.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	//To get data
	public static String getData(String filepath,String sheetname,int rn,int cn)
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File(filepath));
			Sheet sh= WorkbookFactory.create(fis).getSheet(sheetname);
			String data=sh.getRow(rn).getCell(cn).getStringCellValue();
			return data;	
		}
		catch(Exception e)
		{
			return " ";
		}
	}
	
	//To getrow
	public static int getRowCount(String filepath, String sheetname)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filepath));
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetname);
			int rc = sh.getLastRowNum();
			return rc;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	
//To getcell count
public static int getCellCount(String filepath, String sheetname, int rn)
{
	try 
	{
		FileInputStream fis = new FileInputStream(new File(filepath));
		Sheet sh = WorkbookFactory.create(fis).getSheet(sheetname);
		int cc = sh.getRow(rn).getLastCellNum();
		return cc;
	} 
	catch (Exception e) 
	{
		return 0;
	}
}
	
}
