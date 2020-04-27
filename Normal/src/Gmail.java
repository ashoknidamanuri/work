import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Ashok Nidamanuri//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
			String s = link.getText();
			if (s.equals("Instagram")) {
				Thread.sleep(3000);
				link.click();
				System.out.println(s);
				break;
			}

		}

	}

}
