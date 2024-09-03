Feature: OVR portal - Create the draw for all the Sub events

  @OVR
  Scenario Outline: To verify the create the draw for all the sub event
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    #When get the subevents from modality
    #And create draw using load modality functionality round of 'KO16 Direct KO Bo5'
    #And create draw using pool functionality
    When get the round of matches for pool standing
    And schedule the pool standing matches
    Then Logout the OVR Application

    Examples:
      | Sub_event_name | Operation | Round_Categories |
      | U19 Boys Singles  | Load Modality | KO16 Direct KO Bo5 |
