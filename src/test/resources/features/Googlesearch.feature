Feature: Google Search

Scenario: Search Java Tutorial
Given User is on Google page
When User search for Java Tutorial
Then Should display Java Tutorial result page
And close the browser

Scenario: Search Selenium Tutorial
Given User is on Google page
When User search for Selenium Tutorial
Then Should display Selenium Tutorial result page
And close the browser