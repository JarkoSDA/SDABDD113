package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class Logowanie {

    static WebDriver driver;

    @BeforeAll
    public static void setDriver(){
        System.out.println("Uruchomienie przegladarki przed wszystkimi scenariuszami testowymi");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void before(){
        System.out.println("Uruchomienie przegladarki przed każdym scenariuszem testowym");
    }


    @Given("Uzytkownik otwiera przegladarke")
    public void test_uzytkownik_otwiera_przegladarke(){
        System.out.println("Uzytkownik otworzyl przegladarke");
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Jarek/chromedriver_win32/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }
    @Given("Uzytkownik wpisuje adres https:\\/\\/the-internet.herokuapp.com\\/login")
    public void uzytkownik_wpisuje_adres_https_the_internet_herokuapp_com_login() {
        System.out.println("Uzytkownik wpisuje adres strony internetowej");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

     @Given("Uzytkownik wpisuje adres {string}")
     public void UzytkownikWpisujeAdres(String url)   {
         driver.navigate().to(url );

    }
    @When("Uzytkownik wpisuje poprawny username")
    public void uzytkownik_wpisuje_poprawny_username() {
        System.out.println("Uzytkownik wpisuje poprawny login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @When("Uzytkownik wpisuje {string} w pole username")
    public void UzytkownikWpisujeWPoleUsername (String nazwaUzytkownika) {
        driver.findElement(By.id("username")).sendKeys(nazwaUzytkownika);
    }
    @When("Uzytkownik wpisuje poprawne haslo")
    public void uzytkownik_wpisuje_poprawne_haslo() {
        System.out.println("Uzytkownik wpisuje poprawne haslo");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }

        @When("Uzytkownik wpisuje {string} w pole haslo")
        public void uzytkownik_wpisuje_w_pole_haslo (String haslo) {
            driver.findElement(By.id("password")).sendKeys(haslo);


    }
    @When("Uzytkownik wpisuje niepoprawne haslo")
    public void uzytkownikWpisujeNiePoprawneHaslo(){
        System.out.println("Uzytkownik wpisuje niepoprawne haslo");
        driver.findElement(By.id("password")).sendKeys("haslo");
    }
    @When("Uzytkownik klika przycisk Login")
    public void uzytkownik_klika_przycisk_ligin() {
        System.out.println("Uzytkownik klikaprzycisk login");
        driver.findElement(By.tagName("button")).click();
    }
    @Then("Uzytkownik zostal poprawnie zalogowany")
    public void uzytkownik_zostal_poprawnie_zalogowany() {
        System.out.println("Uzytkownik zostal poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        //driver.close();
    }

    @Then("Uzytkownik nie zostal poprawnie zalogowany")
    public void UzytkowniekNieZostalPoprawnieZalogowany(){
        System.out.println("Uzytkownik nie zostal poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
    }



        @When("^Uzytkownik wpisuje (.+) w pole username$")
        public void uzytkownik_wpisuje_w_pole_username2(String nazwauzytkownika) {
            driver.findElement(By.id("username")).sendKeys(nazwauzytkownika);
        }

        @And("^Uzytkownik wpisuje (.+) w pole haslo$")
        public void uzytkownik_wpisuje_w_pole_haslo2(String haslo) {
            driver.findElement(By.id("password")).sendKeys(haslo);
        }

        @AfterAll
        public static void tearDown() {
            driver.close();
        }
    }

