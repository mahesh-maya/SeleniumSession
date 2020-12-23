import org.openqa.selenium.chrome.ChromeDriver;

public class bro {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\Chrome2\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		

		
	}

}
