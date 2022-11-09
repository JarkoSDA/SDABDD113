Feature: Logowanie do aplikacji

  Jako uzytkownik chce miec mozliwość zalogowania się
  do aplikacji aby moc korzystac z zaawansowanych funkcji systemu.

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany


  Scenario: Niepoprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje niepoprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany



  Scenario: Poprawne logowanie do aplikacji (druga wersja)
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje "SuperSecretPassword!" w pole haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany


  Scenario: Nieoprawne logowanie do aplikacji (druga wersja)
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje "bla" w pole haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany


  @now
  Scenario: Nieoprawne logowanie do aplikacji (druga wersja)
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "    " w pole username
    And Uzytkownik wpisuje "    " w pole haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany

