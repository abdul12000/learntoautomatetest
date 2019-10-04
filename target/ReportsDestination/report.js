$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MortgageCalculator.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to check the rate of Mortgages available to me",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the Mortgage Calculator Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid details as \"\u003cHome_Value\u003e\", \"\u003cDownPayment\u003e\", \"\u003cLoanAmount\u003e\", \"\u003cInterestRate\u003e\", \"\u003cLoanTerm\u003e\" and \"\u003cStartDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click Calculate Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"\u003cMonthly_repayment\u003e\", \"\u003cDown_Payment\u003e\", \"\u003cMonthlyTax\u003e\" and \"\u003cMonthlyHomeInsurance\u003e\" are correctly diksplayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me;;",
  "rows": [
    {
      "cells": [
        "Home_Value",
        "DownPayment",
        "LoanAmount",
        "InterestRate",
        "LoanTerm",
        "StartDate",
        "Monthly_repayment",
        "Down_Payment",
        "MonthlyTax",
        "MonthlyHomeInsurance"
      ],
      "line": 10,
      "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me;;;1"
    },
    {
      "comments": [
        {
          "line": 11,
          "value": "#      | 180000     | 25000       | 155000     | 6            | 15       | 2019      | $1,655.89         | $25,000.00   | $200.00    | $83.33               |"
        }
      ],
      "cells": [
        "200000",
        "40000",
        "160000",
        "6",
        "15",
        "2019",
        "$1,633.50",
        "$25,000.00",
        "$200.00",
        "$83.33"
      ],
      "line": 12,
      "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13901976500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#      | 180000     | 25000       | 155000     | 6            | 15       | 2019      | $1,655.89         | $25,000.00   | $200.00    | $83.33               |"
    }
  ],
  "line": 12,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-check-the-rate-of-mortgages-available-to-me;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the Mortgage Calculator Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid details as \"200000\", \"40000\", \"160000\", \"6\", \"15\" and \"2019\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click Calculate Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"$1,633.50\", \"$25,000.00\", \"$200.00\" and \"$83.33\" are correctly diksplayed",
  "matchedColumns": [
    6,
    7,
    8,
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MortgageCalculatorStepDef.i_am_on_the_Mortgage_Calculator_Home_page()"
});
formatter.result({
  "duration": 11987390600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200000",
      "offset": 26
    },
    {
      "val": "40000",
      "offset": 36
    },
    {
      "val": "160000",
      "offset": 45
    },
    {
      "val": "6",
      "offset": 55
    },
    {
      "val": "15",
      "offset": 60
    },
    {
      "val": "2019",
      "offset": 69
    }
  ],
  "location": "MortgageCalculatorStepDef.i_enter_valid_details_as_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2114516900,
  "status": "passed"
});
formatter.match({
  "location": "MortgageCalculatorStepDef.i_click_Calculate_Button()"
});
formatter.result({
  "duration": 2179482000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,633.50",
      "offset": 1
    },
    {
      "val": "$25,000.00",
      "offset": 14
    },
    {
      "val": "$200.00",
      "offset": 28
    },
    {
      "val": "$83.33",
      "offset": 42
    }
  ],
  "location": "MortgageCalculatorStepDef.and_are_correctly_diksplayed(String,String,String,String)"
});
formatter.result({
  "duration": 296091700,
  "status": "passed"
});
formatter.after({
  "duration": 4567832700,
  "status": "passed"
});
});