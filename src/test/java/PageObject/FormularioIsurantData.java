package PageObject;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;

public class FormularioIsurantData {

	WebDriver driver;
	WebDriver wait;
	
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\User\\Driver\\chormeDriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		}
		
		@Test
		public void abaproduto() {
			
			
			System.out.println();
		}
		
			@Dado("que estou no site sampleapp.tricentis")
			public void que_estou_no_site_sampleapp.tricentis() {
				driver.get("http://sampleapp.tricentis.com/101/app.php");
			    
			}

			@Dado("acesso clico na opcao Firts Name{string}")
			public void acesso_clico_na_opcao_firts_name() {
			    driver.findElement(By.id("firtsname")).sendKeys("Alan");

			}

			@Dado("clico na opcao Last Name{string}"
			public void clico_na_opção_last_name() {
			   driver.findElement(By.id("lastname" )).sendKeys("lastname");
			   
			}

			@Dado("clico na opcao Date of Birth {string}")
			public void clico_na_opcao() {
			    driver.findElement(By.id("Date of Birth")).sendKeys("souza");
			}

			@Dado("clico no campo Gender{string}")
			public void clico_no_campo() {
			    driver.findElement(By.id("Gender")).sendKeys("male");
			}

			@Dado("clico na opcao Street Address {string}")
			public void clico_na_opcao_street_address() {
			    driver.findElement(By.id("streetaddress")).sendKeys("alcantara machado");
			}

			@Dado("clico na opcao Country {string}")
			public void clico_na opcao_country() {
			    driver.findElement(By.id("country")).sendKeys("Brazil");
			 
		   }
			@Dado("clico na opcao Zip Code {string}"
			public void clico_na_opção_zip_code() {
			     driver.findElement(By.id("zipcode" )).sendKeys("03302000");
					   
			}
			@Dado("clico na opcao City {string}"
			public void clico_na_opção_city() {
				 driver.findElement(By.id("city" )).sendKeys("sao paulo");
		   }
			
			@Dado("clico na opcao Occupation {string}"
			public void clico_na_opção_Occupation() {
				 driver.findElement(By.id("Occupation" )).sendKeys("employee");
			
			}
			@Dado("clico na opcao Hobbies {string}"
		    public void clico_na_opção_hobbies() {
				 driver.findElement(By.id("hobies" )).sendKeys("other");
		    }
		    
		    @Dado("clico na opcao next {string}"
		    public void clico_na_opção_next() {
				driver.findElement(By.id("nextenterproductdata" )).click();
				msgValidacao = driver.findElement(By.className("sectionTitle")).getText();
				assertEquals("Proposito:", msgValidacao);
		    }
		    
		    
}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	


