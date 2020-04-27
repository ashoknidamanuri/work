package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Ashok Nidamanuri//Downloads//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.travolook.in/");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[@class='roundway']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
		Thread.sleep(3000);
	WebElement al=	dr.findElement(By.xpath("//strong[contains(text(),'Departure')]"));
	
		al.click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a")).click();
		
		dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		dr.findElement(By.xpath("//span[contains(text(),'Traveller')]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"sub2plus\"]")).click();
		Thread.sleep(3000);
		Select s=new Select(dr.findElement(By.xpath("//*[@id=\"ddlCabinClass\"]")));
		s.selectByIndex(2);
		dr.findElement(By.xpath("/html/body/div[1]/form/section/div/div/div[2]/div[6]/span[4]/a")).click();
		
	}

}
