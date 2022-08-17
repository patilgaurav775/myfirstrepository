package COLLECTION_REAL;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class Dynamic_Alerts {
	
	 public static WebDriver driver;
	 
	 @Test(priority=1)
	 public void m1() {
	  //by using wait 
	  
	  try {
	   Alert alrt=driver.switchTo().alert();
	   alrt.accept();  //as per requirment
	  }catch(NoAlertPresentException e) {
	   System.out.println("alert is not present");
}
	 }

@Test(priority=2)
public void m2() {
 
 
 try {
  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
  
    if(wait.until(ExpectedConditions.alertIsPresent())==null) {
   System.out.println("Alert is not present"); 
   }else {
    Alert al=driver.switchTo().alert();
    al.accept();
    }
   
 }catch(NoAlertPresentException r) {
  r.printStackTrace();
  
 }
   
 
}

}