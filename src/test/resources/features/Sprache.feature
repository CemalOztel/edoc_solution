@SmokeTest @Edoc-02
Feature: Sprachwechsel Funktionalität

@Sprache-01
  Scenario: Wechsle die Sprache der Website von Deutsch zu Englisch
    Given Der Benutzer befindet sich auf der Startseite und klickt auf die Englische Sprachoption.
    Then Die Seite sollte auf Englisch sein
    When Der Benutzer klickt auf die Deutsch Sprachoption
    Then Die Seite sollte wieder auf Deutsch sein

