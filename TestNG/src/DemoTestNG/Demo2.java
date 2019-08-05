package DemoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@BeforeClass
	  public void BF() {
		System.out.println("This will execute first");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	 @BeforeMethod
	  public void BM() {
		 System.out.println("This will execute before every method");
	  }
	 
	@Test
	  public void TestCase() throws InterruptedException {
		System.out.println("This is a method");
		Thread.sleep(5000);
		driver.close();
	  }
	 

	  @AfterMethod
	  public void AM() {
		  System.out.println("This WILL EXECUTE AFTER each method");
	  }

	  
	  @AfterClass
	  public void AC() {
		  System.out.println("This WILL execute at last");
	  }
	  

}
