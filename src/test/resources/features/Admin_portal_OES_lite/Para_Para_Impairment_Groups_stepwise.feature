@Admin_OES_lite_para
@Admin_OES_lite
@Para_Para_Impairment_Groups
Feature: Admin OES lite portal - para Para_Para_Impairment_Groups scenarios

  Scenario: Admin OES lite portal - para Para_Para_Impairment_Groups scenarios
    Given Login the admin Application
    And Para Impairment Groups option page
    And Create Para Impairment Groups button in the Para Impairment Groups option page
    And Create Para Impairment Groups using positive values
    And Create Para Impairment Groups without enter the name fields
    And Create Para Impairment Groups without enter the code fields
    And Create Para Impairment Groups disable Action toggle
    And Create Para Impairment Groups cancel the popup window
    And Edit Para Impairment Groups from data table
    And Edit Para Impairment Groups from data table using edit name field
    And Edit Para Impairment Groups from data table using edit Code field
    And Edit Para Impairment Groups from data table using edit both name and Code  field
    And Edit Para Impairment Groups from data table using edit Active status
    And Edit Para Impairment Groups from data table using empty value for name field
    And Edit Para Impairment Groups from data table using empty value for Code field
    And Edit Para Impairment Groups from data table using empty value for both Name and Code field
    And Edit Para Impairment Groups from data table click on cancel button
    And search field in the Para Impairment Groups data table
    And Delete Para Impairment Groups from data table

