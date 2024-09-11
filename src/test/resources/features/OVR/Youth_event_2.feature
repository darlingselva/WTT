Feature: OVR portal - Verifying Youth event - Main draw standing

  @OVR
  Scenario: To verify the Youth event - Main draw standing
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Star Contender Skopje 2024'
    When get the subevents from modality
    And create draw for youth event using load modality functionality round of 'KO16 Direct KO Bo5'
    And schedule the main draw matches for youthevent
    And launch to the MatchHub
    And play the matches in the match hub
    And Umpire Logouts MatchHub
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Star Contender Skopje 2024'
    And update the match result in the result management for 'Main draw'
    Then Logout the OVR Application
