Feature: OVR portal - Verifying Youth event - Group standing

  @OVR
  Scenario: To verify the Youth event - Group standing
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Star Contender 2024'
    When get the subevents from modality
    And create draw using pool functionality
    When get the round of matches for pool standing
    And schedule the pool standing matches
    And launch to the MatchHub
    And play the matches in the match hub
    And Umpire Logouts MatchHub
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Star Contender Skopje 2024'
    And update the match result in the result management for 'Group standing'
    Then Logout the OVR Application
