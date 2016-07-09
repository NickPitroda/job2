package driver1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.name("gmail-sign-in"));
		driver.findElement(By.name("Email")).sendKeys("nick.pitroda@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Passwd")).sendKeys("*******");
		driver.findElement(By.id("signIn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*/div[2]//div[2]/div/div/div/div/div[@role='button']")).click();
		driver.findElement(By.name("to")).sendKeys("nick.pitroda@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Hey Nick.....How are you doing");
		driver.findElement(By.xpath(".//div[1]/table[1]/tbody[1]/tr[1]/td/div[2]/div")).sendKeys("Hello Macha");
		driver.findElement(By.xpath("//td[1]/div/div[2][@role='button']")).click();
	}
}
