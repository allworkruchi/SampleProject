package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	//By Locators
	private By emailInputLoator = By.name("email");
	private By passwordInputLoator = By.name("password");
	private By loginButtonLoator = By.xpath("//input[@type='submit']");
	private By forgottenPasswordLinkLoator = By.linkText("Forgotten Password");
	private By logoutLinkLoator = By.linkText("Logout");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailInputLoator);
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLoator);
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLoator);
		loginButton.click();;
	}
	
	public void clickForgottonPasswordLink() {
		WebElement forgottonPasswordLink = driver.findElement(forgottenPasswordLinkLoator);
		forgottonPasswordLink.click();;
	}
	
	public boolean clickForgotPwdLink() {
		return driver.findElement(forgottenPasswordLinkLoator).isDisplayed();
	}
	
	public boolean checkLogoutLink() {
		return driver.findElement(logoutLinkLoator).isDisplayed();
	}
	
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
	
	public String getForgotPwdPage() {
		String forgotPwdPageUrl = driver.getCurrentUrl();
		return forgotPwdPageUrl;
	}
	

}
