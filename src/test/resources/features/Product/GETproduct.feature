Feature: Get product
  As a user
  I want to get all product
  So I can see all product at store

  Scenario: Get all product
    Given I set url get all product
    When I request get all product
    Then I get status code 200

  Scenario: Get a product with id
    Given I set url get a product
    When I request get product
    Then I get status code 200

  Scenario: Get a product with invalid url
    Given I set invalid url get a product
    When I request get product invalid url
    Then I get status code 200

