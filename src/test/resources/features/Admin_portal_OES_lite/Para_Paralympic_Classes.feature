@Admin_OES_lite_para
@Admin_OES_lite
@Para_Paralympic_Classes
Feature: Admin OES lite portal - para Para_Paralympic_Classes scenarios

  Background: login the application
    Given Login the admin Application

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Paralympic Classes" option page
    And Paralympic Classes option page

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" button in the "Paralympic Classes" option page
    And Create Paralympic Classes button in the Paralympic Classes option page

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" using positive values
    And Create Paralympic Classes using positive values