
Feature: DemoQA - Interactions
  Background:
    Given I am on the "Home" page
    And   I click "Interactions"
    Then  I am on the "Interactions" page
  @run
  Scenario: Selectable
    When I click "Selectable option"
