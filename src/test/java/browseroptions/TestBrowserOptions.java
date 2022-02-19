package browseroptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to open as mobile emulator
		//Map<String,String> mobileEm = new HashMap<String,String>();
		//mobileEm.put("deviceName", "iPhone X");
		
		ChromeOptions opt = new ChromeOptions();
		
		//to run browser in headless mode
		//opt.addArguments("--headless");
		
		//to accept ssl certificates
		opt.setAcceptInsecureCerts(true);
		
		//set browser window size 
		//opt.addArguments("window-size=1400,1000");
		
		//to open browser in incognito window
		opt.addArguments("incognito");
		
		//to exclude info bars
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//to open as mobile emulator
		//opt.setExperimentalOption("mobileEmulation",mobileEm );
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		
		System.out.println(driver.getTitle());
		
	}

}
