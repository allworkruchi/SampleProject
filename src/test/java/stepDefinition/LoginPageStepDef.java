package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDef {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

	@Given("I am on the OpenCart Login page")
	public void i_am_on_the_open_cart_login_page() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() {
		loginPage.enterEmail("qatestertest@gmail.com");
		loginPage.enterPassword("Test@123");
	}
	
	@Given("I have entered invalid {String} and {String}")
	public void i_have_entered_invalid_and(String username, String password) {
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
	}
	
	@When("I click on Login button")
	public void i_click_on_login_button() {
		loginPage.clickLoginButton();
	}
	
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals(loginPage.checkLogoutLink(), true);
	}
	
	@Then("I should see an error message indicating {String}")
	public void i_should_see_an_error_message_indicating(String errorMessage) {
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
	}
	
	@When("I click on the \"Forgotten Password\" Link")
	public void i_click_on_the_forgotten_password_link() {
		loginPage.clickForgottonPasswordLink();
	}
	
	@Then("I should redirect to the password reset page")
	public void i_should_redirect_to_the_password_reset_page() {
		Assert.assertTrue(loginPage.getForgotPwdPage().contains("account/forgotton"));
	}
	
	public static void main(String[] args) {
		

	}

}
