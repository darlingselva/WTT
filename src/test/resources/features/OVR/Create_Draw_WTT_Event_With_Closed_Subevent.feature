Feature: OVR portal - create draw WTT event feature

  @OVR
  Scenario: To verify the OVR Create draw WTT Event with Closed sub Events
    Given Login the admin Application
    And Admin portal event creation
    And Logout admin portal application
    When Login the admin Application
    And create the subevent 'Closed' in the admin portal
    And Logout admin portal application
    Then Login the admin Application
    And Event publish into the admin portal to OES
    And Logout admin portal application
    Given Login the OES Application
    When OEs player entry details
    Then Logout the OES Application
    Given Login the OES Application
    When EVent Publish OES into OVR
    Then Logout the OES Application

  Scenario Outline: To verify the create the draw for the sub event
    Given Login the OVR Application
    And Switch WTT event
    When create draw for subevent of '<Sub_event_name>' operation '<Operation>' Round of '<Round_Categories>'
    Then Logout the OVR Application

    Examples:
      | Sub_event_name | Operation | Round_Categories |
      | Men's singles | Load Modality | KO16 Direct KO Bo5 |
      | Women's Singles | Load Modality | KO16 Direct KO Bo5 |

  Scenario Outline: To verify the OVR Schedule
    Given Login the OVR Application
    And Switch WTT event
    And User Create schedule for "<Sub event>" and Enters "<NoOfMatch>" and Enters "<Start time>" and Enters "<Duration>" and Enters "<FromTable>" and Enters "<ToTable>"
    And User Publish and move Schedule to StartList
    And User Verify Schedule in Units Board
    Then Logout the OVR Application
    Examples:
      | Sub event | NoOfMatch | Start time | Duration | FromTable | ToTable |
      | U19 Boys Singles | 4  | 12:00  | 10      | 1           | 6      |
      | U19 Girls Singles | 4 | 15:00 | 10     | 2          | 6      |

