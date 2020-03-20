@Smoke_test
Feature: Sign In
  As a user, I want to be able to Sign In to CVS website

#  Any step that was implemented before, can be reused
#  click ctrl + alt + L to organize code, save like in java
#  By passing parameters/strings in "word" we can reuse test steps

  @positive_test_user1
  Scenario: using valid email address and valid password
    Given user is on the Sign in page
    When  user enter valid email address "keremgorgulu@yahoo.com"
    And   user enter valid password "plano2020"
    Then  user sign in and verifies that "﻿﻿CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information" page title is displayed

  @negative_test_1_user2
  Scenario: Verify that "Enter a valid password" message is displayed when password is not correct
    Given user is on the Sign in page
    When  user enter "keremgorgulu@yahoo.com" as an email address
    And   user enter "wrong_password" as a password
    Then  user verify that "Invalid password" message is displayed

  @negative_test_2_user3
  Scenario: Verify that "Email not found" message is displayed when Invalid email is entered
    Given user is on the Sign in page
    When  user enter Invalid_email as "Invalid_email@gmail.com"
    Then  user verify that "Email not found" warning is displayed

  @negative_test_3_user4
  Scenario: Verify that "Couldn't sign In" message is displayed when wrong email format is looked up
    Given user is on the Sign in page
    When  user enter "Invalid_email" format
    Then  user verifies that "Couldn't sign In" message is displayed

  @login_with_role_ddt
  Scenario Outline: DDT example, Login as <role>
    Given user is on the Sign in page
    Then user sign in as "<role>"

    Examples: roles
      | role     |
      | user1    |
      | user2    |
      | user3    |
      | user4    |


  @login_with_credentials_ddt
  Scenario Outline: DDT example with credentials, Login as <username>
    Given user is on the login page
    Then user enters "<username>" username and "<password>" password

    Examples:
      | username                | password       |
      | keremgorgulu@yahoo.com  | plano2020      |
      | keremgorgulu@yahoo.com  | wrong_password |
      | Invalid_email@gmail.com |                |
      | Invalid_email           |                |

