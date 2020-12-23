import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		// Chrome  Driver
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox driver
/*		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath +"\\Drivers\\Firefox\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();*/
		
		//Internet Explorer
/*		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectPath + "\\Drivers\\IE\\IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		WebDriver driver = new InternetExplorerDriver(caps);*/
		
	//	WebDriver driver =new SafariDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
