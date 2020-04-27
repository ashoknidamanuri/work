package com.fkt.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookIReadtExcel {
	public static WebDriver driver;
	
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="reg_email__")
	WebElement email;
	
	@FindBy(name="reg_passwd__")
	WebElement pwd;
	
	public FacebookIReadtExcel() {
		PageFactory.initElements(driver,this);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void readData(String firstname,String lastname,String mobile,String password) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		email.sendKeys(mobile);
		pwd.sendKeys(password);
		
	}
	

}
