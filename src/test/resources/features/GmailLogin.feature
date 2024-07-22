@SmokeTest1 @Edoc-04
Feature: Benutzeranmeldung


  @GmailLogin-01
  Scenario Outline: : Erfolgreiche Anmeldung mit gültigen Anmeldedaten
    Given Der Benutzer befindet sich auf der Startseite und klickt auf den Anmelden-Button
    When Der Benutzer gibt eine gültige E-Mail-Adresse und ein gültiges Password ein "<EMail>" and "<Passwort>"
    And Der Benutzer klickt auf die  Weiter Button
    Then Der Benutzer sollte die Startseite sehen
    Examples:
      | EMail                          | Passwort            |
      | softwaretesterr11@gmail.com    | softwaretesterr_11. |







