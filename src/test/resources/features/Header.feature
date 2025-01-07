@Header
Feature: Header Link Access Functionality

  Scenario: Access page "Home" in header links
    Given the user is on the home page
    When the user click on "Home" header link
    Then the user sees "Home" title

  Scenario: Access page "Products" in header links
    Given the user is on the home page
    When the user click on "Products" header link
    Then the user sees "Products" title

  Scenario: Access page "Cart" in header links
    Given the user is on the home page
    When the user click on "Cart" header link
    Then the user sees "Cart" title

  Scenario: Access page "Signup / Login" in header links
    Given the user is on the home page
    When the user click on "Signup / Login" header link
    Then the user sees "Signup / Login" title

  Scenario: Access page "Test Cases" in header links
    Given the user is on the home page
    When the user click on "Test Cases" header link
    Then the user sees "Test Cases" title

  Scenario: Access page "API Testing" in header links
    Given the user is on the home page
    When the user click on "API Testing" header link
    Then the user sees "API Testing" title

  Scenario: Access page "Video Tutorials" in header links
    Given the user is on the home page
    When the user click on "Video Tutorials" header link
    Then the user sees "Video Tutorials" title

  Scenario: Access page "Contact us" in header links
    Given the user is on the home page
    When the user click on "Contact us" header link
    Then the user sees "Contact us" title