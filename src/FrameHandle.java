import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	   //    driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	       
	       driver.switchTo().frame("a077aa5e");
	       
	      // driver.switchTo().parentFrame(); // switch back to the main frame
	       												//OR
	//       driver.switchTo().defaultContent();// switch back to frame
	       
			System.out.println("********We are switch to the iframe*******");
  		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
    
			System.out.println("*********We are done***************");
		
		
	}

}
