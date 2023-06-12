Feature: Visit Creation for Biocon-VMS

  Scenario: Create Visit from Employee Screen
    Given User launch Chrome browser and Open the URL "https://api.devicehome.tech/login/sso?redirect_uri=https://visits.devicehome.tech"
    And Select Visiting location dropdown list
    And Select Building Name
    And Select Visitor Sub-Type
    And Select number of visitor
    And Select Visitor Company Name
    And Click on Gov Id checkbox
    And Write email on email field
    And click on search button
    When Click on Create visit button
    Then Message should displayed "Your Visit is Successfully Created"
    And Close the Browser
