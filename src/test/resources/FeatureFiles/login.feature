Feature: Login Functionality

  Scenario Outline: User Logins to application with valid username and valid password
    Given User is on Login Page
    When User enters valid username "<username>" and password "<password>"
    And User clicks on login button
    Then User navigates to Home Page

    Examples: 
      | username | password          |
      | Sarah123 | SarahWilliams@123 |

  Scenario Outline: User should not be allowed to Login to application with invalid username and valid password
    Given User is on Login Page
    When User enters invalid username "<username>" and valid password "<password>"
    And User clicks on login button
    Then User should not be able to login to application with invalid username

    Examples: 
      | username  | password          |
      | Sarah1234 | SarahWilliams@123 |

  Scenario Outline: User should not be allowed to Login to application with valid username and invalid password
    Given User is on Login Page
    When User enters valid username "<username>" and invalid password "<password>"
    And User clicks on login button
    Then User should not be able to login to application with invalid password

    Examples: 
      | username | password           |
      | Sarah123 | SarahWilliams@1234 |

  Scenario Outline: User should not be allowed to Login to application with only providing valid username and not providing password
    Given User is on Login Page
    When User enters valid username "<username>" and not enters password
    And User clicks on login button
    Then User should not be able to login to application with only username

    Examples: 
      | username |
      | Sarah123 |

  Scenario Outline: User should not be allowed to Login to application by not entering username and entering only valid password
    Given User is on Login Page
    When User not enters username and enters only valid password "<password>"
    And User clicks on login button
    Then User should not be able to login to application with only password

    Examples: 
      | password          |
      | SarahWilliams@123 |

  Scenario Outline: User should not be allowed to Login to application with invalid username and invalid password
    Given User is on Login Page
    When User enters invalid username "<username>" and invalid password "<password>"
    And User clicks on login button
    Then User should not be able to login to application with invalid username and password

    Examples: 
      | username  | password           |
      | Sarah1234 | SarahWilliams@1234 |

  Scenario: User should not be allowed to login to application without entering username and password
    Given User is on Login Page
    And User clicks on login button
    Then User should not be able to login to application without entering username and password
