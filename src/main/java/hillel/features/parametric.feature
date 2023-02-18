@ALL
Feature: Checking WIKI tabs text
  Scenario Outline: open WikiPage
    When I open WikiPage "https://<country>.wikipedia.org/"
    Then check the text of all tabs
      |    | tab1       |tab2  |tab3                |tab4              |
      | fr | Discussion |Lire  |Voir le texte source|Voir l`historique |
      | de | Diskussion |Lesen |Quelltext anzeigen  |Versionsgeschichte|
      | it | Discussione|Leggi |Visualizza sorgente |Cronologia        |
      | en | Talk       |Read  |View source         |View history      |

    Examples:
      | country |
      | en      |
      | fr      |
      | it      |
      | de      |