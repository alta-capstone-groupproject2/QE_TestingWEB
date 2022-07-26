#Feature: Register LamiApp
#
#  Background:
#    Given User already on the "sign up" page
#    Then "sign up" page appear
#
#  Scenario: User success "sign up"
#    When User input field "username" with "Rina"
#    And User input field "email" with "Rina@lamitest.com"
#    And User input field "password" with "initest123"
#    And User click "sign up" button
#    Then Popup message "success insert data" Appear
#
#  Scenario: User failed "sign up" with the same email
#    When User input field "username" with "agy"
#    And User input field "email" with "agyn@lamitest.com"
#    And User input field "password" with "initest123"
#    And User click "sign up" button
#    Then Popup message "email already used" Appear
#
#  Scenario: User failed "sign up" with password not filled and invalid username and email
#    When User input field "username" with "Tanta2"
#    And User input field "email" with "malta21#gmail.com"
#    And User input field "password" with ""
#    And User click "sign up" button
#    Then Popup message "Username must be filled and only alphabetic characters" Appear
#    And Popup message "Please check your email again" Appear
#    And Popup message "Please check your password again" Appear