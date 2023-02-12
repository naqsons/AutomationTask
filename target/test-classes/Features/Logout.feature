Feature: Verify Logout Functionality

  Scenario: Verify that user is able to logout successfully
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on hamburger menu
    And I click on Logout button
    Then Verify I am able to logout successfully
