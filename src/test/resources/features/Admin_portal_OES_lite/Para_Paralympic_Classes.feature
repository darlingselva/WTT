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

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" without enter the Paralympic Class Name fields
    And Create Paralympic Classes without enter the Paralympic Class Name fields

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" without select the Impairment Group dropdown field
    And Create Paralympic Classes without select the Impairment Group dropdown field

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" Impairment Group dropdown field values
    And Create Paralympic Classes Impairment Group dropdown field values

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" without enter the Description fields
    And Create Paralympic Classes without enter the Description fields

  @WTT_OVR_Lite_Admin_portal_TS008
  Scenario: To Verify the "Create Paralympic Classes" without enter the Class Id fields
    And Create Paralympic Classes without enter the Class Id fields