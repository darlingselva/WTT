Feature: OVR portal - Create the draw and scedule for the Sub event

  @OVR
  Scenario Outline: To verify the create the draw for the sub event
    Given Login the OVR Application
    And Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    When create draw for subevent of '<Sub_event_name>' operation '<Operation>' Round of '<Round_Categories>'
    Then Logout the OVR Application

    Examples:
      | Sub_event_name | Operation | Round_Categories |
      | U19 Boys Singles  | Load Modality | KO16 Direct KO Bo5 |
      | U19 Girls Singles | Load Modality | KO16 Direct KO Bo5 |


  Scenario Outline: To verify the OVR Schedule
    Given Login the OVR Application
    When Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    And User Create schedule for "<Sub event>" and Enters "<NoOfMatch>" and Enters "<Start time>" and Enters "<Duration>" and Enters "<FromTable>" and Enters "<ToTable>"
    And User Publish and move Schedule to StartList
    And User Verify Schedule in Units Board
    Then Logout the OVR Application
    Examples:
      | Sub event | NoOfMatch | Start time | Duration | FromTable | ToTable |
      | U19 Boys Singles | 4  | 12:00  | 10      | 1           | 6      |
      | U19 Girls Singles | 4 | 15:00 | 10     | 2          | 6      |

