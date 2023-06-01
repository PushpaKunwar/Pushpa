package com.TestCases;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployeeTest extends LoginTest{
	
		Cell testDataOfFirstName;
		String expected_FirstName;
		Cell testDataOfMiddleName;
		String expected_MiddleName;
		Cell testDataOfLastName;
		String expected_LastName;
		Cell testDataOfEmployeeId;
		String expected_EmpolyeeId;

		@Test(priority=2,description="OHRMApplication HomePage Validation")
		public void oHRMApplicationHomePageValidation() throws IOException
		{
		/*testDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/MultipleTestDataOHRM.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDatasheet=workBook.getSheet("Sheet1");
		testDataRow=testDatasheet.getRow(1);*/

		Cell rowOfCell11=testDataRow.getCell(11);
		String expected_OrangeHRMHomePageAdminText=rowOfCell11.getStringCellValue();
		System.out.println("The Expected Text Of The Admin Of OHRMHomePage is:- "+expected_OrangeHRMHomePageAdminText);

		By AdminLocator=By.linkText(propertiesFilesProperty.getProperty("adminElementProperty"));
		WebElement Admin=driver.findElement(AdminLocator);

		String actual_OrangeHRMHomePageAdminTex=Admin.getText();
		Cell testDataOHRMHomePageAdminText=testDataRow.createCell(12);
		System.out.println("The Expected Text Of The Admin Of OHRMHomePage is:- "+actual_OrangeHRMHomePageAdminTex);
		testDataOHRMHomePageAdminText.setCellValue(actual_OrangeHRMHomePageAdminTex);

		if(actual_OrangeHRMHomePageAdminTex.equals(expected_OrangeHRMHomePageAdminText))
		{
		System.out.println("The Text Of The OHRMHomePage Admin is Matched - PASS ");
		Cell resultTestDataAdminText=testDataRow.createCell(13);
		resultTestDataAdminText.setCellValue("The Text Of The OHRMHomePage Admin is Matched - PASS");
		}
		else
		{
		System.out.println("The Text Of The OHRMHomePage Admin is Not Matched - FAIL ");
		Cell resultTestDataAdminText=testDataRow.createCell(13);
		resultTestDataAdminText.setCellValue("The Text Of The OHRMHomePage Admin is Not Matched - FAIL");
		}
		/*fileOutPut=new FileOutputStream("./src/com/ApplicationTestResultFiles/AddEmployeeTestResult.xlsx");
		workBook.write(fileOutPut);*/
		}

		@Test(priority=3,description="PIM Test")
		public void oHRMApplicationHomePagePIMTest() throws InterruptedException
		{
		By pimLocator=By.linkText(propertiesFilesProperty.getProperty("pimElementProperty"));
		WebElement pim=driver.findElement(pimLocator);

		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();

		//Thread.sleep(10000);
		}

		@Test(priority=4,description="AddEmployee Test")
		public void oHRMApplicationHomePageAddEmployeeTest() throws InterruptedException
		{
		By addEmployeeLocator=By.id(propertiesFilesProperty.getProperty("addEmployeeElementProperty"));
		WebElement addEmployee=driver.findElement(addEmployeeLocator);

		   addEmployee.click();
		   //Thread.sleep(10000);
		}

		@Test(priority=5,description="AddEmployee Validation Test")
		public void oHRMApplicationHomePageAddEmployeeValidationTest() throws IOException, InterruptedException
		{
		/*testDataFile=new FileInputStream("./src/com/ApplicationTestResultFiles/LogInPageResults.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDatasheet=workBook.getSheet("Sheet1");
		testDataRow=testDatasheet.getRow(1);*/

		Cell rowOfCell14=testDataRow.getCell(14);
		   String expected_AddEmployeeHeaderText=rowOfCell14.getStringCellValue();
		   System.out.println("The Expected Text Of The AddEmployeeHeader is :-"+expected_AddEmployeeHeaderText);

		By addEmployeeHeaderLocator=By.xpath(propertiesFilesProperty.getProperty("addEmployeeHeaderProperty"));
		WebElement addEmployeeHeader=driver.findElement(addEmployeeHeaderLocator);

		Cell testDataOfAddEmployeeHeaderText=testDataRow.createCell(15);
		String actual_AddEmployeeHeaderText=addEmployeeHeader.getText();
		System.out.println("The Actual Text Of The FullName is:- "+actual_AddEmployeeHeaderText);
		testDataOfAddEmployeeHeaderText.setCellValue(actual_AddEmployeeHeaderText);

		if(actual_AddEmployeeHeaderText.equals(expected_AddEmployeeHeaderText))
		{
		System.out.println("The Text Of The AddEmployeeHeader is Matched - PASS");
		    Cell testResultOfAddEmployeeHeaderText=testDataRow.createCell(16);
		    testResultOfAddEmployeeHeaderText.setCellValue("The Text Of The AddEmployeeHeader is Matched - PASS");
		}
		else
		{
		System.out.println("The Text Of The AddEmployeeHeader is Not Matched - FAIL");
		    Cell testResultOfAddEmployeeHeaderText=testDataRow.createCell(16);
		    testResultOfAddEmployeeHeaderText.setCellValue("The Text Of The AddEmployeeHeader is Not Matched - FAIL");
		}


		Cell rowOfCell17=testDataRow.getCell(17);
		   String expected_FullNameText=rowOfCell17.getStringCellValue();
		   System.out.println("The Expected Text Of The FullName is :-"+expected_FullNameText);
		   
		   By fullNameLocator=By.className(propertiesFilesProperty.getProperty("fullNameElementProperty"));
		WebElement fullName=driver.findElement(fullNameLocator);
		   
		   Cell testDataOfFullNameText=testDataRow.createCell(18);
		   String actual_FullNameText=fullName.getText();
		   System.out.println("The Actual Text Of The FullName is:- "+actual_FullNameText);
		   testDataOfFullNameText.setCellValue(actual_FullNameText);
		   
		   if(actual_FullNameText.equals(expected_FullNameText))
		   {
		    System.out.println("The Text Of The FullName is Matched - PASS");
		    Cell testResultOfFullNameText=testDataRow.createCell(19);
		    testResultOfFullNameText.setCellValue("The Text Of The FullName is Matched - PASS");
		   }
		   else
		   {
		    System.out.println("The Text Of The FullName is Not Matched - FAIL");
		    Cell testResultOfFullNameText=testDataRow.createCell(19);
		    testResultOfFullNameText.setCellValue("The Text Of The FullName is Not Matched - FAIL");
		   }
		   By firstNameLocator=By.id(propertiesFilesProperty.getProperty("firstNameProperty"));
		WebElement firstName=driver.findElement(firstNameLocator);

		testDataOfFirstName=testDataRow.getCell(20);
		expected_FirstName=testDataOfFirstName.getStringCellValue();
		System.out.println("The Expected Text Of The FirstName is:- "+expected_FirstName);
		firstName.sendKeys(expected_FirstName);
		   
		   Actions addEmployeeAction=new Actions(driver);
		   addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		   
		   testDataOfMiddleName=testDataRow.getCell(23);
		expected_MiddleName=testDataOfMiddleName.getStringCellValue();
		System.out.println("The Expected Text Of The MiddleName is:- "+expected_MiddleName);
		addEmployeeAction.sendKeys(expected_MiddleName).build().perform();

		addEmployeeAction.sendKeys(Keys.TAB).build().perform();

		testDataOfLastName=testDataRow.getCell(26);
		expected_LastName=testDataOfLastName.getStringCellValue();
		System.out.println("The Expected Text Of The LastName is:- "+expected_LastName);
		addEmployeeAction.sendKeys(expected_LastName).build().perform();

		addEmployeeAction.sendKeys(Keys.TAB).build().perform();

		By employeeIdLocator=By.id(propertiesFilesProperty.getProperty("employeeIdElementProperty"));
		WebElement employeeId=driver.findElement(employeeIdLocator);
		expected_EmpolyeeId=employeeId.getAttribute("value");
		System.out.println("The Expected Number of the EmployeeId is:-"+expected_EmpolyeeId);
		testDataOfEmployeeId=testDataRow.createCell(29);
		testDataOfEmployeeId.setCellValue(expected_EmpolyeeId);

		addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		/*
		 * addEmployeeAction.sendKeys(Keys.ENTER).build().perform();
		 * java.lang.Runtime.getRuntime().exec(
		 * "C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OHRM_DDT\\ImgUpload\\FileUpload.exe"
		 * ); Thread.sleep(10000);
		 */
		addEmployeeAction.sendKeys(Keys.TAB).build().perform();
		addEmployeeAction.sendKeys(Keys.TAB).build().perform();

		addEmployeeAction.sendKeys(Keys.ENTER).build().perform();
		}

		@Test(priority=6,description="Personal Details Validation Test")
		public void oHRMApplicationPersonalDetailsValidationTest() throws IOException
		{
		/*testDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/MultipleTestDataOHRM.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDatasheet=workBook.getSheet("Sheet1");
		testDataRow=testDatasheet.getRow(1);*/

		String expected_ImageHolderName=testDataOfFirstName.getStringCellValue();
		Cell rowOfCell32=testDataRow.createCell(32);
		rowOfCell32.setCellValue(expected_ImageHolderName);
		System.out.println("The Expected ImageHolderName Text is :- "+expected_ImageHolderName);

		By imageHolderNameLocator=By.xpath(propertiesFilesProperty.getProperty("personalImageHolderNameProperty"));
		WebElement imageHolderName=driver.findElement(imageHolderNameLocator);
		String actual_imageHolderNameText=imageHolderName.getText();
		System.out.println("The Actual ImageHolderName Text is :- "+actual_imageHolderNameText);
		Cell rowOfCell33=testDataRow.createCell(33);
		rowOfCell33.setCellValue(actual_imageHolderNameText);

		if(actual_imageHolderNameText.contains(expected_ImageHolderName))
		{
		System.out.println("The Text Of The ImageHolderName is Matched :- PASS");
		Cell rowOfCell34=testDataRow.createCell(34);
		rowOfCell34.setCellValue("The Text Of The ImageHolderName is Matched :- PASS");
		}
		else
		{
		System.out.println("The Text Of The ImageHolderName is Not Matched :- FAIL");
		Cell rowOfCell34=testDataRow.createCell(34);
		rowOfCell34.setCellValue("The Text Of The ImageHolderName is Not Matched :- FAIL");
		}

		By personalDetailsFirstNameLocator=By.id(propertiesFilesProperty.getProperty("personalFirstNameElementProperty"));
		WebElement personalDetailsFirstName=driver.findElement(personalDetailsFirstNameLocator);

		Cell rowOfCell18=testDataRow.createCell(21);
		String actual_FirstName=personalDetailsFirstName.getAttribute("value");
		System.out.println("The Actual Text Of The FirstName is:- "+actual_FirstName);
		rowOfCell18.setCellValue(actual_FirstName);

		By personalDetailsMiddleNameLocator=By.id(propertiesFilesProperty.getProperty("personalMiddleNameElementProperty"));
		WebElement personalDetailsMiddleName=driver.findElement(personalDetailsMiddleNameLocator);

		Cell rowOfCell21=testDataRow.createCell(24);
		String actual_MiddleName=personalDetailsMiddleName.getAttribute("value");
		System.out.println("The Actual Text Of The MiddleName is:-"+actual_MiddleName);
		rowOfCell21.setCellValue(actual_MiddleName);

		By personalDetailsLastNameLocator=By.id(propertiesFilesProperty.getProperty("personalLastNameElementProperty"));
		WebElement personalDetailsLastName=driver.findElement(personalDetailsLastNameLocator);

		Cell rowOfCell24=testDataRow.createCell(27);
		String actual_LastName=personalDetailsLastName.getAttribute("value");
		System.out.println("The Actual Text Of The LastName is:-"+actual_LastName);
		rowOfCell24.setCellValue(actual_LastName);

		By personalDetailsEmployeeIdLocator=By.id(propertiesFilesProperty.getProperty("personalEmployeeIdElementProperty"));
		WebElement personalDetailsEmployeeId=driver.findElement(personalDetailsEmployeeIdLocator);
		String actual_EmployeeId=personalDetailsEmployeeId.getAttribute("value");
		System.out.println("The Actual Number Of The EmployeeId is:-"+actual_EmployeeId);
		Cell rowOfCell27=testDataRow.createCell(30);
		rowOfCell27.setCellValue(actual_EmployeeId);

		if(actual_FirstName.equals(expected_FirstName))
		{
		System.out.println("The Text Of The FirstName is Matched :- PASS");
		Cell testResultOfFirstName=testDataRow.createCell(22);
		testResultOfFirstName.setCellValue("The Text Of The FirstName is Matched :- PASS");
		}
		else
		{
		System.out.println("The Text Of The FirstName is Not Matched :- FAIL");
		Cell testResultOfFirstName=testDataRow.createCell(22);
		testResultOfFirstName.setCellValue("The Text Of The FirstName is Not Matched :- FAIL");
		}

		if(actual_MiddleName.equals(expected_MiddleName))
		{
		System.out.println("The Text Of The MiddleName is Matched :- PASS");
		Cell testResultOfMiddleName=testDataRow.createCell(25);
		testResultOfMiddleName.setCellValue("The Text Of The MiddleName is Matched :- PASS");
		}
		else
		{
		System.out.println("The Text Of The MiddleName is Not Matched :- FAIL");
		Cell testResultOfMiddleName=testDataRow.createCell(25);
		testResultOfMiddleName.setCellValue("The Text Of The MiddleName is Not Matched :- FAIL");
		}

		if(actual_LastName.equals(expected_LastName))
		{
		System.out.println("The Text Of The LastName is Matched :- PASS");
		Cell testResultOfLastName=testDataRow.createCell(28);
		testResultOfLastName.setCellValue("The Text Of The LastName is Matched :- PASS");
		}
		else
		{
		System.out.println("The Text Of The LastName is Not Matched :- FAIL");
		Cell testResultOfLastName=testDataRow.createCell(28);
		testResultOfLastName.setCellValue("The Text Of The LastName is Not Matched :- FAIL");
		}

		if(actual_EmployeeId.equals(expected_EmpolyeeId))
		{
		System.out.println("The Number Of The EmployeeId is Matched :- PASS");
		Cell testResultOfEmployeeId=testDataRow.createCell(31);
		testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Matched :- PASS");
		}
		else
		{
		System.out.println("The Number Of The EmployeeId is Not Matched :- FAIL");
		Cell testResultOfEmployeeId=testDataRow.createCell(31);
		testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Not Matched :- FAIL");
		}

		fileOutPut=new FileOutputStream(".//src/ExcelResult/AddEmployeeTestResult.xlsx");
		workBook.write(fileOutPut);
		}


		}


