import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo 
{

	public static void main(String[] args) throws IOException {
		
		String excelfilepath="C:\\Users\\MonishSahare\\Downloads\\Test data\\New folder\\demo.xlsx";
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream inputstream=new FileInputStream(excelfilepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		
		//using for loop
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rows; r++)
		{
				XSSFRow row=sheet.getRow(r);
					
					for(int c=0;c<cols;c++)
					{
						XSSFCell cell=row.getCell(c);
						switch(cell.getCellType())
						{
						case STRING: System.out.print(cell.getStringCellValue());break;
						case NUMERIC: System.out.print(cell.getNumericCellValue());break;
						case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
						}
						System.out.print(" ");
					}
					System.out.println();
			}	
		
		//Using from iterator
		
//	          Iterator iterator=sheet.iterator();
//	          
//	          while(iterator.hasNext())
//	        	  {
//	        		  
//	        	  			XSSFRow row= (XSSFRow) iterator.next();
//	        	
//	        	  			Iterator CellIterator=row.cellIterator();
//	        	
//	        	  			while(CellIterator.hasNext())
//	        	  			{
//	        	  				XSSFCell cell= (XSSFCell) iterator.next();
//
//	        	  				switch(cell.getCellType())
//	    						{
//	    						case STRING: System.out.print(cell.getStringCellValue());break;
//	    						case NUMERIC: System.out.print(cell.getNumericCellValue());break;
//	    						case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
//	    						}
//	        	  				System.out.println(" ");
//	        	  			}
//	        	  			System.out.println();
//	        	  }
	          
	          }
		
	}		
	
	
