import org.junit.Test;
import static org.junit.Test.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
@SuppressWarnings("unused")
public class JunitT{
	@Test
	public void JunitMethod(){
		  final String NewPass = "Test@123" ;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Compressed\\STQAmpWebApp-main\\STQA\\drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  driver.get("http://localhost/contactform/");
		  
		  driver.findElement(By.className("user")).sendKeys("Junit test case");
		  driver.findElement(By.className("phone")).sendKeys("1234567890");
		  driver.findElement(By.className("email")).sendKeys("Junit@TestiN.co");
		  driver.findElement(By.name("subject")).sendKeys("JTest");
		  driver.findElement(By.name("message")).
		  sendKeys("This was a Test case generated using Junit========TestinG");
		  driver.findElement(By.name("submit")).click();
		  
		  driver.switchTo().alert().accept(); String expectedSubmitString =
		  "http://localhost/contactform/"; String actualsubmitString =
		  driver.getCurrentUrl();
		  Assert.assertEquals(actualsubmitString,expectedSubmitString); driver.close();
		 
		System.out.println("Execution of Junit TESTing Finished ");
	}
}
													