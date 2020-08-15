Feature: Create Lead in Leaftaps

Scenario: TC003_Create a new lead in leaftaps

Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on login button
Then the homepage should be displayed
Given enter companyname as TestLeaf
When Click Submit button
Then Lead should be created