Feature: Get user
  As a admin
  I want to see all user
  So I can manage the store

  Scenario: get all user
    Given I set url get all user
    When I request get all user
    Then I get status code 200