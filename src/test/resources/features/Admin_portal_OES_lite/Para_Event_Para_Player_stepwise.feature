@Admin_OES_lite_para
@Admin_OES_lite
@Para_Event_Para_Player
Feature: Admin OES lite portal - para Para_Event_Para_Player scenarios

  Scenario: Admin OES lite portal - para Para_Event_Para_Player scenarios
    Given Login the admin Application
    And Admin portal event creation
    And enable Is Para Event toggle button in the Core step page Event creation process
    And enable Is Para Event toggle button in the Core step page and Verify Hospitality tab Event creation process
    And Para Accessibility Room Type dropdown in the Hospitality tab Event creation process
    And enable Is Para Event toggle button in the Core step page and verify Review tab Event creation process
    And enable Is Para Event toggle button in the Core step page and verify create the Event
    And Edit the Para Accessibility Room Type dropdown values in the Hospitality tab for created event
    And Edit the Para Accessibility Room Type dropdown values in the Hospitality tab and verify Review tab for created event
    And Edit the Para Accessibility Room Type dropdown values in the Hospitality tab and verify update tab for created event