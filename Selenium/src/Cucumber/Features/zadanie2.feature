Feature: New account registration

Scenario Outline: Create an account

  Given user is on authentication page
  When user inputs registration email as "<email>"
  And user clicks create an account button
  When user fills form with data "<firstName>", "<lastName>" and "<password>"
  And user clicks register button
  Then user is registered

  Examples:

  |firstName|lastName|email            |password|
  |Mariola  |Kowalska|mail9@test34.com|qwerty123|
  |Stefan  |Siarzewski|mail8@test323.com|qwerty321|

