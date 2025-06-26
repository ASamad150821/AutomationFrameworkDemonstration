#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tags
Feature: LoginFeatureFile
  I want to use this feature file to verify that I can log in to my application with the correct details

  @tag1
  Scenario: Successful login
    Given that I have navigated to the login page
    When I enter my username
    And I enter my password
    And I click on the submit button
    Then I will be navigated to the products page
    
    @tag2
    Scenario: Unsuccessful login
    Given that I have navigated to the login page
    When I enter my username
    And I enter an incorrect password
    And I click on the submit button
    Then I will see an error message
    

