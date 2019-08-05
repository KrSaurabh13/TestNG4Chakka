package DemoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo6_Groups {
	WebDriver driver;
	
  @BeforeTest
  public void BT() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KumarSaurabh\\Documents\\JAVA Selenium Training Session\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }
  
  @Test(groups={"smoke"})
  public void testcase1()
  {
	  System.out.println("This is my First");
  }
  
  @Test(groups={"smoke"})
  public void testcase2()
  {
	  System.out.println("This is my Second");
  }
  
  @Test(groups={"regression"})
  public void testcase3()
  {
	  System.out.println("This is my Third");
  }
  
  @AfterTest
  public void AT(){
	driver.close();  
  }
  
  
}
