package DemoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Demo7_ParallelExecution {
	
	public WebDriver driver;
	
	@Parameters("mybrowser")
	@BeforeTest
	public void launch(String mybrowser)
	{
		if(mybrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

}
