package driver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("cricket");
		driver.findElement(By.id("uh-search-button")).click();
		*/
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("masthead-search-term")).sendKeys("collections");
		driver.findElement(By.id("search-btn")).click();
		driver.findElement(By.xpath(".//li[2]/div/div/div[2]/h3/a")).click();
		
		
		/*WebDriver driver= new FirefoxDriver();
        driver.get("https://www.gmail.com");
        driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
        
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
        //driver.findElement(By.xpath(".//*[@id=':6']/div")).click();
        WebDriver element = (WebDriver) driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"));
        JavascriptExecutor Executor = ((JavascriptExecutor)driver);
        Executor.executeScript(“arguments[0].click();”, element);*/
	}

}
