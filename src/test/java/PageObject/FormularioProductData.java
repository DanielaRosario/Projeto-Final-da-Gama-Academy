package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;

public class FormularioProductData {

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
	
		@Dado("que estou na aba Product")
		public void que_estou_na_aba_product() {
			driver.get("http://sampleapp.tricentis.com/101/app.php");
		    
		}

		@Dado("acesso clico na opcao Produto{string}")
		public void acesso_clico_na_opcao() {
		    driver.findElement(By.id("enterproducdata")).click();

		}

		@Dado("dgito a data start date{string}")
		public void digito_a_data() {
		   driver.findElement(By.id("startdate" )).sendKeys("01/11/2022");
		   
		}

		@Dado("clico na opcao insurance Sum {string}")
		public void clico_na_opcao() {
		    driver.findElement(By.id("insurancesum")).sendKeys("15.000.000,00");
		}

		@Dado("clico no campo Merit Ranger{string}")
		public void clico_no_campo() {
		    driver.findElement(By.id("meritranger")).sendKeys("bonus1");
		}

		@Dado("clico na opcao Damage Insurance {string}")
		public void clico_na_op_o() {
		    driver.findElement(By.id("damageinsurance")).sendKeys("fullcoverage");
		}

		@Dado("clico no botao Cortesy {string}")
		public void clico_no_botao() {
		    driver.findElement(By.className("main")).click();
		
		}
}
