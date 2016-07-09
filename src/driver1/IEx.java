package driver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Softwares\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("masthead-search-term")).sendKeys("collections");
		driver.findElement(By.id("search-btn")).click();
		driver.findElement(By.xpath("//*/li[2]/div/div/div[2]/h3/a")).click();
		
	}

}
	