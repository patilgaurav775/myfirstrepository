Feature: ORANGEHRM login
 Background: following are some common functionalities
		#Given I launch crome browser
    #When I open orange hrm page "https://opensource-demo.orangehrmlive.com/"
    Then I verify that the logo present on page	
    
    
Scenario: Logo presence on orangehrm home page and login successful with valid credentials
    Then login with valid credentials username as "Admin" and password as "admin123"
    When dashboard is selected by default
    Then I logout from dashboard
 
    
#Scenario Outline: Login Data driven
		#Then login with valid credentials username as "<username>" and password as "<pass>"
   # When dashboard is selected by default
   # Then I logout from dashboard
		#And Close the browser
		
		
	#	Examples:
			#	| username|      pass|
   		#	|    Admin|  admin123|
   			
   			
Scenario: Logo presence on orangehrm home page and login successful with valid credentials
    Then login with valid credentials username as "Admin" and password as "admin"
  
    
    
 