# new feature
# Tags: optional
    
Feature: Registration

Background:
  User navigates to website Given
  I am on site registration page

  Scenario: Registration
  Given I am on site registration page
  When I enter email as "qwerty21845@gmail.com"
  When I enter password as "bnghty@123"
  When I enter mobile as "7838185719"
  When I select the title
  When I click on register
  Then account is registered