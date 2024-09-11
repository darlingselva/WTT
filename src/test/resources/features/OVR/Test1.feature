Feature: OVR portal - Create the draw for all the Sub events1

@OVR
Scenario: To verify the create the draw for all the sub event1
Given Login the OVR Application
    #And Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    #And Switch into WTT event 'WTT Youth Contender Varazdin 2024'
And Switch into WTT event 'WTT Youth Star Contender Skopje 2024'
  When get the subevents from modality
  And schedule the main draw matches for youthevent
  And launch to the MatchHub
  And play the matches in the match hub
  And Umpire Logouts MatchHub
  Given Login the OVR Application
  And Switch into WTT event 'WTT Youth Star Contender Skopje 2024'
  And update the match result in the result management for 'Main draw'
  Then Logout the OVR Application
