@Admin_OES_lite_para
@Admin_OES_lite
@Para_Paralympic_Classes
Feature: Admin OES lite portal - para Para_Paralympic_Classes scenarios


  Scenario: Admin OES lite portal - para Para_Paralympic_Classes scenarios
    Given Login the admin Application
    And Paralympic Classes option page
    And Create Paralympic Classes button in the Paralympic Classes option page
    And Create Paralympic Classes using positive values
    And Create Paralympic Classes without enter the Paralympic Class Name fields
    And Create Paralympic Classes without select the Impairment Group dropdown field
    And Create Paralympic Classes Impairment Group dropdown field values
    And Create Paralympic Classes without enter the Description fields
    And Create Paralympic Classes without enter the Class Id fields
    And Create Paralympic Classes disable Action toggle
    And Create Paralympic Classes cancel the popup window
    And Edit Paralympic Classes from data table
    And Edit Paralympic Classes from data table using edit Paralympic Class Name field
    And Edit Paralympic Classes from data table using edit Description field
    And Edit Paralympic Classes from data table using edit Class Id field
    And Edit Paralympic Classes from data table using edit all fields
    And Edit Paralympic Classes from data table using edit Active status
    And Edit Paralympic Classes from data table using empty value for Paralympic Class Name field
    And Edit Paralympic Classes from data table using empty value for Impairment Group field
    And Edit Paralympic Classes from data table using empty value for Impairment Group field
    And Edit Paralympic Classes from data table using empty value for Description field
    And Edit Paralympic Classes from data table using empty value for Class Id field
    And Edit Paralympic Classes from data table using empty value for all fields
    And Edit Paralympic Classes from data table click on cancel button
    And search field in the Paralympic Classes data table
    And Delete Paralympic Classes from data table