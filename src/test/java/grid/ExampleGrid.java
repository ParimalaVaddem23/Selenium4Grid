package grid;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleGrid {
	
	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public Capabilities cap;
	
	public WebDriver getDriver() {
		return driver.get();
	}

	@Test
	@Parameters("browser")
	public void doSearch(@Optional("chrome") String browser) throws MalformedURLException, InterruptedException {
		if(browser.equals("firefox")) {
			cap = new FirefoxOptions();
			System.out.println("#####");
		}else if(browser.equals("chrome")) {
			cap =new ChromeOptions();
			//System.out.println("*****");
		}
		
		driver.set(new RemoteWebDriver(new URL("http://13.233.83.30:4444"), cap));
		//WebDriver driver = new RemoteWebDriver(new URL("http://52.66.209.171:4444/"), cap); 
		getDriver().get("http://google.com");
		getDriver().findElement(By.name("q")).sendKeys("Hello Grid ..."+browser);
		System.out.println(getDriver().getTitle()+"------ on browser -----"+browser);
		Thread.sleep(10000);
		getDriver().quit();
	}
	
}
