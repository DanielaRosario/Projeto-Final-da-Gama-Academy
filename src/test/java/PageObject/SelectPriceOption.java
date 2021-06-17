package PageObject;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;

public class SelectPriceOption {
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
	public void SiteSamleapp() {
		@Dado("que estou no site sampleapp.tricentis")
		public void que_estou_no_site_sampleapp_tricentis() {
			driver.get("http://sampleapp.tricentis.com/101/app.php");
		}

		@Dado("acesso formulario Select")
		public void acesso_formulario_select() {
		    driver.findElement(By.id("selecpriceoption"));
		}

		@Dado("clico na opcao Select opcao {string}")
		public void clico_na_opcao() {
			driver.findElement(By.id("choosePrice ideia-radiocheck-label")).click();
		    
		}

		@Dado("clico no botao {string}")
		public void clico_no_botao(String string) {
		  driver.findElement(By.id("nextsendquote")).click();
		  msgValidacao = driver.findElement(By.className("sectionTitle")).getText();
		  assertEquals("Proposito:", msgValidacao);
		}

		
	  }

	private void que_estou_no_site_sampleapp_tricentis() {
		// TODO Auto-generated method stub
		
	  }
	}
