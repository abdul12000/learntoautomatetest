Feature: As a User I want to be able to signup to the Mercury tours website


  Scenario: 1. Sign up using valid details
    Given I am on the Mercury website
    When I click on the Register button
    And enter details as follows firstname "Lateef", Lastname as "Abdul", emails as "Abdul@yahoo.com", username as "abdulLateef" and password as "pwd"
    And click Submit
    Then "Lateef", "Abdul" and "abdulLateef" are displayed


  Scenario Outline: 1. Sign up using valid details with data supplied via cucumber examples
    Given I am on the Mercury website
    When I click on the Register button
    And enter details as follows "<firstname>", "<lastname>", "<email>", "<username>", and "<password>"
    And click Submit
    Then "<firstname>", "<lastname>" and "<username>" are displayed
    Examples:
      | firstname | lastname | email               | username  | password   |
#      | ola       | gbenro   | olaGnenro@yahoo.com | OlaGbenro | mypassword |
      | olaA      | gbenroA  | olaGnenroA@yahoo.com | OlaGbenroA | mypasswordA |
#      | olaB      | gbenroB  | olaGnenroB@yahoo.com | OlaGbenroB | mypasswordB |



  Scenario: Login to the Mercury site using valid login details
    Given I am on the Mercury website
    And i click on the Sign-up link
    When i enter  valid username and password as "OlaGbenro" and "mypassword"
    And i click on submit button
    Then I should be signed in


  Scenario:Test that User cannot loging to the Mercury site using Invalid details
    Given I am on the Mercury website
    And i click on the Sign-up link
    When i enter  invalid username and password as "OlaGbenroInvalid" and "mypasswordInvalid"
    And i click on submit button
    Then I should NOT be signed in
