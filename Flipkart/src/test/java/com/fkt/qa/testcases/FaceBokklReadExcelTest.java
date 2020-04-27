package com.fkt.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fkt.qa.pages.FacebookIReadtExcel;
import com.fkt.qa.util.TestUtil;

public class FaceBokklReadExcelTest {
	
	public TestUtil testUtil;
	public FacebookIReadtExcel frExcel;
	
	public FaceBokklReadExcelTest() {
		testUtil=new TestUtil();
		frExcel=new FacebookIReadtExcel();
	}
	
	@DataProvider
	public Object[][] testData() throws InvalidFormatException {
		String sheetName="Sheet1";
		Object data[] []=testUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="testData")
	public void readDataTest(String frstname, String lstname,String mobile1, String password1) {
		frExcel.readData(frstname,lstname,mobile1,password1);
		
	}
	
}
