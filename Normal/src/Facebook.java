import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Ashok Nidamanuri//Downloads//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		 WebElement selectDropDown =dr.findElement(By.id("year"));
		 Thread.sleep(2000);
		   List<WebElement> option=selectDropDown.findElements(By.tagName("option"));
		   ArrayList<String> list=new ArrayList<>();

		   for(int i=0;i<option.size();i++)
		   {
		       list.add(option.get(i).getText().trim());
		   }

		   Collections.reverse(list);

		   String lastOption=list.get(0);

		   new Select(selectDropDown).selectByVisibleText(lastOption);  
		   System.out.println(lastOption);

			
		}

	}


