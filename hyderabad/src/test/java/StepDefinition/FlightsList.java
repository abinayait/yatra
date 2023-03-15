package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightsList {

	WebDriver driver;

	@Given("I open browser")
	public void i_open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriverChrome\\chromedriver.exe");
		driver=new ChromeDriver();
	   
	}

	@When("I type url {}")
	public void i_type_url(String website) throws InterruptedException {
	   driver.get(website);
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@Then("I close popup")
	public void i_close_popup(){
		Alert a=driver.switchTo().alert();
		a.dismiss();
		
	}
	@Then("I select {} from {} to")
	
	public void i_select_depart_from_destination(String dep, String destination) {
		
	   WebElement textbox=driver.findElement(By.xpath("(//span[text()='Depart From'])[1]"));
	 textbox.click();
	 textbox.sendKeys(dep);
	 
	 WebElement textbox2=driver.findElement(By.xpath("(//span[text()='Going To'])[1]"));
	 textbox2.click();
	 textbox2.sendKeys(destination);
	}

	@And("I select date")
	public void i_select_date() {
	    
	}

	@Then("I click search flights")
	public void i_click_search_flights() {
	   
	}

	


}
