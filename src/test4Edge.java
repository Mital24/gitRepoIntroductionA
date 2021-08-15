import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test4Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\MyWork\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.get("http:\\amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
