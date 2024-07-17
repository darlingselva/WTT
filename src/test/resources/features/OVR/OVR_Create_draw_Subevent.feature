Feature: OVR portal - Create the draw for the Sub event

  @OVR
  Scenario Outline: To verify the create the draw for the sub event
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    When create draw for subevent of '<Sub_event_name>' operation '<Operation>' Round of '<Round_Categories>'
    Then Logout the OVR Application

    Examples:
    | Sub_event_name | Operation | Round_Categories |
    | U19 Boys Singles | Load Modality | KO16 Direct KO Bo5 |
    | U19 Girls Singles | Load Modality | KO16 Direct KO Bo5 |
    | U15 Mixed Doubles |  Load Modality | KO16 Direct KO Bo5 |
