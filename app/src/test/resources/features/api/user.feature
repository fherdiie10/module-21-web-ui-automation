@api
Feature: User API Testing


  Scenario: Get users successfully
    Given user API is ready
    When I send GET request to get all users
    Then response status code should be 200


  Scenario: Get list of tags successfully
    Given user API is ready
    When I send GET request to get all tags
    Then response status code should be 200