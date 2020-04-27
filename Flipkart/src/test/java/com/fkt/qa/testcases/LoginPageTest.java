package com.fkt.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fkt.qa.base.TestBase;
import com.fkt.qa.pages.HomePage;
import com.fkt.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	public LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();

	}
	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		
	}
	@Test(priority=1)
	public void getPageTileTest() {
		String title=loginpage.getPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
