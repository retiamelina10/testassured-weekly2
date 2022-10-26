Feature: Delete user
  As a admin
  I want to delete a user
  So I can manage the store

  Scenario: delete a user
    Given I set url delete user
    When I request delete user
    Then I get status code 200