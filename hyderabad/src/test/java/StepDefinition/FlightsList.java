package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlightsList {

	WebDriver driver;

	@Given("I open browser")
	public void i_open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriverChrome\\chromedriver.exe");
		driver=new ChromeDriver();
	   
	}

	@And("I type url {}")
	public void i_type_url(String website) {
	   driver.get(website);
	   driver.manage().window().maximize();
	}

	@Then("I select depart from destination")
	public void i_select_depart_from_destination() {
	   
	}

	@And("I select date")
	public void i_select_date() {
	    
	}

	@Then("I click search flights")
	public void i_click_search_flights() {
	   
	}

	


}
