package resource;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
//import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Exceldrivendata {
	
	WebDriver driver;

	public Exceldrivendata(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public  ArrayList<String> getdata(String testcasename) throws IOException
	{
	  ArrayList<String> a= new ArrayList<String>();
	  String basepath=System.getProperty("user.dir");
		String excelpath= basepath + "/src/main/java/resource/skscontact.xlsx";
		System.out.println(excelpath);
		FileInputStream fis= new FileInputStream(excelpath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount=workbook.getNumberOfSheets();
		XSSFSheet worksheet = null;
		for(int i=0;i<sheetcount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				worksheet= workbook.getSheetAt(i);
			}
		}
		
		
		Iterator<Row>  rows= worksheet.iterator();
		Row Firstrow=rows.next();
		Iterator<Cell> ce= Firstrow.cellIterator();
		int k=0;
		int column=0;
		while(ce.hasNext())
		{
			Cell value=ce.next();
			if (value.getStringCellValue().equalsIgnoreCase("Name"))
			{
				column=k;
			}
			k++;
		}
		
		System.out.println(column);
		
		while(rows.hasNext())
		{
			Row r= rows.next();
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
			{
				Iterator<Cell> cv= r.cellIterator();
				while(cv.hasNext())
				{
					Cell c= cv.next();
					if(c.getCellTypeEnum()==CellType.STRING)
					{
						a.add(c.getStringCellValue());
					}
					else
					{
						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
					
				}
			}
		}
		return a;
		
		
		

	}


}
