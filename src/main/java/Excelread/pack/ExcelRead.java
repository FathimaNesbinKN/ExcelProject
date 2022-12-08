package Excelread.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelRead {
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream stud=new FileInputStream(new File("/home/nesbin/Documents/student.xls"));  
	 
		HSSFWorkbook wb=new HSSFWorkbook(stud);   
	
		HSSFSheet sheet=wb.getSheetAt(0);  
		
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
			
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  
			System.out.println(cell);
			
	
		}
		
		}
	}

}
