package Step_contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition2 {

	WebDriver driver;
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		System.setProperty("webdriver.chrome.drive", "C:\\new Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoblaze.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}

	@Then("^Click on Contact link$")
	public void click_on_Contact_link() throws Throwable {
	  driver.findElement(By.linkText("Contact")).click(); 
	  Thread.sleep(3000);
	}

	@Then("^Verify Contact link is working Successfully$")
	public void verify_Contact_link_is_working_Successfully() throws Throwable {
	   boolean contact= driver.findElement(By.id("exampleModalLabel")).isDisplayed(); 
	   Assert.assertTrue(contact);
	  Thread.sleep(3000);
	  
	}
}
