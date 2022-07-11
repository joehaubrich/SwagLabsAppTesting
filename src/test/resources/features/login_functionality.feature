Feature: Attempting to log in to the application using valid or invalid data functions as intended

  Scenario: Sherlock logs in to the SwagLabs application successfully
    Given he enters a valid username and password
    Then he is logged in to the application

#  Scenario: Sherlock is unable to log in to the SwagLabs application
#    Given the username and password he uses is invalid
#    Then he is unable to log in to the application

