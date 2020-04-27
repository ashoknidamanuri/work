package com.fkt.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fkt.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\haribabu\\eclipse-workspace\\Flipkart\\src\\main\\java\\com\\fkt\\qa\\testdata\\FacebookTestData.xlsx";
	public static Workbook book;
	public static Sheet sheet;
	
	public void swithToFrame() {
		driver.switchTo().frame(0);//in place of 0 u can pass your frame name then user this methos wher u want by creating its object
	}
	public void scrollThePage() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		//jse.executeScript("scroll(0, 250);");
		
		//jse.executeScript("window.scrollBy(0,-250)");
		//OR,
		//jse.executeScript("scroll(0, -250);");
	}
	public static void windowTabsHandle() {
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		//Use the list of window handles to switch between windows
		driver.switchTo().window((String) tabs.get(1));

		//Switch back to original window
		
	}
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException { 
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	

}
