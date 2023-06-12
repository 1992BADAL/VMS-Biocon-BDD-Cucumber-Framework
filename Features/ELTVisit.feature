 Feature: ELT Visit

  Scenario: ELT Visit create from Reception Screen
    Given User launch Chrome browser and Open the URL "https://api.devicehome.tech/login/sso?redirect_uri=https://reception.devicehome.tech"
    Then Click on main menu icon
    And Select Create ELT Visit
    Then Go to To-Meet box and fill the email or name of the employee
    And Click on Search field
    Then Click on Select Btn of suggested Employee Name
    And Select Visiting location from dropdown
    And Select Building Name from dropdown
    And Type Visitor Company Name
    And Select number of visitor from dropdown list
    And Enters Visitors EmailID as "mondalbadal@gmail.com" and Name as "Badsah"
    And click on search btn after email
    When Click on Create visit button
    Then Message should displayed "Your Visit is Successfully Created"
    And Close the Browser
