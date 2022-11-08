Feature: Logowanie do aplikacji

  Jako uzytkownik chce miec mozliwość zalogowania się
  do aplikacji aby moc korzystac z zaawansowanych funkcji systemu.

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Ligin
    Then Uzytkownik zostal poprawnie zalogowany

