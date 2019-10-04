@Dev
Feature: As a user I want to be able to check the rate of Mortgages available to me

  Scenario Outline:
    Given I am on the Mortgage Calculator Home page
    When I enter valid details as "<Home_Value>", "<DownPayment>", "<LoanAmount>", "<InterestRate>", "<LoanTerm>" and "<StartDate>"
    And I click Calculate Button
    Then "<Monthly_repayment>", "<Down_Payment>", "<MonthlyTax>" and "<MonthlyHomeInsurance>" are correctly diksplayed
    Examples:
      | Home_Value | DownPayment | LoanAmount | InterestRate | LoanTerm | StartDate | Monthly_repayment | Down_Payment | MonthlyTax | MonthlyHomeInsurance |
#      | 180000     | 25000       | 155000     | 6            | 15       | 2019      | $1,655.89         | $25,000.00   | $200.00    | $83.33               |
      | 200000     | 40000       | 160000     | 6            | 15       | 2019      | $1,633.50         | $25,000.00   | $200.00    | $83.33               |