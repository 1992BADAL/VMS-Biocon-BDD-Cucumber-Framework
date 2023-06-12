  
  Feature: Temporary Pass 

  Scenario: Temporary Pass from Reception Screen
    Given User launch Chrome browser and Open the URL "https://api.devicehome.tech/login/sso?redirect_uri=https://reception.devicehome.tech"
    Then Click on main menu icon
    And Select Temporary Pass Icon
    Then Go to Search Employee box and fill the name of the employee
    And Click on Search field
    Then Click on Select Btn of suggested Employee Name
    And Select Access Card number
    Then Click on Generate Temporary Pass
    And Click On Capture Image
    Then Click on GENERATE PASS Btn
    And Click on Print PASS
    And Close the Browser
 