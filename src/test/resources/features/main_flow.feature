Feature: main
#
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
#    When User click add button "culture admin"
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
#
#  Scenario: Admin check report culture
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
#    When User click "detail culture" button
#    Then Reports culture appear
#
#  Scenario: User A create event
#    Given User already on the "landing" page
#    And User click "login" menu
#    Then "login" page appear
#    When User input field "email" with "upgradeaccount1@lamitest.com"
#    And User input field "password" with "initest"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#    Then "dashboard user" page appear
#    When User click "My Event" menu
#    Then "my event" page appear
#    When User click add button "event user"
#    Then "apply event user" page appear
#    When User upload file in directory "/home/agy/IdeaProjects/qe-testing-web/src/test/resources/payload/pdf-test.pdf" for "Document Event"
#    And User upload file in directory "/home/agy/IdeaProjects/qe-testing-web/src/test/resources/payload/reog.jpg" for "Photo Event"
#    And User input field "Name" with "Reog Ponorogo Contest"
#    And User input field "Host" with "Dolphin Yusup Nugroho"
#    And User input field "Phone" with "6282197521706"
#    And User input field "Date Start" with "29-07-2022:1653"
#    And User input field "Date End" with "10-08-2022:1653"
#    And User input field "Price" with "20000"
#    And User input field "Detail" with "Lorem Ipsum"
#    And User input field "City Event" with "Ponorogo"
#    And User input field "Address Events" with "Jalan Sektor VII"
#    And User click "apply" button
#    Then Popup message "success insert event" Appear
#    When User click "OK"
#    Then Content "Reog Ponorogo Contest" appear in "My Event"

#  Scenario: Admin Accept Event
#    Given User already on the "landing" page
#    And User click "login" menu
#    Then "login" page appear
#    When User input field "email" with "admin@gmail.com"
#    And User input field "password" with "admin123"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    When User click "OK"
#    Then "admin" page appear
#    When User click "Detail Event Submission" button
#    And User click "Accept Event" button
#    And User click "OK"
#    Then Popup message "sucsess update event" Appear
#    When User click "OK"

  Scenario: User join event
    Given User already on the "landing" page
    And User click "login" menu
    Then "login" page appear
    When User input field "email" with "upgradeaccount2@lamitest.com"
    And User input field "password" with "initest"
    And User click "login" button
    Then Popup message "login success" Appear
    When User click "OK"
    Then "dashboard user" page appear
    When User click "events" menu
    Then "events" page appear
    When User click data "event"
    And User click "Join" button
    And User click "Yes, Join Event!"
    And User click "Generate"
#    And User copy virtual account number
#    And User click "Move To Payment"
#    And User paste to field "VA Number"
#    And User click "Inquire"
#    And User click "Pay"
#    Then Popup message "Payment Success" Appear