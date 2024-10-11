@OVR_Loginpage
Feature: OVR portal - Login page scenarios

  @OVR_Loginpage_positive
  Scenario: To verify the login page with valid user name and valid password
    Given launch the OVR Application
    And enter the OVR username 'cm'
    And enter the OVR password 'cm@2021'
    When Click on the OVR login button
    Then Excepted results OVR positive scenarios
    Then Logout the OVR Application

  @OVR_Loginpage_Negative
  Scenario: To verify the login page with invalid user name and valid password
    Given launch the OVR Application
    And enter the OVR username 'Am'
    And enter the OVR password 'cm@2021'
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios

  @OVR_Loginpage_Negative
  Scenario: To verify the login page with valid user name and invalid password
    Given launch the OVR Application
    And enter the OVR username 'cm'
    And enter the OVR password 'cm@2022'
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios

  @OVR_Loginpage_Negative
  Scenario: To verify the login page with invalid user name and invalid password
    Given launch the OVR Application
    And enter the OVR username 'Am'
    And enter the OVR password 'cm@2022'
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios

  @OVR_Loginpage_Negative
  Scenario: To verify the login page without username and password
    Given launch the OVR Application
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios without username and password

  @OVR_Loginpage_Negative
  Scenario: To verify the login page without username
    Given launch the OVR Application
    And enter the OVR password 'cm@2021'
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios without username

  @OVR_Loginpage_Negative
  Scenario: To verify the login page without password
    Given launch the OVR Application
    And enter the OVR username 'cm'
    When Click on the OVR login button
    Then Excepted results OVR negative scenarios without password




