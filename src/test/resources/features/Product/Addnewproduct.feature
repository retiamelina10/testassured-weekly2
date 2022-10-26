Feature: Add new product
  As a user
  I want to add new product
  So i can add my new product

  Scenario: add new product with valid body description
    Given I set url add new product
    And I set body request
    When I request add product with body
    Then I get status code 200