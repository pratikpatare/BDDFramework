package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FacebookSteps {
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
			
	}

	@When("I open facebook homepage")
	public void i_open_facebook_homepage() {
		driver.get("https://www.facebook.com/");
	}

	@Then("I verify that logo present on page")
	public void i_verify_that_logo_present_on_page() {
	   boolean status=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	   Assert.assertEquals(true, status);
	}

	@And("close browser")
	public void close_browser() {
	    driver.close();
	}
	
}
