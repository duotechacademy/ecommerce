package io.duotech.step_definitions;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.beans.User;
import io.duotech.pages.HomePage;
import io.duotech.pages.LoginPage;
import io.duotech.pages.MyAccountPage;
import io.duotech.utilities.ConfigReader;
import io.duotech.utilities.Driver;
import junit.framework.Assert;

public class LoginStepDefs {
	
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
	}

	@When("I click on Sign in")
	public void i_click_on_Sign() {
	    HomePage homepage = new HomePage();
	    homepage.signInLink.click();
	}

	@Then("The login page title should be Login - My Store")
	public void the_login_page_title_should_be_Login_My_Store() {
	   String actual = Driver.getDriver().getTitle();
	   String expected = "Login - My Store";
	   assertEquals(expected, actual);
	}
	
	@Then("I should be able to see email, password boxes and login button")
	public void i_should_be_able_to_see_email_password_boxes_and_login_button() {
	   LoginPage loginPage = new LoginPage();
	   assertTrue(loginPage.emailInputBox.isDisplayed());
	   assertTrue(loginPage.passwordInputBox.isDisplayed());
	   assertTrue(loginPage.signInButton.isDisplayed());

	   
	}
	
	@When("I enter duotech@gmail.com as email, dt123 as password, and click login")
	public void i_enter_duotech_gmail_as_email_dt123_as_password_and_click_login() {
		   LoginPage loginPage = new LoginPage();

		   loginPage.emailInputBox.sendKeys("duotech@gmail.com");
		   loginPage.passwordInputBox.sendKeys("dt123");
		   loginPage.signInButton.click();
	}
	
	@When("I enter {string} as email, {string} as password, and click login")
	public void i_enter_as_email_as_password_and_click_login(String email, String pass) {
			LoginPage loginPage = new LoginPage();

			loginPage.emailInputBox.sendKeys(email);
			   loginPage.passwordInputBox.sendKeys(pass);
			   loginPage.signInButton.click();
	}
	
	
	

	@Then("I should be able to land on welcome page and read welcome message")
	public void i_should_be_able_to_land_on_welcome_page_and_read_welcome_message() {
	   String welcomeMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
	   MyAccountPage myaccountpage = new MyAccountPage();
	   String actual = myaccountpage.welcomeMessage.getText();
	   assertEquals(welcomeMessage, actual);
	
	}
	
	
	@When("I enter the following credentials, I should be able to login")
	public void i_enter_the_following_credentials_I_should_be_able_to_login(Map<String, String> combinations) {
	    LoginPage loginPage = new LoginPage();
	    MyAccountPage myAccountPage = new MyAccountPage();
	   
	    Set<Entry<String, String>> entrySet = combinations.entrySet();
	    
	    for (Entry<String, String> entry : entrySet) {
	    	String email = entry.getKey();
	    	String password = entry.getValue();
	    	loginPage.emailInputBox.sendKeys(email);
	    	loginPage.passwordInputBox.sendKeys(password);
	    	loginPage.signInButton.click();
	    	
	    	i_should_be_able_to_land_on_welcome_page_and_read_welcome_message();
	    	
	    	myAccountPage.logOutLink.click();
		}
	    
	    
	    
		
	}
	
	
	@When("I enter valid email and click Create Account")
	public void i_enter_valid_email_and_click_Create_Account() {
	    
	}
	
	
	@When("I should be able to pass the following data")
	public void i_should_be_able_to_pass_the_following_data(List<User> list) {
		

		for (User user : list) {
			System.out.println(user.getFirstName() + " " +user.getLastName()  + " "+user.getAddress() + " " +
		user.getCity() + " " + user.getZip());
		}



	}


}
