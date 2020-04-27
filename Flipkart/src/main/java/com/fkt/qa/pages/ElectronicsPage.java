package com.fkt.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fkt.qa.base.TestBase;

public class ElectronicsPage extends TestBase {
	
	@FindBy(xpath="//span[@class='_1QZ6fC _3Lgyp8']")
	WebElement electronics;
	
	@FindBy(xpath="//a[contains(text(),'Mi')]")
	WebElement mi;
	
	@FindBy(xpath="//div[@class='_1qKb_B']//select[@class='fPjUPw']")
	WebElement min1;
	
	@FindBy(xpath="//div[@class='_1YoBfV']//select[@class='fPjUPw']")
	WebElement max1;
	
	public ElectronicsPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void moveElectronicsLink() {
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		mi.click();
		
	}
	public void min() {
		Select select=new Select(min1);
		select.selectByIndex(1);
		
	}
	public void max() {
		Select select=new Select(max1);
		select.selectByIndex(2);
		
	}
	public void ram(String ram) {
		driver.findElement(By.xpath("//*[text()='"+ram+"']//parent::label//parent::div")).click();
		
	}
	
	public void Brand(String brand) {
		driver.findElement(By.xpath("//*[text()='"+brand+"']//parent::label//parent::div")).click();
	}
	public void displayProductNames() {
		List<WebElement> list=driver.findElements(By.cssSelector("._3wU53n"));
		System.out.println(list.size());
		int n=list.size();
		for (int i = 0; i<n; i++)
			 
		 {
		 
		 System.out.println(list.get(i).getText());
		 
		 }
	}
	
	}


