@SmokeTest1 @Edoc-04
Feature: Benutzeranmeldung


  Background:
    Given Der Benutzer befindet sich auf der Mainseite

  @GmailLogin-01
  Scenario Outline: : Erfolgreiche Anmeldung mit gültigen Anmeldedaten
    When Der Benutzer gibt eine gültige E-Mail-Adresse und ein gültiges Password ein "<EMail>" and "<Passwort>"
    And Der Benutzer klickt auf die Schaltfläche Weiter
    Then Der Benutzer sollte die Dashboard-Seite sehen
    Examples:
      | EMail                       | Passwort            |
      | softwaretesterr11@gmail.com | softwaretesterr_11. |





