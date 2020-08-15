Feature: Leaftaps login functionality

#Background:
#Given open the ChromeBrowser
#And Load the application url   
#And maximize the browser 
#And apply implicitly wait

Scenario Outline: TC001_login with valid credential

Given Enter the username as <username> 
And Enter the password as <password> 
When Click on login button
Then the homepage should be displayed

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|



Scenario: TC002_login with invalid password

Given Enter the username as demoCSR
And Enter the password as crmsfa123
When Click on login button
But errormessage should be displayed




