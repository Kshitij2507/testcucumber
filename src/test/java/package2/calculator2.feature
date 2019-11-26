Feature: Test Calculator
This file describes calculater Functionality

Scenario: Add two numbers
Given I enter 20 in the calculator
And I press add
And I have entered 20 in the calculator
When I press equal symbol
Then The result should be 40 on the screen