#Feature: Login
#
#  Background:
#    Given User already on the "login" page
#    Then "login" page appear
#
#  Scenario: User success login
#    When User input field "email" with "malta21@gmail.com"
#    And User input field "password" with "1234567"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#
#  Scenario: User login invalid email
#    When User input field "email" with "malta2202020202_test@gmail.com"
#    And User input field "password" with "1234567"
#    And User click "login" button
#    Then Popup message "user not found" Appear
#
#  Scenario: User login invalid password
#    When User input field "email" with "malta21@gmail.com"
#    And User input field "password" with "123x123"
#    And User click "login" button
#    Then Popup message "wrong password" Appear