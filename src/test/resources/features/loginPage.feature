Feature: Login Functionality for OpenCart E-commerce Website

	As a user of OpenCart Website 
	I want to be able Login with my account
	so that I can access my account related features and manage orders

 Background: 
	Given: I am on the OpenCart Login page
	
 Scenario: Successful login with valid credentials
   Given I have entered a valid username and password
   When I click on Login button
   Then I should be logged in successfully
   
 Scenario Outline: Unsuccessful login with invalid or empty credentials
   Given I have entered invalid "<username>" and "<password>"
   When I click on the Login button
   Then I should see an error message indicating "<error message>"
   
 Examples:
   |     Username             |      password        |     error message                                                    |
   | invalid@email.com        | invalidPassword      | Warning: No match for Email Addresss and/or Password                 |
   | sdfsf@email.com          | validPassword        | Warning: No match for Email Addresss and/or Password                 |
   | invalid@email.com        | invalidPassword      | Warning: No match for Email Addresss and/or Password                 |
   | valid@email.com          | abccc                | Warning: No match for Email Addresss and/or Password                 |
   
 Scenario: Navigating to the forgotten password page
   When I click on the "Forgotten Password" Link
   Then I should redirect to the password reset page



