@c
Feature: Searchfunktion auf der Webseite

  Background:
    Given Der Benutzer befindet sich auf der Startseite und klickt auf das Such Icon

  @Edoc-01
  Scenario Outline: Klicken Sie auf das Suchsymbol und führen Sie eine Suche durch
    When der Benutzer in das Suchbegriff "<Suchbegriff>" eingibt
    And Der Benutzer drückt den „Suchen“-Button.
    Then Der Benutzer sollte bestätigen, ob der gesuchte Schlüsselwort als Result "<Result>" angezeigt wird.
    Examples:
      | Suchbegriff | Result    |
      | München     | München   |
      | Stuttgart   | Stuttgart |
      | Berlin      | Berlin    |
      | edoc        | edoc      |

