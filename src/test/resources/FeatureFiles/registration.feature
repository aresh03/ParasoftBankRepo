Feature: Registration Functionality

  Scenario: User should be able to register by providing only required details
    Given User is on index page
    When User clicks on register link
    Then registration page will display
    And User enters First Name "John"
    And User enters Last Name "Doe"
    And User enters Address "Green Apartments"
    And User enters City "Hyderabad"
    And User enters State "Telangana"
    And User enters Zip Code "500003"
    And User enters SSN "1234"
    And User enters Username "John123"
    And User enters Password "JohnDoe@1234"
    And User enters Password "JohnDoe@1234" again for confirmation
    Then User clicks on Register button
