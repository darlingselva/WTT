@Admin_OES_lite_Loginpage
@Admin_OES_lite
Feature: Admin OES lite portal - Login page scenarios

  @WTT_OVR_Lite_Admin_portal_TS001
  Scenario: To Verify that  login page using valid username and valid password
    Given Login the admin Application
    And Excepted results Admin positive scenarios
    Then Logout admin portal application

  @WTT_OVR_Lite_Admin_portal_TS002
  Scenario: To Verify that  login page using invalid username and valid password
    Given launch the Admin Application
    And enter the Admin username 'admin.invalid.username'
    And enter the Admin password 'admin.valid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  @WTT_OVR_Lite_Admin_portal_TS003
  Scenario: To Verify that  login page using valid username and invalid password
    Given launch the Admin Application
    And enter the Admin username 'admin.valid.username'
    And enter the Admin password 'admin.invalid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  @WTT_OVR_Lite_Admin_portal_TS004
  Scenario: To Verify that  login page using invalid username and invalid password
    Given launch the Admin Application
    And enter the Admin username 'admin.invalid.username'
    And enter the Admin password 'admin.invalid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  @WTT_OVR_Lite_Admin_portal_TS005
  Scenario: To Verify that  login page using enter the username field as empty value and valid password
    Given launch the Admin Application
    And enter the Admin password 'admin.valid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2

  @WTT_OVR_Lite_Admin_portal_TS006
  Scenario: To Verify that  login page using valid and enter the password field as empty value
    Given launch the Admin Application
    And enter the Admin username 'admin.valid.username'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2

  @WTT_OVR_Lite_Admin_portal_TS007
  Scenario: To Verify that  login page using enter the username field as empty value and enter the password field as empty value
    Given launch the Admin Application
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2