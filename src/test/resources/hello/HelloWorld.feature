Feature: Demo'ing the capabilities of Cucumber with Sample Controller

  Scenario: As a client I have used hit the hello api endpoint
    Given The API endpoint is accessible
    When I hit the root endpoint
    Then I get back Hello Docker World
