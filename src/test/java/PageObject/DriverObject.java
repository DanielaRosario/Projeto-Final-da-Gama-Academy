package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverObject {
	
	WebDriver driver;
	WebDriverWait wait;
	
public WebDriver setup(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver1.exe");
    WebDriver driver = new ChromeDriver();
    
   
    driver.get("http://sampleapp.tricentis.com/101/app.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
 
	
   
    return driver;
   
  		
	
	}

}
