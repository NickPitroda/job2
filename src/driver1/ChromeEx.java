package driver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("cricket");
		driver.findElement(By.id("uh-search-button")).click();

	}

}
