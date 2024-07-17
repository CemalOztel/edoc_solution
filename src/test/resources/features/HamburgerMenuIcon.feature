@a
Feature:Klicken Sie auf und öffnen Sie alle Main-Item-Seiten im Hamburger-Menü

  Background:
    Given Der Benutzer befindet sich auf der Startseite und klickt auf das Hamburger-Menü

  Scenario: Klicken auf das Main-Item Digitale Lösungen im Hamburger-Menü
    When Der Benutzer klickt auf die Box "Digitale Lösungen"
    Then Der Benutzer wird zur Seite Digitale Lösungen weitergeleitet

  Scenario: Klicken auf das Main-Item Integrationen im Hamburger-Menü
    When Der Benutzer klickt auf die Box "Integrationen"
    Then Der Benutzer wird zur Seite Integrationen weitergeleitet

  Scenario: Klicken auf das Main-Item Managed Services im Hamburger-Menü
    When Der Benutzer klickt auf die Box "Managed Services"
    Then Der Benutzer wird zur Seite Managed Services weitergeleitet

  Scenario: Klicken auf das Main-Item Unsere Kunden im Hamburger-Menü
    When Der Benutzer klickt auf die Box "Unsere Kunden"
    Then Der Benutzer wird zur Seite Unsere Kunden weitergeleitet

  Scenario: Klicken auf das Main-Item Warum edoc im Hamburger-Menü
    When Der Benutzer klickt auf die Box "Warum edoc"
    Then Der Benutzer wird zur Seite Warum edoc weitergeleitet

