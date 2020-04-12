
Feature: Login functionality
		
		Background: 
			Given I am on the homepage
			When I click on Sign in
		
		# Scenario Title
		Scenario: Verify login page title 
		As a user, I want to be able to login #Scenario Description of the scenario
			
			Then The login page title should be Login - My Store
		
		@smoke
		Scenario: Verify login page elements 
			
			Then I should be able to see email, password boxes and login button
			

		Scenario: Verify positive login 
			
			And I enter duotech@gmail.com as email, dt123 as password, and click login
			Then I should be able to land on welcome page and read welcome message
			
		Scenario: Verify positive login using parametrization third
			
			And I enter "duotech@gmail.com" as email, "dt123" as password, and click login
			Then I should be able to land on welcome page and read welcome message
			
@smoke
		Scenario: Verify positive login using parametrization first
			
			And I enter "dt2020@gmail.com" as email, "dt123" as password, and click login
			Then I should be able to land on welcome page and read welcome message
		
			
		Scenario: Verify positive login using parametrization second
			
			And I enter "akmaldt@gmail.com" as email, "dt123" as password, and click login
			Then I should be able to land on welcome page and read welcome message
		
	
		
 