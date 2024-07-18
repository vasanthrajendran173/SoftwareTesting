Feature: To validate the login function of amazon web app

Scenario: To validate the valid or invalid username
    Given To launch the browser and maximize the window
    When To launch the URL of the amazon web app
    And To click the sign in button
    And To enter the valid or invalid mail ID
    And To click the continue button
    Then To close the entire browser
