package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class W3Schools {
	
	 @Test(priority=1) public void f() throws InterruptedException {
	 System.setProperty(
	  "webdriver.chrome.driver","C://Users//Ashok Nidamanuri//Downloads//chromedriver.exe"
	  ); WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[@id='navbtn_examples']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"nav_examples\"]/span")).click();
	  driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("css");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/" +
	  "table/tbody/tr/td[2]/button")).click(); //driver.findElement(By.xpath(""))
	  List<WebElement> all=driver.findElements(By.xpath("gs-title")); 
	  for(WebElement k:all) { 
		  System.out.println(k.getAttribute("href"));
	  System.out.println(k.getText());
	  
	  }
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@class='gsc-results-close-btn gsc-results-close-btn-visible']")).
	 click(); 
	  Thread.sleep(2000);
	  driver.close(); 
	 }
 
	@Test(priority = 2)
	public void f2() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Ashok Nidamanuri//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn"
						+ "&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("nidamanuri07@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ashok@213");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))).build().perform();
		a.click().build().perform();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ashoknidamanuri7@gmail.com,  supriya.bmm43@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Testng Report");
		
		WebElement Uploadfile=driver.findElement(By.xpath("//div[@class=\"a1 aaA aMZ\"]"));
		Uploadfile.click();
		
		Robot robot=new Robot();
		StringSelection str=new StringSelection("E:\\Work\\CRM\\test-output\\emailable-report.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		
		
		
		
		


	}
}
