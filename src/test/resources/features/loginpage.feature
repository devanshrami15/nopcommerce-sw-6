@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @author_Devansh_Rami @sanity @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully and verify the message "Welcome, Please Sign In!"

  @author_ @smoke
  @author_Devansh_Rami @smoke
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcd123@gmail.com"
    And I enter password "abcd123"
    And I click on login button
    Then I should see the error message "Login was unsuccessful"

  @author_Devansh_Rami @sanity
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcdxyz123@gmail.com"
    And I enter password "abcd@123"
    And I click on login button
    Then I should login successfully and verify the logout link

  @author_Devansh_Rami
  Scenario: User should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "abcdxyz123@gmail.com"
    And I enter password "abcd@123"
    And I click on login button
    And I click on logout link
    Then I should logout successfully and verify the login link

