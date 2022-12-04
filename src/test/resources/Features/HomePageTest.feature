@Home
Feature: Homepage functions Validation

  @SmokeTest @Regression @Functional @Emdad
  Scenario: Verify Home Page
    Given user is on Home page
    When user click on Hot Sauce Tab
    Then Hot Sauce page should be appeared
    When user click on Marchandise Tab
    Then Marchandise page should be appeared
