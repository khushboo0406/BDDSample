@PhaseTwo
Feature: CRM ModuleTwo Feature

Background: User Login
Given User is loggedIn

@RegressionTest
Scenario: Create a Task
#Given User is loggedIn
When User enters Task details

Scenario: View Task Details
#Given User is loggedIn
When User view Task details

@SmokeTest
Scenario: Update a Task
#Given User is loggedIn
When User update Task details