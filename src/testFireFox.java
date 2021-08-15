import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\MyWork\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.get("http:\\flipkart.in");
	}

}
