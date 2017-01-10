package Title;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class NewTest {
	public  WebDriver driver;
		  
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String text =driver.getTitle();
	  System.out.println("Title of Google - "+ text);
	  Assert.assertEquals(text, "Google");
	  driver.close();
	  //Driver comment added
	  
  }
    
  

}
