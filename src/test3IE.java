import org.openqa.selenium.WebDriver;


import org.openqa.selenium.ie.InternetExplorerDriver;


public class test3IE {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.ie.driver", "C:\\MyWork\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

	}

}
