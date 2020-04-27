package com.fkt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fkt.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	public WebElement username;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	public WebElement loginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Actions
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	

}
