package com.fkt.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fkt.qa.base.TestBase;
import com.fkt.qa.pages.ElectronicsPage;
import com.fkt.qa.pages.HomePage;
import com.fkt.qa.pages.LoginPage;
import com.fkt.qa.util.TestUtil;

public class ElectronicsPageTest extends TestBase {
	public LoginPage loginpage;
	public TestUtil testUtil;
	public HomePage homePage;
	public  ElectronicsPage electronicsPage;
	
	public ElectronicsPageTest() throws InterruptedException {
		super();
		intialization();
		testUtil=new TestUtil();
		loginpage=new LoginPage();
		homePage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		electronicsPage=new ElectronicsPage();
		
	}
	@Test(priority=1)
	public void moveElectronicsLinkTest() {
		electronicsPage.moveElectronicsLink();
	}
	@Test(priority=2,enabled=false)
	public void minTest() {
		electronicsPage.min();
	}
	@Test(priority=3,enabled=false)
	public void maxTest() {
		electronicsPage.max();
	}
	@Test(priority=4)
	public void ramTest() {
		electronicsPage.ram("2 GB");
		electronicsPage.ram("1 GB");
		
	}
	@Test(priority=5)
	public void brandTest() {
		electronicsPage.Brand("4★ & above");
	}
	@Test(priority=6)
	public void displayProductNamesTest() {
		electronicsPage.displayProductNames();
	}
	
}
