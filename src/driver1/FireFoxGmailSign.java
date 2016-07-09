package driver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FireFoxGmailSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.className("goog-menu goog-menu-vertical"));
		Select se=new Select(element);
		se.selectByVisibleText("May");

	}

}
