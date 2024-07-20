package edoc_solution.step_definitions;

import edoc_solution.pages.HamburgerMenuPage;
import edoc_solution.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HamburgerMenu_StepDefs {
    HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();


    @Given("Der Benutzer befindet sich auf der Startseite und klickt auf das Hamburger-Menü")
    public void der_benutzer_befindet_sich_auf_der_startseite_und_klickt_auf_das_hamburger_menü() {
        hamburgerMenuPage.ButtonCokie.click();
        hamburgerMenuPage.ButtonHamMenu.click();
    }

    @When("Der Benutzer klickt auf die Box {string}")
    public void derBenutzerKlicktAufDieBox(String value) {
        hamburgerMenuPage.MainItemClick(value);
    }

    @Then("Der Benutzer wird zur Seite Digitale Lösungen weitergeleitet")
    public void derBenutzerWirdZurSeiteDigitaleLösungenWeitergeleitet() {
        BrowserUtils.verifyElementDisplayed(hamburgerMenuPage.TextDigitaleLösungen);
    }

    @Then("Der Benutzer wird zur Seite Integrationen weitergeleitet")
    public void derBenutzerWirdZurSeiteIntegrationenWeitergeleitet() {
        BrowserUtils.verifyElementDisplayed(hamburgerMenuPage.TextIntegrationen);
    }

    @Then("Der Benutzer wird zur Seite Managed Services weitergeleitet")
    public void derBenutzerWirdZurSeiteManagedServicesWeitergeleitet() {
        BrowserUtils.verifyElementDisplayed(hamburgerMenuPage.TextManagedServices);
    }

    @Then("Der Benutzer wird zur Seite Unsere Kunden weitergeleitet")
    public void derBenutzerWirdZurSeiteUnsereKundenWeitergeleitet() {
        BrowserUtils.verifyElementDisplayed(hamburgerMenuPage.TextUnsereKunden);
        System.out.println(hamburgerMenuPage.TextUnsereKunden.getText());

    }

    @Then("Der Benutzer wird zur Seite Warum edoc weitergeleitet")
    public void derBenutzerWirdZurSeiteWarumEdocWeitergeleitet() {
        BrowserUtils.verifyElementDisplayed(hamburgerMenuPage.TextWarumEdoc);
    }
}
