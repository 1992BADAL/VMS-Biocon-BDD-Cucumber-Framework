Feature: Check Display Visitor

  Scenario: 
    Given User launch Chrome browser and Open the URL "https://api.devicehome.tech/login/sso?redirect_uri=https://reception.devicehome.tech"
    Then Click on Visit Approved button
    And Select Visitor detail for Updating details
    And Click on GovId CheckBox
    And Select one of GovId from dropdown and fill the Id Number
    And Click On Capture Image
    And Click on update details
    When Click on PRINT PASS btn
    Then Result shows as Print Pass
 