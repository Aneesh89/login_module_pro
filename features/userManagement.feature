@fea1 
Feature: User Management Testing 

Background: Navigate to Home Page 
	Given User is on the Home Page 
	
@t001 
Scenario: 
	Test Negative Login Functionality 
	When pass the Incorrect Username 
	Then Pass the Password 
	And type capcha code 
	Then click on the submit button 
	Then select GD menu 
	Then Add GD Depature 
	Then Type Arrival 
	Then Enter GD Subject And GD Brief 
	
@t002 
Scenario: 
	Test Negative Login Functionality Two 
	When pass the Incorrect Username 
	Then Pass the Password 
	And type capcha code 
	Then click on the submit button 
	Then Remove previous session 
	
	
	
	
	
 	 	         