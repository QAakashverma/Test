import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class First {  
  
    public static void main(String[] args) throws InterruptedException {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash.verma\\Downloads\\chromedriver_win32\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("qainfotech");
         
    // Click on the search button  
    WebElement search =  driver.findElement(By.name("btnK"));
    Thread.sleep(1000);
    search.click();
    }  
  
}  