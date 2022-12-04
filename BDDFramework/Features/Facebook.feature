Feature: Facebook Login

  Scenario: Logo presence on Facebook homepage
    Given I launch chrome browser
    When I open facebook homepage
    Then I verify that logo present on page
    And close browser
