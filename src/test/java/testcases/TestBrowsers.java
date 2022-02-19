package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
//		WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();;
//		FirefoxDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
