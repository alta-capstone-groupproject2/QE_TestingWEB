#Feature: Upgrade Account
#
#  Background:
#    Given User already on the "login" page
#    Then "login" page appear
#    When User input field "email" with "upgrade_account1@lamitest.com"
#    And User input field "password" with "initest"
#    And User click "login" button
#    Then Popup message "login success" Appear
#    And User click "OK"
#
#  Scenario: User success apply to upgrade account
#    When User click "upgrade account" button
#    Then "Upgrade Account" page appear
#    When User upload file in directory "src/test/resources/payloadpdf-test.pdf"
#    And User input field "store" with "Toko Mainan Khas Daerah Lamongan"
#    And User input field "owner" with "Mandala Tri"
#    And User input field "phone" with "897257906"
#    And User input field "city" with "Lamongan"
#    And User input field "address" with "Jl. Dengok"
#    And User click "apply" button