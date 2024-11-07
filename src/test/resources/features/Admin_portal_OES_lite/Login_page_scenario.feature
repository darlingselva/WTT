@Admin_OES_lite_Loginpage
@Admin_OES_lite
Feature: Admin OES lite portal - Login page scenarios


  Scenario: To Verify that  login page using valid username and valid password
    Given Login the admin Application
    And Excepted results Admin positive scenarios
    Then Logout admin portal application

  Scenario: To Verify that  login page using invalid username and valid password
    Given launch the Admin Application
    And enter the Admin username 'admin.invalid.username'
    And enter the Admin password 'admin.valid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  Scenario: To Verify that  login page using valid username and invalid password
    Given launch the Admin Application
    And enter the Admin username 'admin.valid.username'
    And enter the Admin password 'admin.invalid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  Scenario: To Verify that  login page using invalid username and invalid password
    Given launch the Admin Application
    And enter the Admin username 'admin.invalid.username'
    And enter the Admin password 'admin.invalid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios

  Scenario: To Verify that  login page using enter the username field as empty value and valid password
    Given launch the Admin Application
    And enter the Admin password 'admin.valid.password'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2

  Scenario: To Verify that  login page using valid and enter the password field as empty value
    Given launch the Admin Application
    And enter the Admin username 'admin.valid.username'
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2

  Scenario: To Verify that  login page using enter the username field as empty value and enter the password field as empty value
    Given launch the Admin Application
    And Click on the Admin login button
    Then Excepted results Admin negative scenarios2