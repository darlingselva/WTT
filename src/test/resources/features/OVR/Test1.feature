Feature: OVR portal - Create the draw for all the Sub events1

@OVR
Scenario: To verify the create the draw for all the sub event1
Given Login the OVR Application
  And Switch into WTT event 'WTT Youth Star Contender 2024'
  When get the subevents from modality
  And update the match result in the result management for 'Group standing'
  Then Logout the OVR Application

