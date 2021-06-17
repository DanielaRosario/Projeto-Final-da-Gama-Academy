package PageObject;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;

public class FormularioVehicleData {
	WebDriver driver;
	WebDriver wait;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\User\\Driver\\chormeDriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		
	@Dado("que estou no site {sampleapp.tricentis}")
	public void que_estou_no_sites_sampleapp.tricentis() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	    
	}

	@Quando("seleciono a opcao Make{string}")
	public void seleciono_a_opcao_Make() {
		WebElement make_dropdown= driver.findElement(By.id("Make"));
		Select select = new Select(make_dropdown);
		select.selectByVisibleText("Ford");
	    
	    
	}

	@Quando("seliciono a opcao Model{string}")
	public void seliciona_a_opcao_model() {
		WebElement model_dropdow = driver.findElement(By.id("model"));
	    Select select = new Select(model_dropdow);
	    select.selectByVisibleText("Motocycle");
	    
	}

	@Quando("digito a opcao Cilinder Capacity {string}")
	public void digito_a_opcao_cilinder_capacity() {
		driver.findElement(By.id("cilindercapacity")).sendKeys("500");
	
	}

	@Quando("seleciono a opcao Engine Performance{int}\"\"")
	public void seleciono_a_opcao_engine_performance() {
		int num;
		int minimo = Integer.MAX_VALUE;
		Int maximo = Integer.BYTES;S
		  
	}

	@Quando("clico na opcao Date of manofature{string}")
	public void clico_na_opcao_date_of_manifature() {
	    driver.findElement(By.id("dateofmanofature")).sendKeys("11/01/2020");
	}

	@Quando("digito na opção Number of Seats {string}")
	public void digito_ number_of_Seats (String string) {
	    driver.findElement(By.id("Number of Seats")).sendKeys("2");
	} msgValidacao = driver.findElement(By.className("sectionTitle")).getText();
	assertEquals("Proposito:", msgValidacao);

	}
}
