Feature: Verify Products Functionality

  Scenario: Verify that by clicking on image it's opening products detail page
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on products image
    Then Verify product details page is opening

  Scenario: Verify that product is being added to cart successfully
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on add to cart button
    And I click on go to cart button
    Then Verify product is being added successfully

  Scenario: Verify that product is being removed successfully from product list
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on add to cart button
    And I click on go to cart button
    And I click on remove product button
    Then Verify product is being removed successfully

  Scenario: Verify that user is able to add multiple products
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on add to cart button
    And I click on go to cart button
    And I click on continue shopping
    And I click on add to cart button
    And I click on go to cart button
    Then Verify that multiple products are being added

  Scenario:Verify that user is able to place the order successfully
    Given I access the sauce labs login page
    When I am entering the user standard_user
    And I enter pass secret_sauce
    And I click on Login button
    And I click on add to cart button
    And I click on go to cart button
    Then Verify product is being added successfully
    And I click on checkout button
    And I enter user details
    And I click on continue button
    And I click on finish
    Then Verify order has been places successfully