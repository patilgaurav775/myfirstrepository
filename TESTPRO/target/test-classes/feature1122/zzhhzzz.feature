Feature: check login functionality

 Scenario: check login with  valid credentials

	Given user is on login page 1
	When user enter valid username and password 1
	When clicks on login button 1
	Then user should navigated to home page 1