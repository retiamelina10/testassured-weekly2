Feature: User login
  As a user
  I want to login
  So I can access all features

  Scenario: Login with valid username and password
    Given I set url user login
    And I set valid username and password
    When I request login
    Then I get status code 200

  Scenario: Login with invalid username and password
    Given I set url user login
    And I input invalid username and password
    When I request login
    Then I get status code 401