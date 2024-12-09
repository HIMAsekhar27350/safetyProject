Feature: Work on the safety website to search product

  Scenario: Searching for product in the safety website
    Given lanching the chrome browser land on safety website
    When navigate to search bar
    Then Enter the product name and click on the enter button
    Then close the browser