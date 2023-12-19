@regression
Feature: This feature file is for registration

  @author_Devansh_Rami @sanity @smoke
 Scenario: Verify user should navigate to register page successfully
   Given I am on homepage
   When I click on register link
   Then I verify register text

    @author_Devansh_Rami @smoke
   Scenario: verify that firstname,lastname,email,password and confirmPassword fields are mandatory
     Given I am on homepage
     When I click on register link
     And I click on register button
     And Verify the error message "First name is required"
     And Verify the error message "Last name is required"
     And Verify the error message "Email is required"
     And Verify the error message "Password is required"
     Then Verify the error message "Password is required"

      @author_Devansh_Rami
     Scenario: Verify that user should create account successfully
       Given I am on homepage
       When I click on register link
       And I enter firstname
       And I enter lastname
       And I select day
       And I select month
       And I select year
       And I enter email "abc11@gmail.com"
       And I enter password "abcxyz@123"
       And I enter confirm password "abcxyz@123"
       And I click on register button
       Then Verify message "Your registration completed

