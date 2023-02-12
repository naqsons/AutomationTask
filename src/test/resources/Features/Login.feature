Feature: Verify Login Functionality

  Scenario Outline: Verify Login with wrong credentials
    Given I access the sauce labs login page
    When I am entering the user <username>
    And I enter pass <password>
    And I click on Login button
    Then Verify user should not able to login
    Examples:
      | username      | password     |
      | standard_user | wrongPass    |
      | wrongUser     | secret_sauce |
      | wrongUser     | wrongPass    |

  Scenario: Verify Login with right credentials
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    Then Verify user should be able to login
