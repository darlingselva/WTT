Feature: OVR portal - Create the draw for the Sub event

  @OVR
  Scenario: To verify the create the draw for the sub event
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    When create draw for subevent of 'Mens single'
    Then Logout the OVR Application