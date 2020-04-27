package com.fkt.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.fkt.qa.base.TestBase;
import com.fkt.qa.pages.HomePage;
import com.fkt.qa.pages.LoginPage;
import com.fkt.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	
	
	
	public HomePageTest() throws InterruptedException {
		super();
		intialization();
		testUtil=new TestUtil();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void flipkartLogoImageTest() {
		boolean b=homepage.flipkartLogoImage();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	
	@Test
	public void homePageTitleTest() {
		String title=homepage.homePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test
	public void searchProductsTest() throws InterruptedException {
		homepage.searchProducts();
	}
	@Test
	public void searhBtnClickTest() {
		homepage.searhBtnClick();
	}
	@Test
	public void ScrollToTest() throws InterruptedException {
		homepage.scrollTo();
	}
	

}
