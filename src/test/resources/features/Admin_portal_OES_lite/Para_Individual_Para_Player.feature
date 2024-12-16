@Admin_OES_lite_para
@Admin_OES_lite
@Para_Para_Room_Type
Feature: Admin OES lite portal - para Para_Individual_Para_Player scenarios

  Background: login the application
    Given Login the admin Application

  @WTT_OVR_Lite_Admin_portal_pre_creation_Individual
  Scenario: OVR Lite Admin portal pre creation Individual
    And Admin portal Individuals creation

  @WTT_OVR_Lite_Admin_portal_TS100
  Scenario: To Verify the "Is Para Player" toggle button in the Individuals module
    And Para Player toggle button in the Individuals module

  @WTT_OVR_Lite_Admin_Portal_TS101
  Scenario: To Verify the enable "Is Para Player" toggle button in the Individuals creation page
    And Enable the Para Player toggle button

  @WTT_OVR_Lite_Admin_Portal_TS102
  Scenario: To Verify the Disable "Is Para Player" toggle button in the Individuals creation page
    And  Disable the Is Para Player toggle button

  @WTT_OVR_Lite_Admin_Portal_TS103
  Scenario: To Verify the "Para Information" step in individual creation process
    And Para Information step in individual creation process

  @WTT_OVR_Lite_Admin_Portal_TS104
  Scenario: To Verify the "Impairment Group" dropdown field "Para Information" step in individual creation process
    And Impairment Group dropdown field in Para Information step in individual creation process

  @WTT_OVR_Lite_Admin_Portal_TS105
  Scenario: To Verify the "Paralympic Class" dropdown field "Para Information" step in individual creation process
    And Paralympic Class dropdown field in Para Information step in individual creation process

  @WTT_OVR_Lite_Admin_Portal_TS106
  Scenario: To Verify the "Classification Status" dropdown field "Para Information" step in individual creation process
    And Classification Status dropdown field in Para Information step in individual creation process

  @WTT_OVR_Lite_Admin_Portal_TS107
  Scenario: To Verify the "Mobility Code" dropdown field "Para Information" step in individual creation process
    And Mobility Code dropdown field in Para Information step in individual creation process

  @WTT_OVR_Lite_Admin_Portal_TS108
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the all fields
    And Para Information step in individual creation process for Positive fields

  @WTT_OVR_Lite_Admin_Portal_TS109
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the all fields and validated values in "Review" step
    And Para Information step in individual creation process for Positive fields in Review step

  @WTT_OVR_Lite_Admin_Portal_TS110
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the all fields and validated values in "Review" step Then create the Individuals
    And Para Information step in individual creation process for Positive fields in Review step Then create the Individuals

  @WTT_OVR_Lite_Admin_Portal_TS111
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the Mandatory fields
    And Para Information step in individual creation process proceed for positive values of fill the Mandatory fields

  @WTT_OVR_Lite_Admin_Portal_TS112
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the Mandatory fields and validated values in "Review" step
    And Para Information step in individual creation process proceed for positive values of fill the Mandatory fields in Review step

  @WTT_OVR_Lite_Admin_Portal_TS113
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in "Review" step Then create the Individuals
    And Para Information step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in Review step Then create the Individuals

  @WTT_OVR_Lite_Admin_Portal_TS114
  Scenario: To Verify the "Para Information" step in individual creation process proceed for positive values of without fill the Mandatory fields
    And Para Information step in individual creation process proceed for positive values of without fill the Mandatory fields

   @WTT_OVR_Lite_Admin_Portal_TS115
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values  of fill the all fields
     And Para Information step in individual creation process proceed for positive values  of fill the all fields

   @WTT_OVR_Lite_Admin_Portal_TS116
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values of fill the all fields and validated values in "Review" step
     And Para Information step in individual creation process proceed for positive values of fill the all fields and validated values in Review step

   @WTT_OVR_Lite_Admin_Portal_TS117
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values of fill the all fields and validated values in "Review" step Then create the Individuals
     And Para Information step in individual creation process proceed for positive values of fill the all fields and validated values in Review step Then create the Individuals

   @WTT_OVR_Lite_Admin_Portal_TS118
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values of fill the Mandatory fields
     And Para Information step in individual creation process proceed for positive values of fill the Mandatory fields

   @WTT_OVR_Lite_Admin_Portal_TS119
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values of fill the Mandatory fields and validated values in "Review" step
     And Edit Para Information step in individual creation process proceed for positive values of fill the Mandatory fields and validated values in Review step

   @WTT_OVR_Lite_Admin_Portal_TS120
   Scenario:To Verify the Edit "Para Information" step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in "Review" step Then create the Individuals
   And Edit Para Information step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in Review step Then create the Individuals

   @WTT_OVR_Lite_Admin_Portal_TS121
   Scenario: To Verify the Edit "Para Information" step in individual creation process proceed for positive values of without fill the Mandatory fields
     And Edit Para Information step in individual creation process proceed for positive values of without fill the Mandatory fields

   @WTT_OVR_Lite_Admin_Portal_TS122
   Scenario: To Verify the delete Individuals from the datatable
     And delete Individuals from the datatable

   @WTT_OVR_Lite_Admin_Portal_TS123
   Scenario:To Verify the search field in Individuals page
     And Verify the search field in Individuals page

   @WTT_OVR_Lite_Admin_Portal_TS124
     Scenario: Para Information->Next button
     And Para Information in individual Next button

   @WTT_OVR_Lite_Admin_Portal_TS125
   Scenario: Para Information-> Back button
     And Para Information in individual Back button






