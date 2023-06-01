package com.TestCases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class EmployeeList extends LoginTest {

		   @Test(priority=2,description="OHRM Application Home Page PIM Test")
		public void oHRMApplicationHomePagePIMTest()
		{
		By pimLocator=By.linkText(propertiesFilesProperty.getProperty("pimElementProperty"));
		WebElement pim=driver.findElement(pimLocator);

		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();

		}
		   
		   @Test(priority=3,description="OHRM Application Home Page Employee List Test")
		    public void oHRMApplicationEmployeeListTest()
		    {
		  By employeeListLocator=By.id(propertiesFilesProperty.getProperty("employeeListElementProperty"));
		WebElement employeeList=driver.findElement(employeeListLocator);
		employeeList.click();
		    }

		   @Test(priority=4,description="OHRM Application HomePage Capturing Employee List Test")
		public void oHRMApplicationHomePageCapturingEmployeeListTest() throws IOException
		{
		        Row headerRow=testDatasheet.createRow(3);
		       
		        By resultTableLocator=By.id(propertiesFilesProperty.getProperty("employeeListResultTableProperty"));
		        WebElement resultTable=driver.findElement(resultTableLocator);

		        By webTableHeaderColumnLocator=By.tagName(propertiesFilesProperty.getProperty("employeeListWebTableHeaderColumnProperty"));
		        List<WebElement> webTableHeaderColumns=resultTable.findElements(webTableHeaderColumnLocator);
		       
		/* By webTableHeaderColumnCountLocator=By.tagName(propertiesFilesProperty.getProperty("employeeListWebTableHeaderColumnProperty"));
		List<WebElement> webTableHeaderColumnCount=driver.findElements(webTableHeaderColumnCountLocator);*/
		//int headerColumnCount=webTableHeaderColumnCount.size();
		//System.out.println(headerColumnCount);

		for(int webTableHeaderColumnIndex=0;webTableHeaderColumnIndex<webTableHeaderColumns.size();webTableHeaderColumnIndex++)
		{

		Cell headerRowOfCell=headerRow.createCell(webTableHeaderColumnIndex);

		String employeeListWebTableHeaderColumnText=webTableHeaderColumns.get(webTableHeaderColumnIndex).getText();
		System.out.print(employeeListWebTableHeaderColumnText+"  - ");

		headerRowOfCell.setCellValue(employeeListWebTableHeaderColumnText+"-");

		/*By employeeListWebTableHeaderLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th["+webTableHeaderColumnIndex+"]");
		WebElement employeeListWebTableHeader=driver.findElement(employeeListWebTableHeaderLocator);
		String employeeListWebTableHeaderText=employeeListWebTableHeader.getText();
		System.out.print(employeeListWebTableHeaderText+" - ");

		headerRowOfCell.setCellValue(employeeListWebTableHeaderText+"-");*/

		} System.out.println();

		By employeeListWebTableLocator=By.xpath(propertiesFilesProperty.getProperty("employeeListWebTableProperty"));
		WebElement employeeListWebTable=driver.findElement(employeeListWebTableLocator);

		By webTableRowsLocator=By.tagName(propertiesFilesProperty.getProperty("employeeListWebTableRowProperty"));
		List<WebElement> webTableRows=employeeListWebTable.findElements(webTableRowsLocator);

		for(int rowIndex=0;rowIndex<webTableRows.size();rowIndex++)
		{
		Row row=testDatasheet.createRow(rowIndex+4);

		By webTableColumnsLocator=By.tagName(propertiesFilesProperty.getProperty("employeeListWebTableColumnProperty"));
		List<WebElement> webTableColumns=webTableRows.get(rowIndex).findElements(webTableColumnsLocator);
		int webTableColumnCount=webTableColumns.size();


		for(int columnIndex=0;columnIndex<webTableColumnCount;columnIndex++)
		{
		Cell rowOfCell=row.createCell(columnIndex);
		String employeeInformationText=webTableColumns.get(columnIndex).getText();

		System.out.print(employeeInformationText+"  _  ");

		rowOfCell.setCellValue(employeeInformationText+"-");

		}
		System.out.println();
		}
		FileOutputStream outPutFile=new FileOutputStream("C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OHRM_DDT\\src\\ExcelResult\\testresult.xlsx");
		workBook.write(outPutFile);
		}

		}



