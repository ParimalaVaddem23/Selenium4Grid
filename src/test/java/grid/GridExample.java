package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("**");
		FirefoxOptions cap =new FirefoxOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://3.111.168.223:4444/"), cap); 
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello World ...");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();
	}

}
