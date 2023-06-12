
  Feature: Visit Creation for Direct Walk-In

  Scenario: Create Visit from Reception Screen
    Given User launch Chrome browser and Open the URL 
    "https://api.devicehome.tech/login/sso?redirect_uri=https://reception.devicehome.tech"
    Then Click on main menu icon
    And Select Direct Walk-In
    Then Go to To-Meet box and fill the email or name of the employee
    And Click on Search field
    Then Click on Select Btn of suggested Employee Name
    And Select Visiting location from dropdown
    And Select Building Name from dropdown
    And Select Visitor Sub-Type from dropdown
    
    And Type Visitor Company Name
    And Select number of visitor from dropdown
    And Click on Gov Id checkbox1
    And Enters Visitors Email as "mondalbadal79@gmail.com" and Name as "Johnathon"
    And click on search btn
    When Click on Create visit button
    Then Message should displayed "Your Visit is Successfully Created"
    And Close the Browser
 