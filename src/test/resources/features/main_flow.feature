Feature: main

#  Scenario: Admin Create Culture
#    Given User already on the "landing" page
#    And User click "login" menu
#    Then "login" page appear
#    When User input field "email" with "admin@gmail.com"
#    And User input field "password" with "admin123"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#    Then "admin" page appear
#    When User click "Culture" menu
#    Then List culture page admin appear
#    When User click add button
#    Then "Add Culture" page appear
#    When User input field "title" with "Reog"
#    And User upload file in directory "/home/agy/IdeaProjects/qe-testing-web/src/test/resources/payload/reog.jpg" for "add culture"
#    And User input field "city culture" with "Ponorogo"
#    And User input field "detail" with "Lorem Ipsum"
#    And User click "Add" button
#    Then Popup message "Success to insert culture" Appear
#    When User click "OK"
#    Then "Add Culture" page appear
#
#  Scenario: User see culture detail
#    Given User already on the "landing" page
#    And User click "login" menu
#    Then "login" page appear
#    When User input field "email" with "malta21@gmail.com"
#    And User input field "password" with "1234567"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#    Then "dashboard user" page appear
#    When User click "Cultures" menu
#    Then "cultures" page appear
#    When User click data culture
#    Then "culture detail" page appear
#
#  Scenario: User Report Culture
#    Given User already on the "landing" page
#    And User click "login" menu
#    Then "login" page appear
#    When User input field "email" with "malta21@gmail.com"
#    And User input field "password" with "1234567"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#    Then "dashboard user" page appear
#    When User click "Cultures" menu
#    Then "cultures" page appear
#    When User click data culture
#    Then "culture detail" page appear
#    When User input field "report culture" with "Kurang Detail"
#    And User click "submit report culture" button
#    Then Popup message "Success to insert culture report" Appear

  Scenario: Admin check report culture
    Given User already on the "landing" page
    And User click "login" menu
    Then "login" page appear
    When User input field "email" with "admin@gmail.com"
    And User input field "password" with "admin123"
    And User click "login" button
    Then Popup message "login success" Appear
    When User click "OK"
    Then "admin" page appear
    When User click "Culture" menu
    Then List culture page admin appear
    When User click "detail culture" button
    Then Reports culture appear