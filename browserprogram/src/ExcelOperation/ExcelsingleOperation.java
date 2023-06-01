package ExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelsingleOperation {
public static void main(String[] args) throws IOException {
		
		// Identifying the file in the System
		FileInputStream excelTestDataFile = new FileInputStream("./src/ExcelFiles/Excel Eclipse.xlsx");
		
		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// Identify a particular sheet in the workBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		// Creating a row in the Sheet
		Row newRow=testDataSheet.createRow(2);
		
		// Creating a Row of a Cell
		Cell newRowOfCell=newRow.createCell(3);
		
// In the save Row which is created - creating a new Cell( need not create a row again)
		 Cell newCell1=newRow.createCell(4);
		
		// setting a value into the Row of a Cell created
		newRowOfCell.setCellValue("LiveTech");
		
// in the same row of a cell new value is set - old value will be replaced with new value
		newRowOfCell.setCellValue("Srini");
		
		newCell1.setCellValue("WebDriver"); // same row of a new cell will set with a value 
		
		// Save the Excel file - with a name along with the workBook
FileOutputStream fileOutPut = new FileOutputStream("./src/ExcelFiles/Excel Eclipse.xlsx");
		workBook.write(fileOutPut);
	}
}


