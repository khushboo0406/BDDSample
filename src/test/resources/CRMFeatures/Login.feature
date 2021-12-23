Feature: CRM Login Feature

#Scenario: Valid Login
#Given User is already on login page
#When User enters login credentials
#Then User is on Home Page

#Scenario: Valid Login
#Given User is already on login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User is on Home Page

#For multiple set of data , scenario outline will be used for entire scenario.
#Scenario Outline: Valid Login
#Given User is already on login page
#When User enters "<username>" and "<password>"
#Then User is on Home Page
#
#Examples: 
#		| username | password |
#		| testuser1 | welcome123 |
#		| testuser2 | welcome123 |
#		| tomsmith | SuperSecretPassword! |

#step wise data using List and with the help of index
#Scenario: Valid Login
#Given User is already on login page
#When User enters login credentials
#	| tomsmith | SuperSecretPassword! |
#Then User is on Home Page


#step wise data using Maps and strUser and strPwd as header.
Scenario: Valid Login
Given User is already on login page
When User enters login credentials
	| strUser | strPwd |
	| tomsmith | SuperSecretPassword! |
Then User is on Home Page


