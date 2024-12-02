@Admin_OES_lite_para
@Admin_OES_lite
@Para_Mobility_Code_scenario
Feature: Admin OES lite portal - para Para_Mobility_Code_scenario

  Background: login the application
    Given Login the admin Application

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Para Mobility Code" option page
    And To Verify the Para Mobility Code option page

  @WTT_OVR_Lite_Admin_portal_TS009
  Scenario: To Verify the Create Para Mobility Code button in the Para Mobility Code option page
    And To Verify the Create Para Mobility Code button in the Para Mobility Code option page

  @WTT_OVR_Lite_Admin_portal_TS010
  Scenario: To Verify the Create Para Mobility Code using positive values
    And To Verify the Create Para Mobility Code using positive values

  @WTT_OVR_Lite_Admin_portal_TS011
  Scenario: To Verify the "Create Para Mobility Code" without enter the name fields
    And Create Para Mobility Code without enter the name fields

  @WTT_OVR_Lite_Admin_portal_TS012
  Scenario: To Verify the "Create Para Mobility Code" without enter the code fields
    And Create Para Mobility Code without enter the code fields

  @WTT_OVR_Lite_Admin_portal_TS013
  Scenario: To Verify the "Create Para Mobility Code" disable "Action" toggle
    And Create Para Mobility Code disable Action toggle

  @WTT_OVR_Lite_Admin_portal_TS014
  Scenario: To Verify the "Create Para Mobility Code" cancel the popup window
    And Create Para Mobility Code cancel the popup window

  @WTT_OVR_Lite_Admin_portal_TS015
  Scenario: To Verify the "Edit Para Mobility Code" from data table
    And Edit Para Mobility Code from data table

  @WTT_OVR_Lite_Admin_portal_TS016
  Scenario: To Verify the "Edit Para Mobility Code" from data table using edit name field
    And Edit Para Mobility Code from data table using edit name field

  @WTT_OVR_Lite_Admin_portal_TS017
  Scenario: To Verify the "Edit Para Mobility Code" from data table using edit Code  field
    And Edit Para Mobility Code from data table using edit Code  field

  @WTT_OVR_Lite_Admin_portal_TS018
  Scenario: To Verify the "Edit Para Mobility Code" from data table using edit both name and Code  field
    And Edit Para Mobility Code from data table using edit both name and Code  field

  @WTT_OVR_Lite_Admin_portal_TS019
  Scenario: To Verify the "Edit Para Mobility Code" from data table using edit Active status
    And Edit Para Mobility Code from data table using edit Active status

  @WTT_OVR_Lite_Admin_portal_TS020
  Scenario: To Verify the "Edit Para Mobility Code" from data table using empty value for name field
    And Edit Para Mobility Code from data table using empty value for name field

  @WTT_OVR_Lite_Admin_portal_TS021
  Scenario: To Verify the "Edit Para Mobility Code" from data table using empty value for Code field
    And Edit Para Mobility Code from data table using empty value for Code field

  @WTT_OVR_Lite_Admin_portal_TS022
  Scenario: To Verify the "Edit Para Mobility Code" from data table using empty value for both Name and Code field
    And Edit Para Mobility Code from data table using empty value for both Name and Code field

  @WTT_OVR_Lite_Admin_portal_TS023
  Scenario: To Verify the "Edit Para Mobility Code" from data table click on cancel button
    And Edit Para Mobility Code from data table click on cancel button

  @WTT_OVR_Lite_Admin_portal_TS024
  Scenario: To Verify the search field in the Para Mobility Code data table
    And search field in the Para Mobility Code data table

  @WTT_OVR_Lite_Admin_portal_TS025
  Scenario: To Verify the "Delete Para Mobility Code" from data table
    And Delete Para Mobility Code from data table

    Then Logout admin portal application


